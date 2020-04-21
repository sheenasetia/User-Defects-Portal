package com.sheena.defectapiproject.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sheena.defectapiproject.models.Defect;

///@FeignClient( url= "http://defect-service/defect/getDefects", name = "defect-service")
//no need to add url now as we are using eureka , write the name of the service directly
@FeignClient( name = "defect-service")
public interface DefectServiceClient {

	@GetMapping("/defect/getDefects/{username}")
	public List<Defect> getDefectsByUser(@PathVariable String username);
	
}
