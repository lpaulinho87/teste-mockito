package br.com.aulasmockito.demo.services.impl;

import br.com.aulasmockito.demo.domain.User;
import br.com.aulasmockito.demo.repositories.UserRepository;
import br.com.aulasmockito.demo.services.UserService;
import br.com.aulasmockito.demo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Usuário Não encontrado"));
    }
}
