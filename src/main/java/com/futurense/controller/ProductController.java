package com.futurense.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class ProductController {
	
	
	@GetMapping("/ping")
	public String ping()  {
		return "Yes, I am working";
	}
	
	/*
	 * @GetMapping("/product/{id}") public Product findById(@PathVariable("id") Long
	 * id) { logger.debug("Product access requested for id : " + id); return
	 * productService.findById(id); }
	 * 
	 * @PostMapping(path = "/product/add", consumes = "application/json", produces =
	 * "application/json") public Product addProduct(@RequestBody Product product) {
	 * logger.info("adding new product"); return productService.save(product); }
	 * 
	 * 
	 * @PutMapping(path = "/product/update", consumes = "application/json", produces
	 * = "application/json") public ResponseEntity<Product>
	 * updateProduct(@RequestBody Product productRequest) {
	 * 
	 * Product product = productService.findById(productRequest.getId()); Product
	 * updatedProduct = null;
	 * 
	 * if(product != null) {
	 * product.setProductnumber(productRequest.getProductnumber()); updatedProduct =
	 * productService.save(product); }
	 * 
	 * return ResponseEntity.ok(updatedProduct); }
	 */
}
