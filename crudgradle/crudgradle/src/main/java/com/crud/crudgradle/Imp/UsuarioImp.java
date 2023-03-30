package com.crud.crudgradle.Imp;

import com.crud.crudgradle.Entity.UsuarioModel;
import com.crud.crudgradle.Repository.UsuarioRepository;
import com.crud.crudgradle.Service.IServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UsuarioImp implements IServiceUsuario {
    @Autowired
    private UsuarioRepository usuarioR;

    @Override
    public ResponseEntity<List<UsuarioModel>> listarUsuarios() {
        try {
            List<UsuarioModel>usuario=new ArrayList<UsuarioModel>();

            usuarioR.findAll().forEach(usuario ::add);
            return new ResponseEntity<>(usuario, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
