package com.order_management_api;



import com.order_management_api.domain.dto.PedidoRequestDTO;
import com.order_management_api.domain.enums.TipoPedido;
import com.order_management_api.domain.model.Pedido;
import com.order_management_api.factory.FreteFactory;
import com.order_management_api.repository.PedidoRepository;
import com.order_management_api.service.PedidoService;
import com.order_management_api.strategy.FreteStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PedidoServiceTest {

    private final PedidoRepository repository = mock(PedidoRepository.class);
    private final FreteFactory factory = mock(FreteFactory.class);

    private final PedidoService service = new PedidoService(repository, factory);


    @Test
    void deveCriarPedidoComSucesso() {

        // cenário
        PedidoRequestDTO dto = new PedidoRequestDTO();
        dto.setValor(100.0);
        dto.setTipo(TipoPedido.NORMAL);

        FreteStrategy strategy = mock(FreteStrategy.class);

        when(factory.getStrategy(TipoPedido.NORMAL)).thenReturn(strategy);
        when(strategy.calcular(100.0)).thenReturn(10.0);

        Pedido pedidoSalvo = Pedido.builder()
                .id(1L)
                .valor(100.0)
                .tipo(TipoPedido.NORMAL)
                .frete(10.0)
                .build();

        when(repository.save(any(Pedido.class))).thenReturn(pedidoSalvo);

        // execução
        var response = service.criar(dto);

        // validação
        assertNotNull(response);
        assertEquals(1L, response.getId());
        assertEquals(10.0, response.getFrete());
    }


    @Test
    void deveLancarErroQuandoValorInvalido() {

        PedidoRequestDTO dto = new PedidoRequestDTO();
        dto.setValor(0.0);
        dto.setTipo(TipoPedido.NORMAL);

        assertThrows(RuntimeException.class, () -> {
            service.criar(dto);
        });
    }

}