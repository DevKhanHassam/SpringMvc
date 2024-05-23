package Configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import Formatter.PhoneFormatter;

@EnableWebMvc
@Configurable
@Configuration
@ComponentScan(basePackages = "Controller")

//								we implements below interface so that we can use formatter, and not to implemnt all method ,its weird
public class FormDP implements WebMvcConfigurer {

	@Bean

	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

	@Bean

//	this is for validation messages from properties file

	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:Messages");
		return messageSource;
	}

	@Bean
	public LocalValidatorFactoryBean localValidatorFactoryBean() {

		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
		localValidatorFactoryBean.setValidationMessageSource(messageSource());
		return localValidatorFactoryBean;
	}

	@Override
	public Validator getValidator() {
		return localValidatorFactoryBean();
	}

	// this is for formatter
	@Override
	public void addFormatters(FormatterRegistry registry) {

		registry.addFormatter(new PhoneFormatter());
	}

//	ye code use jb kr skty jb databinding mei kuch change wagera krna ho jaisa k humny ny code me firstName is widespace ko trim
//	krny ka code likha hai for more details go to 
//	every databinding k bd program ka flow is k pass ata hai
//	like page 1 k bd data flow is sy pass hota phir page 2 per jata hai
//	https://youtu.be/ms4ywje7EYI?feature=shared
	
//	@InitBinder   
//	public void initBinder(WebDataBinder binder) {
//		StringTrimmerEditor editor = new StringTrimmerEditor(true);
//		binder.registerCustomEditor(String.class, "firstName", editor);
//	}

}
