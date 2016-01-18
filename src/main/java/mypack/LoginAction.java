package mypack;
import com.opensymphony.xwork2.Action;
public class LoginAction implements Action {
	
	public LoginAction(){
		System.out.println("LoginAction is called.");
	}
    
    @Override
    public String execute() throws Exception {
    	System.out.println("execute() of LoginAction is invoked.");
        if(name.length()>1)
        return "SUCCESS";
        else return "ERROR";
    }
     
    //Java Bean to hold the form parameters
    private String name;
    private String pwd;
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
     
}