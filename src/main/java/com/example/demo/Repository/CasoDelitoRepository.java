package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Caso;
import com.example.demo.Entity.CasoDelito;

@Repository
public interface CasoDelitoRepository extends JpaRepository<CasoDelito, Long> {

	@Query("SELECT c FROM CasoDelito c")
    List<CasoDelito> obtenerTodos();
}

