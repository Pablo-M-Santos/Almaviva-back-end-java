package com.order_management_api.factory;

import com.order_management_api.domain.enums.TipoPedido;
import com.order_management_api.strategy.FreteStrategy;
import com.order_management_api.strategy.FreteNormal;
import com.order_management_api.strategy.FreteExpresso;
import org.springframework.stereotype.Component;

@Component
public class FreteFactory {

    private final FreteNormal normal;
    private final FreteExpresso expresso;

    public FreteFactory(FreteNormal normal, FreteExpresso expresso) {
        this.normal = normal;
        this.expresso = expresso;
    }

    public FreteStrategy getStrategy(TipoPedido tipo) {
        if (tipo == TipoPedido.EXPRESSO) {
            return expresso;
        }
        return normal;
    }
}