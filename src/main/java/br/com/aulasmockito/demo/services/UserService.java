package br.com.aulasmockito.demo.services;

import br.com.aulasmockito.demo.domain.User;

public interface UserService {
    public User findById(Integer id);
}
