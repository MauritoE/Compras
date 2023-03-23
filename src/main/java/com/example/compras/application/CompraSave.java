package com.example.compras.application;

import com.example.compras.domain.entities.Compra;
import com.example.compras.domain.service.CompraSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CompraSave {

  private final CompraSaveService compraSaveService;

  public Compra saveCompra(Compra compra){
    return compraSaveService.saveCompra(compra);
  }
}
