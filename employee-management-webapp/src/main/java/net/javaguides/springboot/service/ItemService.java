package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.Item;

public interface ItemService {

	List<Item> getAllItem();
	void saveItem(Item item);
	Item getItemById(long id);
}
