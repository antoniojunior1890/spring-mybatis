package com.antonio.example.mybatis.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

//    @Size(min = 2, max = 5, message = "Tamanho nome inválido.")
//    @NotBlank(message = "Nome inválido.")
    private String name;

//    @Size(min = 2, max = 5, message = "Tamanho descrição inválido.")
//    @NotBlank(message = "Descrição inválido.")
    private String description;

    @Min(value = 0, message = "Price maior que zero")
    private double price;

}
