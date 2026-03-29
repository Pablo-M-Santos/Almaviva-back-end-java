package com.order_management_api.controller;

import com.order_management_api.domain.dto.PedidoRequestDTO;
import com.order_management_api.domain.dto.PedidoResponseDTO;
import com.order_management_api.service.PedidoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<PedidoResponseDTO> criar(
            @Valid @RequestBody PedidoRequestDTO dto
    ) {
        return ResponseEntity.ok(service.criar(dto));
    }
}