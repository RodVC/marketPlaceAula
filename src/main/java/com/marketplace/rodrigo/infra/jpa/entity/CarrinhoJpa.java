package com.marketplace.rodrigo.infra.jpa.entity;

import com.marketplace.rodrigo.cross.constants.ConstantsDb;
import com.marketplace.rodrigo.domain.entity.Produto;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema = ConstantsDb.TAB_CARRINHO,name=ConstantsDb.TAB_CARRINHO)
public class CarrinhoJpa implements Serializable { //SerialLizable faz a conversao de dados automaticamente entre tipos iguais

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="id_usuario",referencedColumnName = "id")
    private Long idUsuario;

    @OneToMany(mappedBy="produto",orphanRemoval=true,cascade=CascadeType.ALL)
    private List<Produto> produtoCarrinhoLista = new ArrayList<>();

    @Column(name="quantidade")
    private int quantidade;
}
