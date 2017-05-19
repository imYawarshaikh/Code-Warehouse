package service;

import java.io.FileNotFoundException;

import java.io.PrintWriter;
import java.util.HashMap;

import org.apache.commons.io.FilenameUtils;

import com.documentum.fc.client.IDfSysObject;
import com.documentum.fc.common.DfException;
import com.google.gson.Gson;

import customTypes.Nav_dak_content;
import customTypes.Nav_enclosure_folder;
import customTypes.Nav_file_folder;
import customTypes.Nav_main_file_folder;
import customTypes.Nav_noting_folder;
import customTypes.Nav_ns_content;


public class ExportJson {

	Nav_ns_content nav_ns_content;
	Nav_file_folder nav_file_folder;
	Nav_noting_folder nav_noting_folder;
	Nav_dak_content nav_dak_content;
	Nav_main_file_folder nav_main_file_folder;
	Nav_enclosure_folder nav_enclosure_folder;
    String ObjectName;
    //RootTest rootObject= new RootTest();
    HashMap<String, Object> rootObject= new HashMap<String,Object>();
    
  
	public void exportJson() throws FileNotFoundException {

		Gson gson = new Gson();
		String jsonInString = gson.toJson(rootObject);
		PrintWriter out = new PrintWriter("d:/abc.json");
		out.println(jsonInString);
		out.close();

		System.out.println("Json created Successfully. ");

	}
	
	public void jsonCreator(IDfSysObject sysObj) throws FileNotFoundException, DfException {

		/*
		 * For adding all object to json Root object. Populate Custom type
		 * object as per file Type. And return hashmap object after adding
		 * custom type object to it.
		 *
		 */
	
		if (sysObj.getTypeName().equals("nav_noting_folder")) {
			ObjectName=FilenameUtils.removeExtension(sysObj.getObjectName());
			rootObject.put(ObjectName,new Nav_noting_folder(sysObj)  );
		} else {

			if (sysObj.getTypeName().equals("nav_file_folder")) {
				System.out.println("nav_file_folder     :" + sysObj.getObjectName());
				ObjectName=FilenameUtils.removeExtension(sysObj.getObjectName());
				rootObject.put(ObjectName,new Nav_file_folder(sysObj));

			} else {

				if (sysObj.getTypeName().equals("nav_enclosure_folder")) {
					System.out.println("nav_enclosure_folder     :" + sysObj.getObjectName());
					ObjectName=FilenameUtils.removeExtension(sysObj.getObjectName());
					rootObject.put(ObjectName,new Nav_enclosure_folder(sysObj));
				} else {

					if (sysObj.getTypeName().equals("nav_ns_content")) {
						System.out.println("nav_ns_content     :" + sysObj.getObjectName());
						ObjectName=FilenameUtils.removeExtension(sysObj.getObjectName())+"_"+sysObj.getObjectId();
						
						rootObject.put(ObjectName,new Nav_ns_content(sysObj));
					} else {

						if (sysObj.getTypeName().equals("nav_main_file_folder")) {
							System.out.println("nav_main_file_folder     :" + sysObj.getObjectName());

							rootObject.put(ObjectName,new Nav_main_file_folder(sysObj));

						} else {

							if (sysObj.getTypeName().equals("nav_dak_content")) {
								System.out.println("Nav_dak_content     :" + sysObj.getObjectName());
								ObjectName=FilenameUtils.removeExtension(sysObj.getObjectName())+"_"+sysObj.getObjectId();
								
								// rootObject.setNav_dak_content(new
								// Nav_dak_content(sysObj));

		                     rootObject.put(ObjectName,new Nav_dak_content(sysObj));

							}

						}

					}

				}

			}

		}


	}

	

}
