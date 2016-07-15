package mypack.actions;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor
{
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
		// TODO Auto-generated method stub
		System.out.println("MyInterceptor is called.");
		LoginAction action=(LoginAction)ai.getAction();
		System.out.println("Printing action's property....  "+action.getName());
		/**If you comment below call, then no further Interceptor and action's execute() method is called.
		 * only actions's object is created and its properties will be initialized from form values.
		 **/
		String result= ai.invoke();
		System.out.println("MyInterceptor: Code written after invoking action.");
		//return "SUCCESS";
		return result;
	}
	
}
