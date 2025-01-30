package com.marketplace.rodrigo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Carrinho {
    private Long idUsuario;
    private int quantidade;
    private List<Produto> produtoLista;

}
