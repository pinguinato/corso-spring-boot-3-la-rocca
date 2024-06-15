package com.demo.example.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "articoli")
public class Articoli {
	@Id
	@Column(name = "codart")
	private String codArt;
	
	@Column(name = "descrizione")
	private String descrizione;

	@Column(name = "um")
	private String um;
	
	@Column(name = "codstat")
	private String codStat;
	
	@Column(name = "pzcart")
	private Integer pzCart;
	
	@Column(name = "pesonetto")
	private double pesoNetto;
	
	@Column(name = "idstatoart")
	private double idStatoArt;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "datacreazione")
	private Date dataCreaz;
}
