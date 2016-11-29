package mypack.actions;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
public class MyListAction extends ActionSupport implements Action {

	//Java Bean to hold the form parameters
    
    private String[] aa;
    
	public MyListAction(){
		System.out.println("LoginAction is called.");
	}
    
    @Override
    public String execute() throws Exception {
    	
        return "SUCCESS";
      
    }

	public String[] getAa() {
		return aa;
	}

	public void setAa(String[] aa) {
		this.aa = aa;
	}

}