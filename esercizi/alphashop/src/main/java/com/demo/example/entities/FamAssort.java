package com.demo.example.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity	
@Table(name = "famassort")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FamAssort {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "descrizione")
	private String descrizione;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "famAssort")
	private Set<Articoli> articoli = new HashSet<>(); 
}
