package com.marketplace.rodrigo.entrypoint.rest.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class UsuarioResponse implements Serializable {
    private Long id;
    private Long idUsuario;
    private String nome;
    private String email;
    private LocalDateTime dataCriacao;
}
