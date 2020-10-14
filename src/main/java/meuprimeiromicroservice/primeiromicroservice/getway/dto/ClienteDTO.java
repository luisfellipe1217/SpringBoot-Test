/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprimeiromicroservice.primeiromicroservice.getway.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClienteDTO {
    
    private String name;
    private Long id;

    public ClienteDTO(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public ClienteDTO() {
    }
    
    
}
