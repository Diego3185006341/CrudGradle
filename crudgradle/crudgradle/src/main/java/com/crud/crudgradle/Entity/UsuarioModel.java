package com.crud.crudgradle.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(schema="bd_tienda_test", name="tabla_Usuarios")
public class UsuarioModel {
    @Id
    @Column(name="cedula_usuario",unique=true)
    public String cedula_Usuario;

    @Column(name="nombre_usuario")
    public String nombre_Usuario;

    @Column(name="correo_usuario")
    public String correo_Usuario;
    @Column(name="usuario")
    public String usuario;

    @Column(name="clave_usuario")
    public String clave_Usuario;
    @Column(name="fecha_ingreso")
    public LocalDate fecha_Ingreso;

}
