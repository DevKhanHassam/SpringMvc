package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mom")
public class MomController {

	@ResponseBody
	@RequestMapping("/sugar")
	public String sugar() {
		return "SUgar ly lo";
	}

	@ResponseBody
	@RequestMapping("/food")
	public String food() {
		return "Food is Ready";
	}
}
