package com.greatlearning.service;
import java.security.SecureRandom;
import java.util.Random;
import com.greatlearning.interfaces.credentials;
import com.greatlearning.model.Employee;

public class CredentialServices implements credentials{

	@Override
	public String generatePassword(int len) {
		
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
        // each iteration of the loop randomly chooses a character from the given
        // ASCII range and appends it to the `StringBuilder` instance
 
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
       
        return sb.toString();	

	}

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
		// TODO Auto-generated method stub
		String mail=null;
		mail = firstName+lastName+"@"+department+".gl.in";
		return mail;
	}

	

	@Override
	public void showcredentials(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("welcome, "+employee.getFirstName()+" ,your credentials are: \n");
		System.out.println("your email: " +employee.getEmail());
		System.out.println("your password: "+employee.getPassword());
		
	}

}
