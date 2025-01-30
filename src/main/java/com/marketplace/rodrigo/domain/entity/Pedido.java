package com.marketplace.rodrigo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    private Long idPedido;
    private Long idUsuario;
    private BigDecimal total;
    private LocalDateTime dataPedido;
    private String status;
    private List<Produto> pedidoProdutoLista;

}
