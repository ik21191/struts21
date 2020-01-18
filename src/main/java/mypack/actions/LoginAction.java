package mypack.actions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypack.beans.Location;
import mypack.beans.Student;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
public class LoginAction extends ActionSupport implements Action, ServletRequestAware, ServletResponseAware, 
ServletContextAware {

	private static final long serialVersionUID = 1L;

	private static Logger log = Logger.getLogger(LoginAction.class); 
	
	//Java Bean to hold the form parameters
    private String name;
    private String pwd;
    private List<Student> studentList;
    private Map<String,String> map;
    
    HttpServletRequest request;
    String url;
    String paramValue;
    public LoginAction(){
		log.info("LoginAction is called.");
	}
    
    public String customeMethod() throws Exception {
    	initializeStudentList();
    	log.info("execute() of LoginAction is invoked.");
    	addActionMessage("Hello this is Action message");
    	addActionMessage(getText("test.property"));
    	addActionError("Hello this is Action Error message");
    	
    	String str = request.getParameter("test");
    	
    	log.info("Getting parameter from request : " + request.getParameter("test"));
    	
    	if(str.equals("redirectme")) {
    		url = "/menu";
    		paramValue = "Hello Param";
    		return "redirect";
    	}
    	
    	if(str.equals("google")) {
    		url = "http://www.google.co.in";
    		paramValue = "Hello Param";
    		return "redirect";
    	}
    	
    	if(name.length()>1) {
        	return "SUCCESS";
        }
        else {
        	return "ERROR";
        }
    }
    
    public void initializeStudentList(){
    	
    	Location l1 = new Location("First street");
    	Location l2 = new Location("Second street");
    	Location l3 = new Location("Third street");
    	Student s1 = new Student("Raj", l1);
    	Student s2 = new Student("Vinay", l2);
    	Student s3 = new Student("Vinod", l3);
    	studentList = new ArrayList<Student>();
    	studentList.add(s1);
    	studentList.add(s2);
    	studentList.add(s3);
    }
     
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
    	log.info("setName(String) is called.");
        this.name = name;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public Map<String, String> getMap() {
		map = new HashMap<String,String>();
		map.put("name", "Imran Khan");
		map.put("address", "new Delhi");
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
    
	public void setServletContext(ServletContext arg0) {}
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	public void setServletResponse(HttpServletResponse arg0) {}

	public String getUrl() {
		return url;
	}

	public String getParamValue() {
		return paramValue;
	}
	
	@Override
	public void validate() {
		log.info("validate() method is called.");
		if(name.length() < 2) {
			addActionError("Error message added in validate() method.");
			addFieldError("name", getText("name.length"));
		}
	}
}