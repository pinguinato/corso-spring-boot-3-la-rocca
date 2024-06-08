package com.demo.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Articoli {
	private String codArt;
	private String descrizione;
	private String um;
	private int pzcart;
	private double pesonetto;
	private double prezzo;
}
