package com.demo.example.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity	
@Table(name = "iva")
public class Iva {
	@Id
	@Column(name = "idiva")
	private Integer idIva;
	
	@Column(name = "descrizione")
	private String descrizione;
	
	@Column(name = "aliquota")
	private Integer aliquota;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy ="iva")
	private Set<Articoli> articoli = new HashSet<>(); 
}
