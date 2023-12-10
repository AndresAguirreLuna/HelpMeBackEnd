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

import com.example.demo.Entity.Usuario;
import com.example.demo.Repository.UsuarioRepository;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioService {

	private UsuarioRepository usuarioRepository;

	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

	@GetMapping("/todos")
    public List<Usuario> obtenerTodos() {
        return usuarioRepository.obtenerTodos();
    }
	
	@PostMapping("/buscar")
    public ResponseEntity<Usuario> buscarUsuario(@RequestBody Usuario request) {
        String nombre = request.getUserName();
        String password = request.getPassWord();

        Optional<Usuario> usuario = usuarioRepository.findByNombreAndPassword(nombre, password);

        return usuario.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

	@PostMapping("/insertar")
    public ResponseEntity<String> insertarUsuario(@RequestBody Usuario request) {
		Usuario nuevoUsuario = new Usuario();
		nuevoUsuario.setUserName(request.getUserName());
		nuevoUsuario.setNombre(request.getNombre());
		nuevoUsuario.setApellido(request.getApellido());
		nuevoUsuario.setPassWord(request.getPassWord());
		nuevoUsuario.setEstado(request.getEstado());
		nuevoUsuario.setRedSocial(request.getRedSocial());
		nuevoUsuario.setIdRol(request.getIdRol());
		
		usuarioRepository.save(nuevoUsuario);
		
		return ResponseEntity.ok("Usuario insertado correctamente.");
    }	
}

