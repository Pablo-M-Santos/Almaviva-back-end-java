package com.order_management_api.domain.dto;

import com.order_management_api.domain.enums.TipoPedido;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class PedidoResponseDTO {

    private Long id;
    private Double valor;
    private Double frete;
    private TipoPedido tipo;
}