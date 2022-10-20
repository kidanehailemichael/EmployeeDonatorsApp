package net.javaguides.springboot.model;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	@Column(name="Item_name")
	String itemName;
    long quantity;
	@Column(name="Donation_date")
	LocalDate donatedDate =LocalDate.now();
    @Column(name="Processing_date")
	LocalDate processeddate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public LocalDate getDonatedDate() {
		return donatedDate;
	}
	public void setDonatedDate(LocalDate donatedDate) {
		this.donatedDate = donatedDate;
	}
	public LocalDate getProcesseddate() {
		return processeddate;
	}
	public void setProcesseddate(LocalDate processeddate) {
		this.processeddate = processeddate;
	}
    
    

}
