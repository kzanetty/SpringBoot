package com.estudandoSpringBoot.aulaJPA.controllers;

import com.estudandoSpringBoot.aulaJPA.model.User;
import com.estudandoSpringBoot.aulaJPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/{id}")
    public User findUser(@PathVariable("id") Long id) {
        System.out.println("Id is: " + id);

        Optional<User> userFound = this.userRepository.findById(id);

        if(userFound.isPresent()) {
            return userFound.get();
        }
        return null;
    }

    @PostMapping("/")
    public User user(@RequestBody User user) {
        return this.userRepository.save(user);
    }

    @GetMapping("/list")
    public List<User> list(){
        return this.userRepository.findAll();
    }

//    @GetMapping("/list/{id}")
//    public List<User> listMoreThan(@PathVariable("id") Long id) {
//        return this.userRepository.findAllMoreThan(id);
//    }

    @GetMapping("/list/{id}")
    public List<User> listMoreThanDefault(@PathVariable("id") Long id) {
        return this.userRepository.findByIdGreaterThan(id);
    }

    @GetMapping("/findByName/{name}")
    public List<User> findByName(@PathVariable("name") String name) {
        return this.userRepository.findByNameIgnoreCase(name);
    }


}
