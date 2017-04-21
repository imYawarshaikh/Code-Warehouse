package com.dm.service;


import com.documentum.fc.client.IDfCollection;
import com.documentum.fc.client.IDfFolder;
import com.documentum.fc.client.IDfSession;
import com.documentum.fc.common.DfException;

public interface Dm_CreateUtility {

	
	
	abstract void createCabinet(String cabinetName) throws DfException;
    abstract void createFolder(String path,String folder) throws DfException;
    abstract void createDoc(String objectName,String Folder,String content) throws DfException;
    



}
