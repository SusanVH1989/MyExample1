package com.sus.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sus.DAO.SplitterDAO;
import com.sus.beans.SpitterUser;

/**
 * 
 * @author hailssus
 *
 */
@Controller
@RequestMapping(value="/spittles.do")
public class SpittleController {
	
	@Autowired
	private SplitterDAO splitterDAO;
	/**
	 *Example 1 with query String parameter
	 */
	
	@RequestMapping(method = RequestMethod.GET)
	public String showSpittles(Model model, @RequestParam("count") long count) {
		System.out.println(count);
		model.addAttribute(splitterDAO.searchFollowers(1));
		return "spittle";
	}
	
	
	/**
	 *Example 2
	 *url  spittles/regis..
	 */
	@RequestMapping(value="/register.do",  method=RequestMethod.GET)
	public String register(Model model){
		model.addAttribute(new SpitterUser());

		return "register";
	}
	
	/**
	 *Example 3 and redirection/validation
	 *Save
	 *
	 */
	
	@RequestMapping(value="/register.do",  method=RequestMethod.POST)
	public String save(@Valid SpitterUser spitterUser,Errors errors){
		System.out.println("validating");
		
		if(errors.hasErrors()){
			return "register";
		}else{
		splitterDAO.saveSpitter(spitterUser);
		return "redirect:/spittles.do/" +
		spitterUser.getUserName()+".do";
		}
		
	}
	
	
	/**
	 * Example 4 passing of input through path variable & Model
	 */
	
	@RequestMapping(value="/{userName}.do", method=RequestMethod.GET)
	public String showSpitterProfile(
			@PathVariable String userName, Model model) {
			SpitterUser spitterUser = splitterDAO.findByUsername(userName);
			model.addAttribute(spitterUser);
			return "profile";
			}
	
	
/*	@RequestMapping(method=RequestMethod.GET)
	public Spittle showSpittlesByCount(@RequestParam("count") long count){
	System.out.println(count);
		return splitterDAO.findFollowers(count);
	}
	*/
}
