package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Son {
	
	
	
	@RequestMapping("/son")
	public String a()
	{
		
		
		return "Greet";
	}

	
	
}
