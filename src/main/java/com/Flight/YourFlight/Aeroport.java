package com.Flight.YourFlight;

import javax.persistence.*;

@Entity
@Table(name = "Aeroport")
public class Aeroport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Aéroport")
    private int id;

    @Column(name = "Nom")
    private String nom;

    @Column(name = "Ville_départ")
    private String villeDepart;

    @Column(name = "Ville_arrivée")
    private String villeArrivee;

    @Column(name = "Pays")
    private String pays;

	public Aeroport() {
		super();

	}

	public Aeroport(String nom, String villeDepart, String villeArrivee, String pays) {
		super();
		this.nom = nom;
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
		this.pays = pays;
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

	public String getVilleDepart() {
		return villeDepart;
	}

	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}

	public String getVilleArrivee() {
		return villeArrivee;
	}

	public void setVilleArrivee(String villeArrivee) {
		this.villeArrivee = villeArrivee;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "Aeroport [id=" + id + ", nom=" + nom + ", villeDepart=" + villeDepart + ", villeArrivee=" + villeArrivee
				+ ", pays=" + pays + "]";
	}

 
}

