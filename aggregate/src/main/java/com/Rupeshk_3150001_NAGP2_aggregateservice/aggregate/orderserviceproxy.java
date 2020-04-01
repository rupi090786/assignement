package com.Rupeshk_3150001_NAGP2_aggregateservice.aggregate;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(name="order", url="localhost:9091")
public interface orderserviceproxy {
	@GetMapping(path="/order/{id}")
	public List<aggregator> Getorderbyuserid(@PathVariable int id );

	
}
