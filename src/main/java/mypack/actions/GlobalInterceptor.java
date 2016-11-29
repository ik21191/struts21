package mypack.actions;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class GlobalInterceptor implements Interceptor
{
	private static final long serialVersionUID = 1L;
	@Override
	public void destroy() {
		System.out.println("MyInterceptor is destroyed.");
	}
	@Override
	public void init() {
		System.out.println("MyInterceptor is initialized.");
	}
	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		
		System.out.println("GlobalInterceptor is called");
		//return "SUCCESS";
		return ai.invoke();
	}
	
}
