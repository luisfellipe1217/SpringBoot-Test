/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprimeiromicroservice.primeiromicroservice.getway.http;

import javax.validation.Valid;
import lombok.extern.log4j.Log4j2;
import meuprimeiromicroservice.primeiromicroservice.domain.Cliente;
import meuprimeiromicroservice.primeiromicroservice.getway.dto.ClienteDTO;
import meuprimeiromicroservice.primeiromicroservice.service.CreateClienteService;
import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Log4j2
public class ClienteResources {
    
    @Autowired
    private CreateClienteService createClienteService;
    
    
    @PostMapping("meu/cliente")    
    public void setCliente(@Valid ClienteDTO clientedto){
        
        log.info("meu cliente é" + clientedto.getName());
        
        createClienteService.execute(Cliente.builder()
                .id(clientedto.getId())
                .name(clientedto.getName())
                .build());
        
    }
    
    @GetMapping("meu/cliente")
    public ClienteDTO getCliente(){
        return ClienteDTO.builder().id(1L).name("Luis").build();        
    
    }
}
