package com.sheena.defectapiproject.resource;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sheena.defectapiproject.models.Defect;
import com.sheena.defectapiproject.repository.DefectRepository;


@RestController
@RequestMapping("/defect")
public class DefectResource {

	@Autowired
	DefectRepository defectRepository;
	
	@GetMapping("/")
	public String fun()
	{
		return "Welcome";
	}
	
	@GetMapping("/{defectId}")
	public Optional<Defect> getDefects(@PathVariable Integer defectId)
	{
		return defectRepository.findById(defectId);
	}
	
	@GetMapping("/getDefects/{username}")
	public List<Defect> GetAllDefects(@PathVariable String username)
	{
		return defectRepository.findAllByUsername(username);
	}
	
	@PostMapping
	public void addDefect(@RequestBody Defect d)
	{
		d.setDate(new Date());
		d.setStatus("open");	
		defectRepository.save(d);
	}
}
