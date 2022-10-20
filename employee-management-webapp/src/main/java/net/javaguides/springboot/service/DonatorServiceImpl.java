package net.javaguides.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Donator;
import net.javaguides.springboot.repository.DonatorRepository;

@Service
public class DonatorServiceImpl implements DonatorService {

	@Autowired
	private DonatorRepository donatorrepository;
	
	@Override
	public List<Donator> getAllDonator() {
		
		return donatorrepository.findAll();
	}
	
	//_____________________________

	@Override
	public void saveDonor(Donator donor) {
		this.donatorrepository.save(donor);
		
	}

	
	
    @Override
	public Donator getDonatorById(long id) {
		Optional<Donator> optional= donatorrepository.findById(id);
		Donator donor=null;
		if (optional.isPresent()) {
			donor=optional.get();
					
		}else {
			throw new RuntimeException("Donor not found for id: " + id);
		
	}
	return donor;

}

	@Override
	public void deleteDonatorById(long id) {
		// TODO Auto-generated method stub
		this.donatorrepository.deleteById(id);
		
		
	}

	


}
