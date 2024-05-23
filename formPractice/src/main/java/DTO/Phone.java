package DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Phone {

	
	@NotBlank(message = "*enter countrycode")
	@Size(min = 3, max = 3)
	@Pattern(regexp = "\\+\\d{2}", message = "The country code must be in the format +XX where XX is a two-digit number")
	String countrycode;
	
	@NotBlank(message = "*enter Number")
	@Pattern(regexp = "\\d{10}", message = "The mobile number must be a 10-digit number")
	String userNumber;
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	@Override
	public String toString() {
		return "Phone [countrycode=" + countrycode + ", userNumber=" + userNumber + "]";
	}
	
	
}
