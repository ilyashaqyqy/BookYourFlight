package com.Flight.YourFlight;

import javax.persistence.*;

@Entity
@Table(name = "Utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Utilisateurs")
    private int id;

    @Column(name = "Nom")
    private String nom;

    @Column(name = "Email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "ID_passager")
    private Passager passager;

	public Utilisateur() {
		super();
	
	}

	public Utilisateur(String nom, String email, Passager passager) {
		super();
		this.nom = nom;
		this.email = email;
		this.passager = passager;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Passager getPassager() {
		return passager;
	}

	public void setPassager(Passager passager) {
		this.passager = passager;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", email=" + email + "]";
	}

 
    
    
}

