package co.edu.ue.service;

import java.util.List;

import co.edu.ue.entity.GestionSala;

public interface IGestionService {
	List<GestionSala>listAllcontrolsala();

	GestionSala searchByIdcontrolsala(int id);
}
