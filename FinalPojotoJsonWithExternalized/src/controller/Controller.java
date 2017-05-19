package controller;


import java.util.HashMap;




import com.documentum.com.DfClientX;
import com.documentum.com.IDfClientX;
import com.documentum.fc.client.DfServiceException;
import com.documentum.fc.client.IDfClient;
import com.documentum.fc.client.IDfCollection;
import com.documentum.fc.client.IDfQuery;
import com.documentum.fc.client.IDfSession;
import com.documentum.fc.client.IDfSessionManager;
import com.documentum.fc.client.IDfSysObject;
import com.documentum.fc.common.DfException;
import com.documentum.fc.common.IDfId;
import com.documentum.fc.common.IDfLoginInfo;


import customTypes.Nav_dak_content;
import customTypes.Nav_enclosure_folder;
import customTypes.Nav_file_folder;
import customTypes.Nav_main_file_folder;
import customTypes.Nav_noting_folder;
import customTypes.Nav_ns_content;

import service.ExportJson;




public class Controller {
	static IDfClientX iDfClientX;
	static IDfClient iDfClient;
	static IDfSessionManager idfSm;
	static String username = "dmadmin";
	static String pwd = "demo.demo";
	static String repo = "ncorp";
	static IDfSession session;
	static IDfCollection col = null;
	static IDfId objId = null;
	static String qry = "select * from dm_sysobject  where folder('/Paperless/Materiel Branch/DIT/NSAC/IT-0651-001/BM',descend) ";
	static String destinationLocalFolder = "D:/Yawar/Testing_folder/ExportDataHouse";
	static Nav_ns_content nav_ns_content;
	static Nav_file_folder nav_file_folder;
	static Nav_noting_folder nav_noting_folder;
	static Nav_dak_content nav_dak_content;
	static Nav_main_file_folder nav_main_file_folder;
	static Nav_enclosure_folder nav_enclosure_folder;
	static IDfSysObject sysObj;
	
	
	
	
	
	
	public static void main(String[] args) throws Exception {

		iDfClientX = new DfClientX();
		iDfClient = iDfClientX.getLocalClient();

		// creating session Manager.
		idfSm = iDfClient.newSessionManager();
		// creating IDfloginInfo
		IDfLoginInfo loginInfo = iDfClientX.getLoginInfo();
		loginInfo.setUser(username);
		loginInfo.setPassword(pwd);
		// mapping login info with session manager.
		idfSm.setIdentity(repo, loginInfo);
		session = idfSm.getSession(repo);
		
		//executing dql query for getting all object in specific location.
		IDfClientX clientX = new DfClientX();
		IDfQuery query = clientX.getQuery();
		query.setDQL(qry);
        
		//all objects in col
		col = query.execute(session, IDfQuery.DF_READ_QUERY);
		//creating root object for json so that all objected can all to the root object.
		
		ExportJson exportJson = new ExportJson();
		//iterate col and create IdfId object.
		
		while (col.next()) {

			objId = col.getId("r_object_id");
			sysObj=(IDfSysObject) session.getObject(objId);
			//through iterator,add all object to json root object.
			exportJson.jsonCreator(sysObj);
			
		}
		
	    //After added all object built the json root object and export jsonfile on destination location.
		
		exportJson.exportJson();
		
		
		//release session
		idfSm.release(session);
		System.out.println("Session released");
	}
	
	

}
