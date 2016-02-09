package com.domain.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.Price;

public interface PriceRepository extends JpaRepository<Price, Long>  {

	List<Price> findByArticle(final String article);
	List<Price> findByVendor(final String vendor);
	
}
