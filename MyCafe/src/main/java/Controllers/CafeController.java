package Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

;



@Controller
public class CafeController {
	

	@RequestMapping("/menu")
	public String menu (Model model)   // we pass Model as argument 
	{
		model.addAttribute("MyName","Hassam");
		return "menu";
	}
	
	
	@RequestMapping("/inprocess")
	public String inprocess (HttpServletRequest request  ,Model model)   // we pass Model as argument 
	{
		String dishName=request.getParameter("dishName");
		model.addAttribute("order",dishName);
		return "inprocess";
	}
}
