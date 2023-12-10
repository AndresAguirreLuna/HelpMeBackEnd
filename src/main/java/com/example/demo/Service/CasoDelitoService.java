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
import com.example.demo.Repository.CasoDelitoRepository;
import com.example.demo.Repository.CasoRepository;

@RestController
@RequestMapping("/api/casoDelito")
public class CasoDelitoService {
	private CasoDelitoRepository casoDelitoRepository;

	@Autowired
	public CasoDelitoService(CasoDelitoRepository casoDelitoRepository) {
        this.casoDelitoRepository = casoDelitoRepository;
    }
	
	@PostMapping("/insertar")
    public ResponseEntity<Long> insertarCaso(@RequestBody CasoDelito request) {
		CasoDelito nuevoCasoDelito = new CasoDelito();
		nuevoCasoDelito.setIdcaso(request.getIdcaso());
		nuevoCasoDelito.setIddelito(request.getIddelito());
		
		CasoDelito casoDelitoGuardado = casoDelitoRepository.save(nuevoCasoDelito);

	    return ResponseEntity.ok(casoDelitoGuardado.getId());
    }	

	
}
