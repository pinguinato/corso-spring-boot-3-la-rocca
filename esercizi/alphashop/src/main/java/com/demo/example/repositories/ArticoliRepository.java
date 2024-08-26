package com.demo.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.demo.example.entities.Articoli;
import org.springframework.data.domain.Pageable;

@Repository
public interface ArticoliRepository extends JpaRepository<Articoli, String> {
	
	// query method example
	Articoli findByCodArt(String codArt);
	
	// query method example
	List<Articoli> findByDescrizioneLike(String descrizione, Pageable pageable);
	
	// query method example
	List<Articoli> findByCodStatOrderByDescrizione(String codStat);

	// JPQL method example
	@Query(value = "SELECT a FROM Articoli a JOIN a.barcode b WHERE b.barcode IN (:ean)")
	Articoli selByEan(@Param("ean") String ean);
	
	// native query method example
	@Query(value = "SELECT COUNT(*) FROM ARTICOLI WHERE DESCRIZIONE LIKE :desArt", nativeQuery = true)
	int countRecords(@Param("desArt") String descrizione);
}
