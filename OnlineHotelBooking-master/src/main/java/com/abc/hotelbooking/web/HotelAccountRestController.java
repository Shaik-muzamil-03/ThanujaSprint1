package com.abc.hotelbooking.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abc.hotelbooking.dto.FeedbackDTO;
import com.abc.hotelbooking.dto.HotelAccountResponseDTOClient;
import com.abc.hotelbooking.dto.LoginDTO;
import com.abc.hotelbooking.dto.RatingDTO;
import com.abc.hotelbooking.entity.*;
import com.abc.hotelbooking.exceptions.InvalidUserException;
import com.abc.hotelbooking.exceptions.UnAuthorizedUserException;
import com.abc.hotelbooking.repository.AccountRepository;
import com.abc.hotelbooking.service.HotelAccountService;
import com.abc.hotelbooking.validate.ValidateEntry;

@RestController
@CrossOrigin(origins= {"http://localhost:8080","http://localhost:4200"},allowedHeaders="*")
@RequestMapping("/hotel")
public class HotelAccountRestController {
	@Autowired
	HotelAccountService hotelAccountService;
	
	@Autowired
	AccountRepository accountRepository;
	
	@PostMapping("/login")
	public boolean doLogin(@RequestBody LoginDTO loginObj,HttpServletRequest req)throws InvalidUserException
	{
		String username = loginObj.getUsername();
		String password = loginObj.getPassword();
		
		if(ValidateEntry.validateNull(username) && ValidateEntry.validateNull(password))
		{
			String role = hotelAccountService.login(username, password);
			// some code for session handling 
			if(role != null)
			{
				HttpSession session = req.getSession(true);
				//session.setAttribute("username", "sahana");
				session.setAttribute("role", role);
				session.setAttribute("username", username);
				return true;
			}
			
			
		
		else
		{
			throw new InvalidUserException("","");
		}
		}
		else
		{
			throw new InvalidUserException("","");
		}
	}
	@GetMapping("/logout")
	public boolean doLogout(HttpServletRequest req)
	{
		HttpSession session = req.getSession(false);
		String role = (String)session.getAttribute("role");
		if(role.equalsIgnoreCase("User"))
		{
			session.invalidate(); // to logout
			return true;
		}
		else return false;
	}
	
	
	@GetMapping("/hotels")
	public List<HotelAccount> doThis()
	{
		
		return hotelAccountService.getAllHotels();
	}
	
	//@GetMapping("/client/account/{hotelName}")
	//public ResponseEntity<HotelAccountResponseDTOClient>getAccountOfUser
	@PostMapping("/hotel") 
	public String savedAccountFromWeb(@RequestBody HotelAccount a)
	{
		boolean status = hotelAccountService.insertAccount(a);
		return status == true?"saved":"done";
	}
	@GetMapping("/hotelFeedback/{id}")
	public String getFeedBack(@PathVariable int id,HttpServletRequest req) throws InvalidUserException {
		HttpSession session = req.getSession(false);
		if(session!=null) {
			String FeedBack = hotelAccountService.getFeedbacks(id);
			return FeedBack;
		}
		else {
			
			throw new InvalidUserException("none","none");
		}
		
		
	}
	@PostMapping("/Rating")
	
	public String setRating(@RequestBody RatingDTO Rating,HttpServletRequest req) throws InvalidUserException {
		HttpSession session = req.getSession(false);
		if(session!=null) {
		boolean status = hotelAccountService.setUserRating(Rating.getHotelId(), Rating.getRating());
		return status == true?"updated":"failed";
		}
		else {
			
			throw new InvalidUserException("none","none");

			
		}
	}
	@PostMapping("/feedback")
	public String setFeedBack(@RequestBody FeedbackDTO feedback,HttpServletRequest req) throws InvalidUserException {
		HttpSession session = req.getSession(false);
		if(session!=null) {
		boolean status = hotelAccountService.setFeedback(feedback.getId(),feedback.getFeedback());
		return status == true?"updated":"failed";
		}
		else {
				
				throw new InvalidUserException("none","none");

				
			}
			
		}
}

	

