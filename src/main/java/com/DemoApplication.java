package com;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.domain.Price;
import com.domain.dao.PriceRepository;

@SpringBootApplication(scanBasePackages = { "com.ping.service","com.domain","com.domain.dao" })
public class DemoApplication {
	
	@Bean
	public CommandLineRunner init(PriceRepository priceRepository) {
		//long id, String vendor, String article, BigDecimal price
		return args -> {
			priceRepository.save(new Price(1,"Costco","Bread",new BigDecimal(6)));
			priceRepository.save(new Price(2,"Walmart","Bread",new BigDecimal(2.35)));
			priceRepository.save(new Price(3,"Safeway","Bread",new BigDecimal(1.50)));
			priceRepository.save(new Price(4,"Costco","Milk",new BigDecimal(6.50)));
		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
