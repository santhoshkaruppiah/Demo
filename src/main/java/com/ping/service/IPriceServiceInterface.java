package com.ping.service;

import java.util.List;

import com.domain.Price;

public interface IPriceServiceInterface {

	/**
	 * Return all Price from DB
	 * @return
	 */
	public List<Price> getAllPrice();
	
	/**
	 * Given a article it returns Price for those from all vendor
	 * @param article
	 * @return
	 */
	public List<Price> getPriceByArticle(String article);
	
	/**
	 * Given a vendor it returns Price for all objects
	 * @param article
	 * @return
	 */
	public List<Price> getPriceByVendor(String vendor);
	
}
