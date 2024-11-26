package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.entity.GestionSala;
import co.edu.ue.service.IGestionService;

@RestController
@RequestMapping("api")
public class GestionController {
	
	@Autowired
	IGestionService service;
	
	@GetMapping(value="gestion-all")
	public ResponseEntity<List<GestionSala>> getAllcontrolsala(){
		List<GestionSala> list = service.listAllcontrolsala();
		return new ResponseEntity<List<GestionSala>>(list, HttpStatus.ACCEPTED);
	}
	
	@GetMapping(value="gestion-id")
	public ResponseEntity<GestionSala> getByIdcontrolsala(@RequestParam int id){
		return new ResponseEntity<GestionSala>(service.searchByIdcontrolsala(id),HttpStatus.OK);
	}
}
