package Configuration;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


@EnableWebMvc
public class FormInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[]= {FormDP.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String [] arr = {"/"};
		return arr;
	}

}
