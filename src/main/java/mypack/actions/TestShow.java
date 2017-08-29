package mypack.actions;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

public class TestShow implements ServletRequestAware {
	private HttpServletRequest request;
	private String param1;
	public String execute() {
		System.out.println("fetching parameter : " + request.getParameter("param1"));
		System.out.println("execute() in TestShow : " + param1);
		return "success";
	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		
	}

	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}
	
	
}
