package com.hacthon.app.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class BookOrder {

	 	@Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	    private long id;
	    @Column
	    private String orderType;
	    @Column
	    @JsonIgnore
	    private String price;
	    @Column
	    private int quantity;
	    @Column
	    private String bwl;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getOrderType() {
			return orderType;
		}
		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getBwl() {
			return bwl;
		}
		public void setBwl(String bwl) {
			this.bwl = bwl;
		}
	    
	    
}
