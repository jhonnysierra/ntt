package com.prueba.ntt.model;


import lombok.Data;

@Data
public class Cliente {

    private String tipoDocumento;
    private String numeroDocuento;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefono;
    private String direccion;
    private String ciudadResidencia;


}
