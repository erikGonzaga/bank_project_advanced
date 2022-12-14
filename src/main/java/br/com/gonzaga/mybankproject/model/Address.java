package br.com.gonzaga.mybankproject.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

// Camada de Modelo (Model), conforme padrão M.V.C.

// Lombok
@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

// Hibernate
@Entity
@Table(name = "address")
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cep;
    private String city;
    private String state;

    @Column(name = "house_number")
    private String number;

    private String address;

    @Column(name = "second_address")
    private String secondAddress;

}
