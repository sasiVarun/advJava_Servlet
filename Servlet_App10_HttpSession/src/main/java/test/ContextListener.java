package test;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebListener
public class ContextListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContext Initialized");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContext Destroyed");
	}
}
