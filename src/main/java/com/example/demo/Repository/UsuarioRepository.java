package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	@Query("SELECT u FROM Usuario u")
    List<Usuario> obtenerTodos();

	@Query("SELECT u FROM Usuario u WHERE u.userName = :nombre AND u.passWord = :password")
    Optional<Usuario> findByNombreAndPassword(@Param("nombre") String nombre, @Param("password") String password);
	
}
