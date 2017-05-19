package customTypes;

import com.documentum.fc.client.IDfSysObject;
import com.documentum.fc.common.DfException;

public class Nav_file_folder {



	private String object_name;
	private String title;
	private String subject;
	private String r_object_type;
	private String a_content_type;

	private String file_status;
	private String file_no;
	private String residing_with;
	private String filing_date;
	private String pkl_branch;
	private String new_boolean;
	private String department;
	private String pkl_directorate;
	private String file_classification;
	private String file_priority;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Nav_file_folder(IDfSysObject sysObject) throws DfException {
		this.object_name = sysObject.getString("object_name");
		this.title =sysObject.getString("title");
		this.subject =sysObject.getString("subject");
		this.r_object_type =sysObject.getString("r_object_type");
		this.a_content_type =sysObject.getString("a_content_type");
		this.file_status =sysObject.getString(" file_status");
		this.file_no =sysObject.getString("file_no");
		this.residing_with =sysObject.getString("residing_with");
		this.filing_date =sysObject.getString("filing_date");
		this.pkl_branch =sysObject.getString("pkl_branch");
		this.new_boolean =sysObject.getString("new_boolean");
		this.department =sysObject.getString("department");
		this.pkl_directorate =sysObject.getString("pkl_directorate");
		this.file_classification =sysObject.getString("file_classification");
		this.file_priority =sysObject.getString("file_priority");
	}
	public String getObject_name() {
		return object_name;
	}
	public void setObject_name(String object_name) {
		this.object_name = object_name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getR_object_type() {
		return r_object_type;
	}
	public void setR_object_type(String r_object_type) {
		this.r_object_type = r_object_type;
	}
	public String getA_content_type() {
		return a_content_type;
	}
	public void setA_content_type(String a_content_type) {
		this.a_content_type = a_content_type;
	}
	public String getFile_status() {
		return file_status;
	}
	public void setFile_status(String file_status) {
		this.file_status = file_status;
	}
	public String getFile_no() {
		return file_no;
	}
	public void setFile_no(String file_no) {
		this.file_no = file_no;
	}
	public String getResiding_with() {
		return residing_with;
	}
	public void setResiding_with(String residing_with) {
		this.residing_with = residing_with;
	}
	public String getFiling_date() {
		return filing_date;
	}
	public void setFiling_date(String filing_date) {
		this.filing_date = filing_date;
	}
	public String getPkl_branch() {
		return pkl_branch;
	}
	public void setPkl_branch(String pkl_branch) {
		this.pkl_branch = pkl_branch;
	}
	public String getNew_boolean() {
		return new_boolean;
	}
	public void setNew_boolean(String new_boolean) {
		this.new_boolean = new_boolean;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPkl_directorate() {
		return pkl_directorate;
	}
	public void setPkl_directorate(String pkl_directorate) {
		this.pkl_directorate = pkl_directorate;
	}
	public String getFile_classification() {
		return file_classification;
	}
	public void setFile_classification(String file_classification) {
		this.file_classification = file_classification;
	}
	public String getFile_priority() {
		return file_priority;
	}
	public void setFile_priority(String file_priority) {
		this.file_priority = file_priority;
	}
		
		
		
		


	
	
 
}
