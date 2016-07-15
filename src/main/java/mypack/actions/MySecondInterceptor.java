package mypack.actions;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MySecondInterceptor implements Interceptor
{
	@Override
	public void destroy() {
		System.out.println("MySecondInterceptor is destroyed.");
	}
	@Override
	public void init() {
		System.out.println("MySecondInterceptor is initialized.");
	}
	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MySecondInterceptor is called.");
		String result= ai.invoke();
		System.out.println("MySecondInterceptor: Code written after invoking action.");
		//return "SUCCESS";
		return result;
	}
	
}
