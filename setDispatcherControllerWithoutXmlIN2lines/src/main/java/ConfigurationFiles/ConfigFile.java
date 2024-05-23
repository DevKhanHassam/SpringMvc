package ConfigurationFiles;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ConfigFile extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class[] arr= {IdealPartnerConfig.class};
		return arr;
	}
	
	

	@Override
	protected String[] getServletMappings() {
		String arr[]= {"/web/*"};
		return arr;
	}

}
