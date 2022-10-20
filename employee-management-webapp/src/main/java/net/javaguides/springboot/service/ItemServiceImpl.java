package net.javaguides.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import net.javaguides.springboot.model.Item;
import net.javaguides.springboot.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
@Autowired
private ItemRepository itemRepository;
	@Override
	public List<Item> getAllItem() {
		
		return itemRepository.findAll();
	}
	@Override
	
	public void saveItem(Item item) {
		this.itemRepository.save(item);
		
	}
	
	
	@Override
	
	
	public Item getItemById(long id) {
		Optional<Item> optional= itemRepository.findById(id);
		Item item=null;
		if (optional.isPresent()) {
			item=optional.get();
					
		}else {
			throw new RuntimeException("Item not found for id: " + id);
		
	}
	return item;

}

}
