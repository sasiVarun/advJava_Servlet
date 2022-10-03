package test;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class RequestListener implements ServletRequestListener{
	
	@Override
	public void requestInitialized (ServletRequestEvent sre) {
		System.out.println("ServletRequest Initialized");
    }
	
	@Override
	public void requestDestroyed (ServletRequestEvent sre) {
		System.out.println("ServletRequest Destroyed");
    }
}
