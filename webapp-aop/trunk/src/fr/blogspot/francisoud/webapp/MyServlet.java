package fr.blogspot.francisoud.webapp;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

public class MyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

    public Object getBean(final ServletContext context, final String name) {
        final ApplicationContext applicationContext = (ApplicationContext) context.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        return applicationContext.getBean(name);
    }
    
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MyService service = (MyService) getBean(getServletContext(), "myservice");
		
		service.instantMethod();
		
		service.shortMethod();
		
		service.longMethod();
		
		String hello = "Hello World - " + new Date().toString();
		response.getOutputStream().write(hello.getBytes());
		response.getOutputStream().close();
	}
}
