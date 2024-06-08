package com.demo.example.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.demo.example.entities.Articoli;

@Service
public class ArticoliServiceImpl implements ArticoliService {
	
	private static List<Articoli> getArticoli() {
		List<Articoli> articoli = new ArrayList<>();
		
		articoli.add(new Articoli("014600301", "BARILLA FARINA 1 KG", "PZ", 24, 1, 1.09));
		articoli.add(new Articoli("013600450", "BARILLA PASTA GR. 500 N.70 1/2 PENNE", "PZ", 30, 0.5, 1.39));
		articoli.add(new Articoli("014600234", "FINDUS FIOR DI NASELLO 30 GR.", "PZ", 8, 0.3, 4.59));
		articoli.add(new Articoli("014600235", "FINDUS CROCCOLE 500 GR.", "PZ", 12, 0.4, 3.99));
		
		return articoli;
	}
	
	@Override
	public List<Articoli> selAll() {
		return getArticoli();
	}
	
}
