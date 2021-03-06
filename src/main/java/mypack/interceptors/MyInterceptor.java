package mypack.interceptors;

import mypack.actions.LoginAction;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor
{
	private static final long serialVersionUID = 1L;
	
	public MyInterceptor() {
		System.out.println("MyInterceptor() construtor is called.");
	}
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
		System.out.println("MyInterceptor is called.");
		if(ai.getAction() instanceof LoginAction) {
			LoginAction action = (LoginAction)ai.getAction();
			System.out.println("Printing action's property....  " + action.getName());
			action.setName(action.getName() + "XXXXXX");
		}
		/**If you comment below call, then no further Interceptor and action's execute() method is called.
		 * only actions's object is created and its properties will be initialized from form values.
		 **/
		String result = ai.invoke();
		System.out.println("MyInterceptor: Code written after invoking action.");
		//return "SUCCESS";
		return result;
	}
	
}
