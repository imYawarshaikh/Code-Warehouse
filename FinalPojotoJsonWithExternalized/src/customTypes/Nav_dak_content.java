package customTypes;

import com.documentum.fc.client.IDfSysObject;
import com.documentum.fc.common.DfException;

public class Nav_dak_content {


	private String object_name; 
	private String title;
	private String subject;
	private String r_object_type;
	private String a_content_type;
	private String index_from;
	private String external_email;
	private String dak_info;;
	private String reference_object_ids;
	private String approver;
	private String dak_internal_wf;
	private String dak_by;
	private String index_no;
	private String dak_copy_to;
	private String dak_type;
	private String dak_to;
	private String action_by;
	private String dak_status;
	private String file_folder_obj_id;
	private String classification;
	
	
	
	public Nav_dak_content(IDfSysObject sysObject) throws DfException {
		
		System.out.println("hit"); //$NON-NLS-1$
		try{
		this.object_name = sysObject.getString(Messages.getString("Nav_dak_content.1")); //$NON-NLS-1$
		this.title =sysObject.getString(Messages.getString("Nav_dak_content.2")); //$NON-NLS-1$
		this.subject =sysObject.getString(Messages.getString("Nav_dak_content.3")); //$NON-NLS-1$
		this.r_object_type =sysObject.getString(Messages.getString("Nav_dak_content.4")); //$NON-NLS-1$
		this.a_content_type =sysObject.getString(Messages.getString("Nav_dak_content.5")); //$NON-NLS-1$
		this.index_from =sysObject.getString(Messages.getString("Nav_dak_content.6")); //$NON-NLS-1$
		this.external_email =sysObject.getString(Messages.getString("Nav_dak_content.7")); //$NON-NLS-1$
		this.dak_info =sysObject.getString(Messages.getString("Nav_dak_content.8")); //$NON-NLS-1$
		this.reference_object_ids =sysObject.getString(Messages.getString("Nav_dak_content.9")); //$NON-NLS-1$
		this.approver =sysObject.getString(Messages.getString("Nav_dak_content.10")); //$NON-NLS-1$
		this.dak_internal_wf =sysObject.getString(Messages.getString("Nav_dak_content.11")); //$NON-NLS-1$
		this.dak_by =sysObject.getString(Messages.getString("Nav_dak_content.12")); //$NON-NLS-1$
		this.index_no =sysObject.getString(Messages.getString("Nav_dak_content.13")); //$NON-NLS-1$
		this.dak_copy_to =sysObject.getString(Messages.getString("Nav_dak_content.14")); //$NON-NLS-1$
		this.dak_type =sysObject.getString(Messages.getString("Nav_dak_content.15")); //$NON-NLS-1$
		this.dak_to =sysObject.getString(Messages.getString("Nav_dak_content.16")); //$NON-NLS-1$
		this.action_by =sysObject.getString(Messages.getString("Nav_dak_content.17")); //$NON-NLS-1$
		this.dak_status =sysObject.getString(Messages.getString("Nav_dak_content.18")); //$NON-NLS-1$
		this.file_folder_obj_id =sysObject.getString(Messages.getString("Nav_dak_content.19")); //$NON-NLS-1$
		this.classification =sysObject.getString(Messages.getString("Nav_dak_content.20")); //$NON-NLS-1$
		
		
		
		}catch(Exception e){
			System.out.println("Exception : "+e); //$NON-NLS-1$
		}
		
		
		System.out.println("set  with "+this.object_name); //$NON-NLS-1$
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
	public String getIndex_from() {
		return index_from;
	}
	public void setIndex_from(String index_from) {
		this.index_from = index_from;
	}
	public String getExternal_email() {
		return external_email;
	}
	public void setExternal_email(String external_email) {
		this.external_email = external_email;
	}
	public String getDak_info() {
		return dak_info;
	}
	public void setDak_info(String dak_info) {
		this.dak_info = dak_info;
	}
	public String getReference_object_ids() {
		return reference_object_ids;
	}
	public void setReference_object_ids(String reference_object_ids) {
		this.reference_object_ids = reference_object_ids;
	}
	public String getApprover() {
		return approver;
	}
	public void setApprover(String approver) {
		this.approver = approver;
	}
	public String getDak_internal_wf() {
		return dak_internal_wf;
	}
	public void setDak_internal_wf(String dak_internal_wf) {
		this.dak_internal_wf = dak_internal_wf;
	}
	public String getDak_by() {
		return dak_by;
	}
	public void setDak_by(String dak_by) {
		this.dak_by = dak_by;
	}
	public String getIndex_no() {
		return index_no;
	}
	public void setIndex_no(String index_no) {
		this.index_no = index_no;
	}
	public String getDak_copy_to() {
		return dak_copy_to;
	}
	public void setDak_copy_to(String dak_copy_to) {
		this.dak_copy_to = dak_copy_to;
	}
	public String getDak_type() {
		return dak_type;
	}
	public void setDak_type(String dak_type) {
		this.dak_type = dak_type;
	}
	public String getDak_to() {
		return dak_to;
	}
	public void setDak_to(String dak_to) {
		this.dak_to = dak_to;
	}
	public String getAction_by() {
		return action_by;
	}
	public void setAction_by(String action_by) {
		this.action_by = action_by;
	}
	public String getDak_status() {
		return dak_status;
	}
	public void setDak_status(String dak_status) {
		this.dak_status = dak_status;
	}
	public String getFile_folder_obj_id() {
		return file_folder_obj_id;
	}
	public void setFile_folder_obj_id(String file_folder_obj_id) {
		this.file_folder_obj_id = file_folder_obj_id;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	
	
	
	
	
	
	
	
}
