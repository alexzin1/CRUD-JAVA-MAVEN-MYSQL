package br.com.alexoliveira.springbootmysql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alexoliveira.springbootmysql.Models.User;

public interface UserRepo extends JpaRepository<User, Long>{
    
}
