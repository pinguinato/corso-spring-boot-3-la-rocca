package com.demo.example.entities;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity	
@Table(name = "ingredienti")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ingredienti {
	@Id
	@Column(name = "codart")
	private String codArt;
	
	@Column(name = "info")
	private String info;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Articoli articolo;
}
