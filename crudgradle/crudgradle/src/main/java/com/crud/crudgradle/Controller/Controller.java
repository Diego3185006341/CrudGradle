package com.crud.crudgradle.Controller;

import com.crud.crudgradle.Entity.UsuarioModel;
import com.crud.crudgradle.Service.IServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
	@Autowired
    private IServiceUsuario serviceUsuario;
    @GetMapping("/listarUsuario")
    public ResponseEntity<List<UsuarioModel>> listarUsuario()
    {

        return serviceUsuario.listarUsuarios();
    }
}
