package com.Flight.YourFlight;

import javax.persistence.*;

@Entity
@Table(name = "Reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Reservations")
    private int id;

    @ManyToOne
    @JoinColumn(name = "ID_Utilisateurs")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "ID_Siege")
    private Siege siege;

    @Column(name = "details_passagers")
    private String detailsPassagers;

	public Reservation() {
		super();
	
	}

	public Reservation(Utilisateur utilisateur, Siege siege, String detailsPassagers) {
		super();
		this.utilisateur = utilisateur;
		this.siege = siege;
		this.detailsPassagers = detailsPassagers;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", siege=" + siege + ", detailsPassagers=" + detailsPassagers + "]";
	}


    
}

