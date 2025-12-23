package com.business.project.ms_comunicacao.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/notificacoes")
public class NotificacaoController {

    @PostMapping
    public String enviar(@RequestParam("mensagem") String mensagem) {
        log.info("Enviando notificação com a mensagem: {}", mensagem);
        return "Mensagem: " + mensagem + " enviada com sucesso!";
    }
}
