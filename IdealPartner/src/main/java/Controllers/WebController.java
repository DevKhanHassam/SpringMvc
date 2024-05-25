package Controllers;

import java.util.Enumeration;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import DTOPackage.EmailDto;
import DTOPackage.UserCrushDTO;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class WebController {

//	@RequestMapping("/")
//	public String login(UserCrushDTO UserCrushDTO,Model model)
//	{
//
//		model.addAttribute("userInfo", UserCrushDTO);
//		return "login";
//	}

//	same as above 
//	@RequestMapping("/")
//	public String login(@ModelAttribute("userInfo") UserCrushDTO userInfo, HttpServletResponse response,
//			HttpServletRequest request)
//	// yahan humny ", comma" use nai kia @model or class mei or class or objet name
//	// change hona lazmi hai
//	{
//
//		Cookie[] cookies = request.getCookies();
//		if (cookies != null) {
//			for (Cookie temp : cookies) {
//
//				if ("cookieUser".equals(temp.getName())) {
//					String name = temp.getValue();
//					userInfo.setYourName(name);
//					break;
//				}
//			}
//
//			return "login";
//		}
//
//		else {
//
//			return "login";
//		}
//
//	}
	
//	Same as above but  here we have used cookie annotation so we don't have to write that much code to iterate 
	
//	@RequestMapping("/")
//	public String login(@CookieValue(value="cookieUser", required= false ) String yourName ,@ModelAttribute("userInfo") UserCrushDTO userInfo, HttpServletRequest request)
//	
//	{
//		
//		if(yourName!=null && !yourName.isEmpty())
//		{
//			userInfo.setYourName(yourName);
//			return "login";
//		}
//
//		return "login";
//
//	}
	
//	same as above we remove the cookies and  add session on 2nd page
	@RequestMapping("/")
	public String login(@ModelAttribute("userInfo") UserCrushDTO userInfo, HttpServletRequest request)
	
	{
		HttpSession session = request.getSession(); //or instead of passing argument httpservletrequest we use hhtpservlet session direct
		String name = (String) session.getAttribute("yourName");// if there is no attribute of this name it simply put null
		userInfo.setYourName(name);
		return "login";

	}
	
	
	
	

	
//	@RequestMapping("/process-login")
//	public String process_login(@ModelAttribute("userInfo") UserCrushDTO userInfo, HttpServletResponse response)
//
//	{
//		Cookie cookies = new Cookie("cookieUser", userInfo.getYourName());
//		cookies.setMaxAge(60 * 60 * 24);
//		response.addCookie(cookies);
//		return "process-login";
//	}
	
//	same as above but change because we use session instead cookies

	@RequestMapping("/process-login")
	public String process_login(@ModelAttribute("userInfo") UserCrushDTO userInfo, HttpServletRequest request)

	{
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(120); //seconds
		session.setAttribute("yourName", userInfo.getYourName() );
		return "process-login";
	}

}
