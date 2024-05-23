package Formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import DTO.Phone;

public class PhoneFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override       // change the string accordingly
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		
		
//		extract country code from completephoneNumber
		String[] phoneNumberArray = completePhoneNumber.split("-");
		Phone phone = new Phone();
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		int indexOf = completePhoneNumber.indexOf("-");
		
		if(indexOf== -1  || indexOf==0)
		{
			phone.setCountrycode("+92");	
			phone.setUserNumber(phoneNumberArray[0]);
		}
		
		phone.setCountrycode(phoneNumberArray[0]);
		phone.setUserNumber(phoneNumberArray[1]);
		
		return phone;
	}

	

}
