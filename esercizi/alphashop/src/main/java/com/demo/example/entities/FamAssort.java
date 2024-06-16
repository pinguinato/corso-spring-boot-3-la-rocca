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
@Table(name = "famassort")
public class FamAssort {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "descrizione")
	private String descrizione;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "famAssort")
	private Set<Articoli> articoli = new HashSet<>(); 
}
