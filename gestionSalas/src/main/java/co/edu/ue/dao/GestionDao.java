package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.GestionSala;
import co.edu.ue.jpa.IGestionSalasjpa;

@Repository
public class GestionDao implements IGestionDao {
	@Autowired
	IGestionSalasjpa jpa;
	
	@Override
	public List<GestionSala> Listcontrolsala(){
		return jpa.findAll();
	}
	
	@Override
	public GestionSala searchById(int id) {
		return jpa.findById(id).orElse(null);
	}
}
