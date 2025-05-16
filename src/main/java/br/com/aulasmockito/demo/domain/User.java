package br.com.aulasmockito.demo.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Users")
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @Column(unique = true)
    private String email;
    private String password;

}
