package com.marketplace.rodrigo.entrypoint.rest.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
public class UsuarioRequest implements Serializable {
    private Long id;
    private Long idUsuario;
    private String nome;
    private String email;
    private String senha;
    private LocalDateTime dataCriacao;
}
