package com.marketplace.rodrigo.infra.jpa.entity;
import com.marketplace.rodrigo.cross.constants.ConstantsDb;
import com.marketplace.rodrigo.domain.entity.Avaliacao;
import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(schema = ConstantsDb.TAB_PRODUTO,name=ConstantsDb.TAB_PRODUTO)
public class ProdutoJpa implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idProduto;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="id_categoria",referencedColumnName = "id")
    private Long idCategoria;

    @Column(name="nome")
    private String nome;

    @Column(name="preco")
    private BigDecimal preco;

    @Column(name="quantidade")
    private int quantidade;

    @OneToMany(mappedBy="avaliacao",orphanRemoval=true,cascade=CascadeType.ALL)
    private List<Avaliacao> avaliacaoProdutoLista = new ArrayList<>();

}
