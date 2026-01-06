package com.business.project.ms_comunicacao.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public final class NotificacaoController implements INotificacaoController {

    @Override
    public String enviar(String mensagem) {
        log.info("Enviando notificação com a mensagem: {}", mensagem);
        return "Mensagem: " + mensagem + " enviada com sucesso!";
    }
}
