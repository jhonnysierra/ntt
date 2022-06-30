package com.prueba.ntt;

import com.prueba.ntt.controller.ClienteController;
import com.prueba.ntt.model.Cliente;
import com.prueba.ntt.service.impl.ClienteServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
public class ControllerUnitTest {
    private ClienteController clienteController;
    private ClienteServiceImpl clienteService;
    private Cliente cliente;
    private ResponseEntity responseEntity;


    @BeforeEach
    public void setUp(){
        cliente= new Cliente();
        cliente.setTipoDocumento("C");
        cliente.setNumeroDocuento("23445322");
        cliente.setPrimerNombre("pedro");
        cliente.setSegundoNombre("pablo");
        cliente.setPrimerApellido("perez");
        cliente.setSegundoApellido("pinzon");
        cliente.setTelefono("3206450928");
        cliente.setDireccion("kra 10 # 23-34");
        cliente.setCiudadResidencia("Calcedonia");

        clienteService= Mockito.mock(ClienteServiceImpl.class);
        clienteController= new ClienteController(clienteService);
        responseEntity=new ResponseEntity(cliente, HttpStatus.OK);
    }

    @Test
    public void consultarClienteControllerTest(){
        Mockito.when(clienteService.consultarCliente("","")).thenReturn(responseEntity);
        ResponseEntity responseEntityC= clienteController.consultarCliente("","");

        Assertions.assertEquals(responseEntityC.getStatusCode(),HttpStatus.OK);
       // System.out.println(cliente);
       // System.out.println((Cliente) responseEntityC.getBody());
        Assertions.assertEquals((Cliente) responseEntityC.getBody(),cliente);
    }
}
