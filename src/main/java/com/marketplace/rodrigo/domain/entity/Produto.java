package com.marketplace.rodrigo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    private Long idProduto;
    private Long idCategoria;
    private String nome;
    private BigDecimal preco;
    private int quantidade;
    private List<Avaliacao> produtoAvaliacaoLista;
}
