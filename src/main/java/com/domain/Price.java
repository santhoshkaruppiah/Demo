package com.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Price {
	
	@Id
	private long id;
	private String vendor;
	private BigDecimal price;
	private String article;
	
	public Price(long id, String vendor, String article, BigDecimal price) {
		this.id = id;
		this.vendor = vendor;
		this.price = price;
		this.article = article;
	}

	Price(){
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	@Override
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("Vendor=").append(vendor)
		.append(" ,price=").append(price)
		.append(", article=").append(price);
		return (sb.toString());
	}
}
