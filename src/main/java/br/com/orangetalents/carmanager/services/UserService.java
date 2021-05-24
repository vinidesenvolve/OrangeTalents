package br.com.orangetalents.carmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.orangetalents.carmanager.dto.UserCarsDTO;
import br.com.orangetalents.carmanager.dto.UserDTO;
import br.com.orangetalents.carmanager.model.User;
import br.com.orangetalents.carmanager.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    public UserRepository userRepo;

    @Autowired
    public CarService carService;

    public ResponseEntity<?> create(UserDTO userDTO){

        if(userRepo.existsUserByEmail(userDTO.getEmail())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Email já está cadastrado.");
        }

        if(userRepo.existsUserByCpf(userDTO.getCpf())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("CPF já está cadastrado.");
        }

        User user = new User();

        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setCpf(userDTO.getCpf());
        user.setDob(userDTO.getDob());

        userRepo.save(user);

        return ResponseEntity.status(HttpStatus.CREATED).body("Usuário cadastrado com sucesso!");
    }

    public ResponseEntity<?> findUserCarsById(Long id){
        
        if(userRepo.findById(id).isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Usuário não encontrado, verifique se o id é válido.");
        }

        User user = userRepo.findById(id).get();

        UserCarsDTO userCarsDTO = new UserCarsDTO(user);

        return ResponseEntity.status(HttpStatus.FOUND).body(userCarsDTO);
    }
} 
