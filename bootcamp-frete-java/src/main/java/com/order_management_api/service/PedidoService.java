package com.order_management_api.service;

import com.order_management_api.domain.dto.PedidoRequestDTO;
import com.order_management_api.domain.dto.PedidoResponseDTO;
import com.order_management_api.domain.model.Pedido;
import com.order_management_api.factory.FreteFactory;
import com.order_management_api.repository.PedidoRepository;
import com.order_management_api.strategy.FreteStrategy;
import org.springframework.stereotype.Service;


@Service
public class PedidoService {

    private final PedidoRepository repository;
    private final FreteFactory factory;

    public PedidoService(PedidoRepository repository, FreteFactory factory) {
        this.repository = repository;
        this.factory = factory;
    }

    public PedidoResponseDTO criar(PedidoRequestDTO dto) {


        FreteStrategy strategy = factory.getStrategy(dto.getTipo());


        Double frete = strategy.calcular(dto.getValor());


        Pedido pedido = Pedido.builder()
                .valor(dto.getValor())
                .tipo(dto.getTipo())
                .frete(frete)
                .build();

        Pedido salvo = repository.save(pedido);


        return PedidoResponseDTO.builder()
                .id(salvo.getId())
                .valor(salvo.getValor())
                .frete(salvo.getFrete())
                .tipo(salvo.getTipo())
                .build();
    }
}
