package com.business.project.ms_comunicacao.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/notificacoes")
public sealed interface INotificacaoController permits NotificacaoController {

    @Operation(
            summary = "Enviar notificação",
            description = "Envia uma notificação com a mensagem fornecida",
            responses = {
                @ApiResponse(responseCode = "200", description = "Notificação enviada com sucesso")
            })
    @PostMapping
    String enviar(@RequestParam("mensagem") String mensagem);
}
