package com.marketplace.rodrigo.infra.jpa.entity;


import com.marketplace.rodrigo.cross.constants.ConstantsDb;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(schema = ConstantsDb.TAB_CATEGORIA,name=ConstantsDb.TAB_CATEGORIA)
public class CategoriaJpa implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idCategoria;

    @Column(name="nome")
    private String nome;
}
