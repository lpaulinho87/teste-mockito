package br.com.aulasmockito.demo.config;

import br.com.aulasmockito.demo.domain.User;
import br.com.aulasmockito.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public Integer startDB(){

        User u1 = new User(null,"Luis", "email.luis@email.com", "1234");
        User u2 = new User(null,"Paulo", "email.paulo@email.com", "1234");

        repository.saveAll(List.of(u1, u2));

        return 0;
    }
}
