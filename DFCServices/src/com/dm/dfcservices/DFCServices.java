package com.dm.dfcservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.dm.service.Dm_CreateUtility;

import com.dm.serviceImp.Dm_CreateUtility_imp;
import com.dm.serviceInterface.DFCServiceInterface;
import com.documentum.fc.common.DfException;
@WebService
public class DFCServices implements DFCServiceInterface{
	Dm_CreateUtility createUtility= new Dm_CreateUtility_imp();
	
	@WebMethod
	public String createCabinet(String cabName){
		
		try {
			createUtility.createCabinet(cabName);
		} catch (DfException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Cabinet Created";
	}
	@WebMethod
    public String createFolder(String path,String folder){
		
	try {
		createUtility.createFolder(path, folder);
	} catch (DfException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "Folder Created";
	}
	@WebMethod
   public String createDoc(String objectName,String folderName,String path){
	try {
		createUtility.createDoc(objectName, folderName, path);
	} catch (DfException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "Doc Created";
	
    }
		
			
	
	
}
