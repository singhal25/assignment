package com.furniture.furniture;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FurnitureService {
	@Autowired
	private FurnitureDAORepository furnitureDAORepository;
	
	public List<Furniture> getFurnitures(){
		List<Furniture> furnitureList = new ArrayList<Furniture>();
		furnitureDAORepository.findAll().forEach(furnitureList::add);
		return furnitureList;
		
		
	}
	
	public Optional<Furniture> getFurniture(String id) {
		return furnitureDAORepository.findById(id);
	}
	
	public void updateFurniture(String id, Furniture Furniture) {
		furnitureDAORepository.save(Furniture);
	}

	public void deleteFurniture(String id) {
		furnitureDAORepository.deleteById(id);
	}

	
	public void addFurniture(Furniture Furniture) {
		furnitureDAORepository.save(Furniture);
	}
}
