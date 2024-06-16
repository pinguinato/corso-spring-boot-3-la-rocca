package com.demo.example.entities;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "barcode")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Barcode {
	
	@Id
	@Column(name = "barcode")
	private String barcode;
	
	@Column(name = "idtipoart")
	private String idTipoArt;
	
	@ManyToOne
	@JoinColumn(name = "codart", referencedColumnName = "codArt")
	private Articoli articolo;
}
