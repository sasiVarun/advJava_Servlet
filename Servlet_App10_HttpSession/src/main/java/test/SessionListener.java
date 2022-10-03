package test;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@WebListener
public class SessionListener implements HttpSessionListener{
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("Session Created...");
    }
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("Session Destroyed...");
    }
}
