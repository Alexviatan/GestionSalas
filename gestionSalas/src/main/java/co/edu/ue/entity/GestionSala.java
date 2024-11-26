package co.edu.ue.entity;
import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


@Entity
@Table(name="controlsala")
@NamedQuery(name="GestionSala.findAll", query="SELECT c FROM GestionSala c")
public class GestionSala {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_registro")
	private int idregistro;

	@Column(name="fecha")
	private Date fecha;
	

	@Column(name="hora_entrada")
	private Time horaentrada;
	

	@Column(name="hora_salida")
	private Time horasalida;
	

	@Column(name="nombreBocero1")
	private String vocero1;
	

	@Column(name="codigoBocero1")
	private String  codigovocero1;
	

	@Column(name="nombreBocero2")
	private String vocero2;
	

	@Column(name="codigoBocero2")
	private String codigovocero2;
	
	public GestionSala() {	}

	//Getters and setters
	public int getIdregistro() {
		return idregistro;
	}

	public void setIdregistro(int idregistro) {
		this.idregistro = idregistro;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHoraentrada() {
		return horaentrada;
	}

	public void setHoraentrada(Time horaentrada) {
		this.horaentrada = horaentrada;
	}

	public Time getHorasalida() {
		return horasalida;
	}

	public void setHorasalida(Time horasalida) {
		this.horasalida = horasalida;
	}

	public String getVocero1() {
		return vocero1;
	}

	public void setVocero1(String vocero1) {
		this.vocero1 = vocero1;
	}

	public String getCodigovocero1() {
		return codigovocero1;
	}

	public void setCodigovocero1(String codigovocero1) {
		this.codigovocero1 = codigovocero1;
	}

	public String getVocero2() {
		return vocero2;
	}

	public void setVocero2(String vocero2) {
		this.vocero2 = vocero2;
	}

	public String getCodigovocero2() {
		return codigovocero2;
	}

	public void setCodigovocero2(String codigovocero2) {
		this.codigovocero2 = codigovocero2;
	}
	
	
}


