package com.prueba.ntt;

import com.prueba.ntt.model.Cliente;
import com.prueba.ntt.service.impl.ClienteServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;


@SpringBootTest
class ServiceUnitTest {
	private ClienteServiceImpl clienteService = new ClienteServiceImpl();

	@Test
	void consultarClienteTest(){
	ResponseEntity res= clienteService.consultarCliente("C","23445322");
	Cliente cliente= (Cliente) res.getBody();
		Assertions.assertEquals(res.getStatusCodeValue(),200);
		Assertions.assertEquals(cliente.getNumeroDocuento(),"23445322");
	}
}
