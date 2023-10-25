package com.furniture.furniture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;



@RestController
public class FurnitureController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
	@Autowired
	private FurnitureService furnitureService;

	@RequestMapping("/furnitures")
	public List<Furniture> getFurnitures() {
		return furnitureService.getFurnitures();
		

	}
	
	@RequestMapping(method=RequestMethod.POST, value="/furnitures")
	public void addFurniture(@RequestBody Furniture furniture) {
		furnitureService.addFurniture(furniture);
	}
	
	@RequestMapping("/furnitures/{id}")
	public Optional<Furniture> getFurniture(@PathVariable String id){
		System.out.println("Inside getFurniture");
		return furnitureService.getFurniture(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/furnitures/{id}")
	public void updateFurniture(@RequestBody Furniture furniture, @PathVariable String id) {
		System.out.println("inside updateFurniture");
		furnitureService.updateFurniture(id, furniture);
	}


	@RequestMapping(method=RequestMethod.DELETE, value="/furnitures/{id}")
	public void deleteFurniture(@PathVariable String id){
		System.out.println("Inside deleteFurniture");
		furnitureService.deleteFurniture(id);
	}
}
