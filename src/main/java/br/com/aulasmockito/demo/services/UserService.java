package br.com.aulasmockito.demo.services;

import br.com.aulasmockito.demo.domain.User;
import br.com.aulasmockito.demo.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
}
