package br.com.orangetalents.carmanager.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.orangetalents.carmanager.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserCarsDTO {
    
    private Long id;
    private String name;
    private String email;
    private String cpf;
    private String dob;
    private List<CarDTO> cars;

    public UserCarsDTO(User entity) {
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        cpf = entity.getCpf();
        dob = entity.getDob();
        cars = entity.getCars().stream().map(car -> new CarDTO(car)).collect(Collectors.toList());
    }

}
 