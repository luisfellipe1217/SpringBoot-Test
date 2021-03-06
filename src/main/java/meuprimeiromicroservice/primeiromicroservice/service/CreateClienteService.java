/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprimeiromicroservice.primeiromicroservice.service;

import lombok.extern.log4j.Log4j2;
import meuprimeiromicroservice.primeiromicroservice.domain.Cliente;
import meuprimeiromicroservice.primeiromicroservice.getway.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author luis
 */
 @Service
 @Log4j2
public class CreateClienteService {
     
     
     @Autowired
     private ClienteRepository clienteRepository;
   
     public void execute(Cliente cliente){       
              
         log.info("Gravando Cleinte...");         
         clienteRepository.save(cliente);
         log.info("Cliente gerado com o ID=" + cliente.getId());
     }
    
}
