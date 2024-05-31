package com.demo.example.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.demo.example.entities.Articoli;

@Service
public class ArticoliServiceImpl implements ArticoliService {
	
	@Override
	public List<Articoli> selAll() {
		return new ArrayList<>();
	}
	
}
