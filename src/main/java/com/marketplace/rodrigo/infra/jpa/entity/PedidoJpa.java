package com.marketplace.rodrigo.infra.jpa.entity;

import com.marketplace.rodrigo.cross.constants.ConstantsDb;
import com.marketplace.rodrigo.domain.entity.Produto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
@Table(schema= ConstantsDb.TAB_PEDIDO,name=ConstantsDb.TAB_AVALIACAO)
public class PedidoJpa {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idPedido;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="id_usuario",referencedColumnName = "id")
    private Long idUsuario;

    @Column(name="total")
    private BigDecimal total;

    @Column(name="quantidade")
    private LocalDateTime dataPedido;

    @Column(name="dt_pedido")
    private String status;

    @OneToMany(mappedBy="produto",orphanRemoval=true,cascade=CascadeType.ALL)
    private List<Produto> produtoPedidoLista = new ArrayList<>();
}
