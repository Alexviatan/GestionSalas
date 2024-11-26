package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.entity.GestionSala;

public interface IGestionDao {

	public List<GestionSala> Listcontrolsala();

	public GestionSala searchById(int id);
}
