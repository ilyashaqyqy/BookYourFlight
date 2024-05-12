package com.Flight.YourFlight;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Vol")
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_vols")
    private int id;

    @ManyToOne
    @JoinColumn(name = "ID_Aéroport")
    private Aeroport aéroport;

    @Column(name = "Compagnie")
    private String compagnie;

    @Column(name = "Date_départ")
    private Date dateDépart;

    @Column(name = "Date_arrivée")
    private Date dateArrivée;

    @Column(name = "Prix")
    private double prix;

	public Vol() {
		super();
		
	}

	public Vol(Aeroport aéroport, String compagnie, Date dateDépart, Date dateArrivée, double prix) {
		super();
		this.aéroport = aéroport;
		this.compagnie = compagnie;
		this.dateDépart = dateDépart;
		this.dateArrivée = dateArrivée;
		this.prix = prix;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Aeroport getAéroport() {
		return aéroport;
	}

	public void setAéroport(Aeroport aéroport) {
		this.aéroport = aéroport;
	}

	public String getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(String compagnie) {
		this.compagnie = compagnie;
	}

	public Date getDateDépart() {
		return dateDépart;
	}

	public void setDateDépart(Date dateDépart) {
		this.dateDépart = dateDépart;
	}

	public Date getDateArrivée() {
		return dateArrivée;
	}

	public void setDateArrivée(Date dateArrivée) {
		this.dateArrivée = dateArrivée;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Vol [id=" + id + ", aéroport=" + aéroport + ", compagnie=" + compagnie + ", dateDépart=" + dateDépart
				+ ", dateArrivée=" + dateArrivée + ", prix=" + prix + "]";
	}

   
    
}

