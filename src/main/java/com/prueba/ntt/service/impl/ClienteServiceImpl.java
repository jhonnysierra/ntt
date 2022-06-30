package com.prueba.ntt.service.impl;

import com.prueba.ntt.model.Cliente;
import com.prueba.ntt.service.IClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements IClienteService {

    private Cliente cliente = new Cliente();


    public ClienteServiceImpl(){
        cliente.setTipoDocumento("C");
        cliente.setNumeroDocuento("23445322");
        cliente.setPrimerNombre("pedro");
        cliente.setSegundoNombre("pablo");
        cliente.setPrimerApellido("perez");
        cliente.setSegundoApellido("pinzon");
        cliente.setTelefono("3206450928");
        cliente.setDireccion("kra 10 # 23-34");
        cliente.setCiudadResidencia("Calcedonia");
    }

    @Override
    public ResponseEntity<Cliente> consultarCliente(String tipoDocumento, String numeroDocumento) {

        if(tipoDocumento !=null && numeroDocumento!=null){
            if(tipoDocumento.equals("C") && numeroDocumento.equals("23445322")){
                return new ResponseEntity<Cliente>(cliente,HttpStatus.OK);
            }
            else{
                return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
            }
        }else{
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }
    }
}
