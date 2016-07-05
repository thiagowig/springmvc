package br.com.ithiago.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.ithiago.model.Product;

@Controller
@RequestMapping(value="product")
public class ProductController {

	@RequestMapping(value="/")
	public String index(ModelMap model) {
		
		return "/product/form";
	}
	
	@RequestMapping(value="save", method=RequestMethod.POST)
	public String insert(Product product) {
		
		return "/product/ok";
	}
}
