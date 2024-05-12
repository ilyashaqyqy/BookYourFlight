package com.Flight.YourFlight;

import javax.persistence.*;

@Entity
@Table(name = "Passager")
public class Passager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_passager")
    private int id;

    @Column(name = "Nom")
    private String nom;

	public Passager() {
		super();

	}

	public Passager(String nom) {
		super();
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Passager [id=" + id + ", nom=" + nom + "]";
	}


    
    
}

