package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.Donator;

public interface DonatorRepository extends JpaRepository<Donator, Long> {

	
}
