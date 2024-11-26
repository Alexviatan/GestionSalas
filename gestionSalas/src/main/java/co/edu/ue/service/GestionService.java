package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.IGestionDao;
import co.edu.ue.entity.GestionSala;

@Service
public class GestionService implements IGestionService {
	
	@Autowired
	IGestionDao dao;
	
	@Override
	public List<GestionSala> listAllcontrolsala() {
		return dao.Listcontrolsala();
	}

	@Override
	public GestionSala searchByIdcontrolsala(int id) {
		return dao.searchById(id);
	}

}
