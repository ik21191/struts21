package mypack;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor
{
	@Override
	public void destroy() {
	}
	@Override
	public void init() {
	}
	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MyInterceptor is called.");
		LoginAction action=(LoginAction)ai.getAction();
		System.out.println("Printing action's property....  "+action.getName());
		String result= ai.invoke();
		System.out.println("MyInterceptor: Code written after invoking action.");
		//return "SUCCESS";
		return result;
	}
	
}
