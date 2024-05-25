package Controllers;

import java.net.http.HttpRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import DTOPackage.EmailDto;
import DTOPackage.UserCrushDTO;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class EmailController {

//	ye jsp k phelay page ka code hai, hum wahan sy yourName ko url me pass kr rahai
//	<a href="emailSend/${userInfo.yourName}">Send Email</a>
//	xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

//	path varibale k like url me mapping ki hai value ki
//	@RequestMapping("/emailSend/{yourName}")
//	public String login(@PathVariable("yourName") String yourName,  @ModelAttribute("emailDto") EmailDto emailDto , Model model)
//	//yahan humny ", comma" use nai kia @model or class mei   or class or objet name change hona lazmi hai 
//	{
//		model.addAttribute("yourName",yourName);
//	
//		return "emailSend";
//	}

//	xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

//	ye nechay jsp ka code hai wahan sy hum ny url me yourName url mei pass kia hai
//	<form:form action="emailSendSucess/${yourName}" method="get"

//	path varibale k liye url me hum ny 
//	@RequestMapping("/emailSendSucess/{yourName}")
//	public String process_email(@PathVariable("yourName") String yourName, @ModelAttribute("emailDto") EmailDto emailDto,  Model model)
//
//	{	
//		model.addAttribute("yourName",yourName);
//			
//		return "emailSendSucess";
//	}

//	@RequestMapping("/emailSend")
//	public String login(@ModelAttribute("emailDto") EmailDto emailDto, HttpServletRequest request, Model model)
//	// yahan humny ", comma" use nai kia @model or class mei or class or objet name
//	// change hona lazmi hai
//	{
//		
//		Cookie[] cookies = request.getCookies();
//	
//		
//		
//		if(cookies!=null)
//		{
//			for(Cookie temp:cookies)
//			{
//				
//			
//				if("cookieUser".equals(temp.getName()))
//				{
//					String yourName=temp.getValue();
//					model.addAttribute("yourName", yourName);
//					return "emailSend";
//				}
//				else {}
//				
//			}
//			
//			System.out.println("cookie found but no Name");
//			return "emailSend";
//		}
//
//		else
//		{
//			System.out.println("no cookie found");
//			return "emailSend";
//		}
//
//
//	}
	
//	same above code hai mager yahn hum ny cookies ki annotation use ki hai jis sy code chota hogaya
//	@RequestMapping("/emailSend")
//	public String login(@CookieValue(value="cookieUser" ,required=false) String yourName,@ModelAttribute("emailDto") EmailDto emailDto, Model model)
//	
//	{
//		
//		if(yourName!=null && !yourName.isEmpty())
//		{
//			model.addAttribute("yourName", yourName);
//			return "emailSend";
//		}
//
//		return "emailSend";
//
//
//	}
	
//	same as above we have used session so we don't want cookies anymore
	@RequestMapping("/emailSend")
	public String login(@ModelAttribute("emailDto") EmailDto emailDto)
	
	{

		return "emailSend";

	}

	@RequestMapping("/emailSendSucess")
	public String process_email(@ModelAttribute("emailDto") EmailDto emailDto)

	{
		return "emailSendSucess";

	}

}
