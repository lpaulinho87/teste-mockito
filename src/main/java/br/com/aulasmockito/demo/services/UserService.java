package br.com.aulasmockito.demo.services;

import br.com.aulasmockito.demo.domain.User;

import java.util.List;

public interface UserService {
    public User findById(Integer id);

    public List<User> findAll();
}
