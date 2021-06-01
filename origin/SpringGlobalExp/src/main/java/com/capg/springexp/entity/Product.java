package com.capg.springexp.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_info")
public class Product {
	
		@Id
		private long pid;
		private String pname;
		private  double price;
		private  LocalDate dop;
		
		public long getPid() {
			return pid;
		}
		public void setPid(long pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public LocalDate getDop() {
			return dop;
		}
		public void setDop(LocalDate dop) {
			this.dop = dop;
		}
	
		
		
		
	

}
