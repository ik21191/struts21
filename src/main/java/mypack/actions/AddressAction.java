package mypack.actions;
import mypack.beans.Address;

import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
public class AddressAction implements ModelDriven<Address>,Preparable{
	Address address;
	public AddressAction(){
		System.out.println("AddressAction is called.");
	}
    
    public String execute() throws Exception {
    	System.out.println("execute() of AddressAction is invoked.");
        return "success";
    }

	@Override
	public Address getModel() {
	
		System.out.println("getModel() is called.");
		return address;
	}
    @Override
    public void prepare() throws Exception 
    {
    	System.out.println("prepare() is called.");
    	if(address==null)
    		address=new Address();
	}
}