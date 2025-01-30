package com.marketplace.rodrigo.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Avaliacao {
        private Long idAvaliacao;
        private Long idProduto;
        private Long idUsuario;
        private int nota;
        private String comentario;
}
