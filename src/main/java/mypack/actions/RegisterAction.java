package mypack.actions;

import mypack.beans.RegisterForm;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterAction extends ActionSupport implements ModelDriven<RegisterForm> {
	private static final long serialVersionUID = 1L;	
	
	public RegisterForm form = new RegisterForm();
	public RegisterAction() {
		System.out.println("RegisterAction is called.");
	}

	@Override
	public String execute() throws Exception {
		System.out.println("execute() of RegisterAction is called.");
		if(form.getFirstName().equalsIgnoreCase("none")) {
			return NONE;
		}
		return SUCCESS;
	}
	
	@Override
	public RegisterForm getModel() {
		return form;
	}
}
