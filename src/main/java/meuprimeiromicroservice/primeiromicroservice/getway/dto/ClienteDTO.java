/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprimeiromicroservice.primeiromicroservice.getway.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClienteDTO {
    
    @NotNull
    @NotEmpty
    private String name;    
    private Long id;       
   
}
