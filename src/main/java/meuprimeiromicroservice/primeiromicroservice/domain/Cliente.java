
package meuprimeiromicroservice.primeiromicroservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "meu_cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cliente { 
    
    @Id
    @GeneratedValue    
    private Long id;
    
    @Column(name = "name", length = 255, nullable = false)
    private String name;    
    
    
}
