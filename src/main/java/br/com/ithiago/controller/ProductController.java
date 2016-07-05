package br.com.ithiago.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.ithiago.model.Product;
import br.com.ithiago.service.ProductService;

@Controller
@RequestMapping(value="product")
public class ProductController {
	
	private ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping(value="/")
	public String index(ModelMap model) {
		return "/product/form";
	}
	
	@RequestMapping(value="save", method=RequestMethod.POST)
	public String insert(Product product) {
		productService.save(product);
		
		return "/product/ok";
	}
}
