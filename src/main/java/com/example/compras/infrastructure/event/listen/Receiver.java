package com.example.compras.infrastructure.event.listen;

import com.example.compras.domain.entities.Compra;
import com.example.compras.infrastructure.api.controller.CompraController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
@Slf4j
public class Receiver {

  private final ObjectMapper objectMapper;
  public static String RECEIVE_METHOD_NAME = "receiveMessage";
  public final CompraController compraController;

  public void receiveMessage(byte[] message) throws JsonProcessingException {
    String messageConvert = new String(message, StandardCharsets.UTF_8);
    Compra compra = objectMapper.readValue(messageConvert,Compra.class);

    log.info("Received message [ {} ]", compra);
  }
}
