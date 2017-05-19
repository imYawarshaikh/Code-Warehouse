package customTypes;





import com.documentum.fc.client.IDfSysObject;
import com.documentum.fc.common.DfException;

public class Nav_enclosure_folder {

		private String object_name; 
		private String title;
		private String subject;
		private String r_object_type;
		private String a_content_type;
		
		
		
		
		
		public Nav_enclosure_folder(IDfSysObject sysObject) throws DfException {
	
			this.object_name = sysObject.getString("object_name");
			this.title =sysObject.getString("title");
			this.subject =sysObject.getString("subject");
			this.r_object_type =sysObject.getString("r_object_type");
			this.a_content_type =sysObject.getString("a_content_type");
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
	

	
	
	
}
