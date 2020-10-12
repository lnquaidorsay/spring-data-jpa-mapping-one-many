package com.lelo.jpa.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@ToString
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @OneToMany(mappedBy = "cl",cascade = CascadeType.ALL)
    //@JoinTable(name = "produit_id")
    private List<Produit> produit;
}
