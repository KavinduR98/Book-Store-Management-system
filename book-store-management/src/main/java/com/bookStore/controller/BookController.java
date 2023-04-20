package com.bookStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {
	@GetMapping("/")
	public String home() {
		return "home";
	}
	@GetMapping("/book_register")
		public String bookRegister() {
			return "bookRegister";
	}
	

}
