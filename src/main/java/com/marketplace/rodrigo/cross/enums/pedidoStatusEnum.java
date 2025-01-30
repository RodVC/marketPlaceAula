package com.marketplace.rodrigo.cross.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum pedidoStatusEnum {
    PENDENTE(1L,"Pendente"),
    PROCESSANDO(2L, "Processando"),
    PROCESSADO(3L,"Processando"),
    ENVIADO(4L,"Enviado"),
    ENTREGUE(5L,"Entregue"),
    CANCELADO(6L,"Cancelado"),
    DEVOLVIDO(7L,"Devolvido");

    private Long id;
    private String descricao;

    public static pedidoStatusEnum fromId(Long id){
        for(pedidoStatusEnum type : values()){
            if(type.getId().equals(id)){
                return type;
            }

        }
        return null;
    }


}
