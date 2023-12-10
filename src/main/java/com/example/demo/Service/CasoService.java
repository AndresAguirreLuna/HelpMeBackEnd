package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Caso;
import com.example.demo.Entity.CasoDelito;
import com.example.demo.Entity.Usuario;
import com.example.demo.Repository.CasoRepository;

@RestController
@RequestMapping("/api/caso")
public class CasoService {
	private CasoRepository casoRepository;
	
	@Autowired
	public CasoService(CasoRepository casoRepository) {
        this.casoRepository = casoRepository;
    }
	
	@GetMapping("/todos")
    public List<Caso> obtenerTodos() {
        return casoRepository.obtenerTodos();
    }

	@PostMapping("/insertar")
    public ResponseEntity<Long> insertarCaso(@RequestBody Caso request) {
		Caso nuevoCaso = new Caso();
		nuevoCaso.setfecha(request.getfecha());
		nuevoCaso.setLatitud(request.getLatitud());
		nuevoCaso.setLongitud(request.getLongitud());
		nuevoCaso.setEstado(request.getEstado());
		nuevoCaso.setDetalle(request.getDetalle());
		nuevoCaso.setUrlmap(request.getUrlmap());
		nuevoCaso.setIdusuario(request.getIdusuario());
		
		Caso casoGuardado = casoRepository.save(nuevoCaso);

	    return ResponseEntity.ok(casoGuardado.getId());
    }	
	
}
