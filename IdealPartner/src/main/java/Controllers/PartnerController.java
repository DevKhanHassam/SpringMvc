package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PartnerController {

	@RequestMapping("/login")
	public String login()

	{
		return "login";
	}
}
