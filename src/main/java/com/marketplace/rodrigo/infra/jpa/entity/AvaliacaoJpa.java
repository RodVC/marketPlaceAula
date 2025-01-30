package com.marketplace.rodrigo.infra.jpa.entity;

import com.marketplace.rodrigo.cross.constants.ConstantsDb;
import com.marketplace.rodrigo.domain.entity.Produto;
import com.marketplace.rodrigo.domain.entity.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(schema= ConstantsDb.TAB_AVALIACAO,name=ConstantsDb.TAB_AVALIACAO)
public class AvaliacaoJpa implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idAvaliacao;


    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="id_produto",referencedColumnName = "id")
    private Produto idProduto;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="id_usuario",referencedColumnName = "id")
    private Usuario idUsuario;

    @Column(name="nota")
    private int nota;

    @Column(name="comentario")
    private String comentario;
}
