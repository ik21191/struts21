package mypack.actions;
import java.util.ArrayList;
import java.util.List;

import mypack.beans.Location;
import mypack.beans.Student;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
public class LoginAction extends ActionSupport implements Action {

	//Java Bean to hold the form parameters
    private String name;
    private String pwd;
    private List<Student> studentList;
    
	public LoginAction(){
		System.out.println("LoginAction is called.");
	}
    
    @Override
    public String execute() throws Exception {
    	initializeStudentList();
    	System.out.println("execute() of LoginAction is invoked.");
    	addActionMessage("Hello this is Action message");
    	addActionError("Hello this is Action Error message");
        if(name.length()>1)
        return "SUCCESS";
        else return "ERROR";
    }
    
    public void initializeStudentList(){
    	
    	Location l1 = new Location("First street");
    	Location l2 = new Location("Second street");
    	Location l3 = new Location("Third street");
    	Student s1 = new Student("Name1", l1);
    	Student s2 = new Student("Name2", l2);
    	Student s3 = new Student("Name3", l3);
    	studentList = new ArrayList<Student>();
    	studentList.add(s1);
    	studentList.add(s2);
    	studentList.add(s3);
    }
     
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
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
    
}