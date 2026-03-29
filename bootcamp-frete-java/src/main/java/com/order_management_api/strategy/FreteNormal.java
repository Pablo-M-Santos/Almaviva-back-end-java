package com.order_management_api.strategy;

import org.springframework.stereotype.Component;

@Component
public class FreteNormal implements FreteStrategy {

    @Override
    public Double calcular(Double valor) {
        return valor * 0.1;
    }
}