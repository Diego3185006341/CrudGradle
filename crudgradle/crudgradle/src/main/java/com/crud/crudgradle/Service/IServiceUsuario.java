package com.crud.crudgradle.Service;

import com.crud.crudgradle.Entity.UsuarioModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IServiceUsuario {
    public ResponseEntity<List<UsuarioModel>> listarUsuarios();
}
