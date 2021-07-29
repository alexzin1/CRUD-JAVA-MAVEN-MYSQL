package br.com.alexoliveira.springbootmysql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alexoliveira.springbootmysql.Models.User;
import br.com.alexoliveira.springbootmysql.Repository.UserRepo;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class ApiController {


    @Autowired // faz todas as dependencias para mim, procura uma classe que combina com a propriedade por exemplo @getmapping com get
    private UserRepo userRepo;

    
    @GetMapping("/")  //da um oi na home
    public String getPage(){
        return "Olá mundo";
    }

    @GetMapping(value = "/users") // acha todos os users
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @PostMapping(value = "/save") // salva um user
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "Usuário salvo...";
    }

    @PutMapping(value="update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user) {
        User updateUser = userRepo.findById(id).get();
        updateUser.setNome(user.getNome());
        updateUser.setIdade(user.getIdade());
        updateUser.setOcupacao(user.getOcupacao());
        userRepo.save(updateUser);
        return "Alterado com sucesso...";
    }

    @DeleteMapping (value = "/delete/{id")
    public String deleteUser(@PathVariable long id){
        User deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);
        return "Usuario com o id: " + id + "deletado!";
    }
}
