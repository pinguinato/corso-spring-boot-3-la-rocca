package com.demo.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "barcode")
public class Barcode {
	
	@Id
	@Column(name = "barcode")
	private String barcode;
	
	@Column(name = "idtipoart")
	private String idTipoArt;
}
