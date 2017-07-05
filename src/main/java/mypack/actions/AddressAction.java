package mypack.actions;
import javax.servlet.http.HttpServletRequest;

import mypack.beans.Address;
import mypack.beans.Xyz;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
public class AddressAction implements ModelDriven<Object>, Preparable, ServletRequestAware{
	Address address;
	Object obj;
	String method;
	String area;
	private HttpServletRequest request;
	public AddressAction(){
		System.out.println("AddressAction is called.");
	}
    
    public String execute() throws Exception {
    	System.out.println("execute() of AddressAction is invoked.");
        return "success";
    }

	@Override
	public Object getModel() {
		System.out.println("getModel() is called.");
		if(method.contains("address-action.action")) {
			obj = new Xyz();
		}
		return obj;
	}
	/*@Override
	public Address getModel() {
	
		System.out.println("getModel() is called.");
		return address;
	}*/
    @Override
    public void prepare() throws Exception {
    	method = request.getRequestURI();
   }
    
    @Override
    public void setServletRequest(HttpServletRequest request) {
    	System.out.println("setServletRequest(HttpServletRequest request) is called.");
    	this.request = request;
    }
    
    
}