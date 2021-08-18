package fr.eql.ai109.tontapat.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "notification")
public class Notification implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "action")
    private String action; 
    @Column(name = "etat")
    private String etat; 
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPrestation", referencedColumnName = "id_prestation")
    private Prestation prestation; 
    public Notification() {
        super();
        // TODO Auto-generated constructor stub
    }


    public Notification(int id,Prestation prestation) {
        super();
        this.id = id;
        this.prestation = prestation;
    }
    
    public Notification(int id, String etat, Prestation prestation) {
        super();
        this.id = id;
        this.etat = etat;
        this.prestation = prestation;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public Prestation getPrestation() {
        return prestation;
    }


    public void setPrestation(Prestation prestation) {
        this.prestation = prestation;
    }


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}
}