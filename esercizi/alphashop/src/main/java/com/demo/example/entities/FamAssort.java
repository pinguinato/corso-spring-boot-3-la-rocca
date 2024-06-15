package com.demo.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity	
@Table(name = "famassort")
public class FamAssort {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "descrizione")
	private String descrizione;
}
