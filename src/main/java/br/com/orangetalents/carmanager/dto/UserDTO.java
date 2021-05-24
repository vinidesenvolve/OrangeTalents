package br.com.orangetalents.carmanager.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import br.com.orangetalents.carmanager.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDTO {
    
    
    private Long id;

    @NotBlank(message = "{NotBlank}")
    private String name;

    @NotBlank(message = "{NotBlank}")
    @Email(message = "{Email}")
    private String email;

    @NotBlank(message = "{NotBlank}")
    private String cpf;

    @NotBlank(message = "{NotBlank}")
    private String dob;

    public UserDTO(User entity) {
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        cpf = entity.getCpf();
        dob = entity.getDob();
    }
 
}
 