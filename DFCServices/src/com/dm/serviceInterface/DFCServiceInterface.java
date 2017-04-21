package com.dm.serviceInterface;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface DFCServiceInterface {
@WebMethod
	String createCabinet(String cabName);
@WebMethod
	String createFolder(String path,String folder);
@WebMethod
	String createDoc(String objectName,String folderName,String path);
}
