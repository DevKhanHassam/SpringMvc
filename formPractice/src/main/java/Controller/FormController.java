package Controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import DTO.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

@Controller
public class FormController {

	@RequestMapping("/")
	public String form(@ModelAttribute("userDetails") MyFormDto userDetails) {

		return "form";
	}

	@RequestMapping("/userDetails")
	public String userDetails(@Valid @ModelAttribute("userDetails") MyFormDto userDetails, BindingResult bindresult) {
		if (bindresult.hasErrors()) 
		{
			List<ObjectError> allErrors = bindresult.getAllErrors();
			
			for(ObjectError temp:allErrors)
			{
				System.out.println(temp);
			}
			
			return "form";
		}
		return "userDetails";
	}
}
