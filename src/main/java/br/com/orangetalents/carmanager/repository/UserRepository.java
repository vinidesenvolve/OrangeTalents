package br.com.orangetalents.carmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.orangetalents.carmanager.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsUserByEmail(String email);

    boolean existsUserByCpf(String cpf);
    
} 