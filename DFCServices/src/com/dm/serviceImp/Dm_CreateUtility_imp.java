package com.dm.serviceImp;

import java.io.FileOutputStream;
import java.sql.ResultSet;


import com.dm.service.Dm_CreateUtility;

import com.documentum.com.DfClientX;
import com.documentum.com.IDfClientX;
import com.documentum.fc.client.DfAuthenticationException;
import com.documentum.fc.client.DfClient;
import com.documentum.fc.client.DfIdentityException;
import com.documentum.fc.client.DfPrincipalException;
import com.documentum.fc.client.DfQuery;
import com.documentum.fc.client.DfServiceException;
import com.documentum.fc.client.IDfClient;
import com.documentum.fc.client.IDfCollection;
import com.documentum.fc.client.IDfDocbaseMap;
import com.documentum.fc.client.IDfDocument;
import com.documentum.fc.client.IDfEnumeration;
import com.documentum.fc.client.IDfFolder;
import com.documentum.fc.client.IDfFormat;
import com.documentum.fc.client.IDfPersistentObject;
import com.documentum.fc.client.IDfQuery;
import com.documentum.fc.client.IDfSession;
import com.documentum.fc.client.IDfSessionManager;
import com.documentum.fc.client.search.IDfExpressionSet;
import com.documentum.fc.client.search.IDfQueryBuilder;
import com.documentum.fc.client.search.IDfQueryManager;
import com.documentum.fc.client.search.IDfQueryProcessor;
import com.documentum.fc.client.search.IDfResultEntry;
import com.documentum.fc.client.search.IDfResultsSet;
import com.documentum.fc.client.search.IDfSearchService;
import com.documentum.fc.client.search.IDfSearchSource;
import com.documentum.fc.client.search.IDfSearchSourceMap;
import com.documentum.fc.client.search.IDfSimpleAttrExpression;
import com.documentum.fc.common.DfException;
import com.documentum.fc.common.IDfLoginInfo;
import com.documentum.fc.common.IDfValue;
import com.documentum.operations.IDfExportOperation;
import com.documentum.operations.IDfFile;
import com.documentum.operations.IDfImportOperation;
import com.documentum.xml.xdql.IDfXmlQuery;


public class Dm_CreateUtility_imp implements Dm_CreateUtility {
	IDfClientX iDfClientX;
	IDfClient iDfClient;
	IDfSessionManager  idfSm;
	String username="dmadmin";
	String pwd="demo.demo";
	String repo="ncorp";
	IDfSession session;


	
	public Dm_CreateUtility_imp() {
		try{
		iDfClientX= new DfClientX();
		iDfClient = iDfClientX.getLocalClient();

		// creating session Manager.
		idfSm = iDfClient.newSessionManager();
		// creating IDfloginInfo
		IDfLoginInfo loginInfo = iDfClientX.getLoginInfo();
		loginInfo.setUser(username);
		loginInfo.setPassword(pwd);
		// mapping logininfo with session manager.
		idfSm.setIdentity(repo, loginInfo);
		session = idfSm.getSession(repo);
		}catch(Exception e){System.out.println(e);}
		
		
	}


	@Override
	public void createCabinet(String cabinetName) {
		// Cabinet creation
	try{
		
		IDfFolder myCab = (IDfFolder) session.newObject("dm_cabinet");
		myCab.setObjectName(cabinetName);
		myCab.save();
	}catch(Exception e){
	System.out.println(e);}
	}


	@Override
	public void createFolder(String path, String folder)  {
		// TODO Auto-generated method stub
		try{
		
			
		IDfFolder myFolder = (IDfFolder) session.newObject("dm_folder");
		myFolder.setObjectName(folder);
		myFolder.link(path);
		myFolder.save();
		}catch(Exception e){
		System.out.println(e);}
		}
		
		
	


	@Override
	public void createDoc(String objectName, String folderName, String path)
			 {
	
		// TODO Auto-generated method stub
		try{
			//foldername with cabinet name example: " /Testing_Cabinate_Y/Folder_Y2"
		System.out.println("folderName"+folderName);
		IDfFolder idfFolder=(IDfFolder)session.getFolderByPath(folderName);
		//set doc object and define its type.
		IDfDocument document=(IDfDocument) session.newObject("dm_document");
		//set name of document
		document.setObjectName(objectName);
		//set content type
		document.setContentType("crtext");
		//insert content in document.
		document.setFile(path);
		//location of document where u want to save
		document.link(idfFolder.getObjectId().getId());
		//save the doc in repo (Actually file save after firing save method)
		document.save();
		}catch(Exception e){System.out.println(e);}
	
	}







	

}
