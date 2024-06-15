package com.demo.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
}
