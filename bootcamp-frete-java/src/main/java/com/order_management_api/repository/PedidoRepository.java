package com.order_management_api.repository;

import com.order_management_api.domain.enums.TipoPedido;
import com.order_management_api.domain.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByTipo(TipoPedido tipo);
}
