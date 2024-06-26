package ConfigurationFiles;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration.Dynamic;

public class IdealPartnerWebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		
		AnnotationConfigWebApplicationContext  webcontext = new AnnotationConfigWebApplicationContext();
		webcontext.register(IdealPartnerConfig.class);
		
		
//when use xml file
//		XmlWebApplicationContext xmlWebAppContext = new XmlWebApplicationContext();
//		// pass the xml file path
//		xmlWebAppContext.setConfigLocation("classpath:web.xml");

		
		
		
//pass xmlwebcontext as argument	
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webcontext);

		
//		ServletRegistration.Dynamic  old type
		Dynamic myServlet = servletContext.addServlet("FrontController", dispatcherServlet);
		
		myServlet.setLoadOnStartup(1);
		myServlet.addMapping("/web/*");
	}
	
	

}
