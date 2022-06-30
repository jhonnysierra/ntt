package com.prueba.ntt.service;

import com.prueba.ntt.model.Cliente;
import org.springframework.http.ResponseEntity;

public interface IClienteService {

    ResponseEntity<Cliente> consultarCliente(String tipoDocumento, String numeroDocumento);
}
