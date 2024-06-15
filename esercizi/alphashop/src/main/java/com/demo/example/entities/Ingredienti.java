package com.demo.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity	
@Table(name = "ingredienti")
public class Ingredienti {
	@Id
	@Column(name = "codart")
	private String codArt;
	
	@Column(name = "info")
	private String info;
}
