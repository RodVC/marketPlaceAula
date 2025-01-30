package com.marketplace.rodrigo.infra.jpa.entity;

import com.marketplace.rodrigo.cross.constants.ConstantsDb;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(schema = ConstantsDb.TAB_USUARIO,name=ConstantsDb.TAB_PRODUTO)
public class UsuarioJpa implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idUsuario;

    @Column(name="nome")
    private String nome;

    @Column(name="email")
    private String email;

    @Column(name="senha")
    private String senha;

    @Column(name="dataCriacao")
    private LocalDateTime dataCriacao;
}
