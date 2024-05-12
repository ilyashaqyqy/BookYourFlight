package com.Flight.YourFlight;

import javax.persistence.*;

@Entity
@Table(name = "Siege")
public class Siege {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Siege")
    private int id;

    @Column(name = "Number_Siege")
    private String numeroSiege;

    @Column(name = "etat_siege")
    private String etatSiege;

    @ManyToOne
    @JoinColumn(name = "ID_vols")
    private Vol vol;

	public Siege() {
		super();
	
	}

	public Siege(String numeroSiege, String etatSiege, Vol vol) {
		super();
		this.numeroSiege = numeroSiege;
		this.etatSiege = etatSiege;
		this.vol = vol;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumeroSiege() {
		return numeroSiege;
	}

	public void setNumeroSiege(String numeroSiege) {
		this.numeroSiege = numeroSiege;
	}

	public String getEtatSiege() {
		return etatSiege;
	}

	public void setEtatSiege(String etatSiege) {
		this.etatSiege = etatSiege;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	@Override
	public String toString() {
		return "Siege [id=" + id + ", numeroSiege=" + numeroSiege + ", etatSiege=" + etatSiege + ", vol=" + vol + "]";
	}

    
	
}
