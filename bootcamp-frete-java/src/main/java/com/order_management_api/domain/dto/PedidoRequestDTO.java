package com.order_management_api.domain.dto;


import com.order_management_api.domain.enums.TipoPedido;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PedidoRequestDTO {

    @NotNull(message = "O valor é obrigatório")
    @Positive(message = "O valor deve ser maior que zero")
    private Double valor;

    @NotNull(message = "O tipo do pedido é obrigatório")
    private TipoPedido tipo;
}