package com.ping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.Price;
import com.domain.dao.PriceRepository;

@RestController
public class PriceService implements IPriceServiceInterface {

	@Autowired
	PriceRepository priceRepo;
	
	@Override
	@RequestMapping("/getAllPrice")
	public List<Price> getAllPrice() {
		return priceRepo.findAll();
	}

	@Override
	@RequestMapping("/getPriceByArticle")
	public List<Price> getPriceByArticle(String article) {
		return priceRepo.findByArticle(article);
	}

	@Override
	@RequestMapping("/getPriceByVendor")
	public List<Price> getPriceByVendor(String vendor) {
		return priceRepo.findByVendor(vendor);
	}
}
