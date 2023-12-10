package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Caso;
import com.example.demo.Entity.Usuario;

@Repository
public interface CasoRepository extends JpaRepository<Caso, Long> {

	@Query("SELECT c FROM Caso c")
    List<Caso> obtenerTodos();
}
