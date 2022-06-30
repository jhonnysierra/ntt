package com.prueba.ntt.controller;

import com.prueba.ntt.model.Cliente;
import com.prueba.ntt.service.IClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app/api/v1/")
public class ClienteController {
    private final IClienteService iClienteService;

    public ClienteController(IClienteService iClienteService) {
        this.iClienteService = iClienteService;
    }

    @GetMapping("obtener/cliente/{tipoDocumento}/{numeroDocumento}")
    public ResponseEntity<Cliente> consultarCliente(@PathVariable String tipoDocumento, @PathVariable String numeroDocumento ){
        return iClienteService.consultarCliente(tipoDocumento,numeroDocumento);
    }

}
