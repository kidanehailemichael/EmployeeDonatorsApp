package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.model.Donator;

public interface DonatorService {
	List<Donator> getAllDonator();
	void saveDonor(Donator donor);
	Donator getDonatorById(long id);
	
	void deleteDonatorById(long id);

}
