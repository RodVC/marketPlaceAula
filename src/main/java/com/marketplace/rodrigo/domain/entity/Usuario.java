package com.marketplace.rodrigo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private long idUsuario;
    private String nome;
    private String email;
    private String senha;
    private LocalDateTime dataCriacao;


}


