package com.crud.crudgradle.Repository;

import com.crud.crudgradle.Entity.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, String> {

}
