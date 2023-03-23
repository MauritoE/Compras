package com.example.compras.infrastructure.adapter;

import com.example.compras.domain.entities.Compra;
import com.example.compras.domain.service.CompraSaveService;
import com.example.compras.infrastructure.dto.CompraDto;
import com.example.compras.infrastructure.repository.CompraRespository;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CompraSaveAdapter implements CompraSaveService {

  private final CompraRespository compraRespository;

  public Compra saveCompra(Compra compra) {
    return buildCompra(compraRespository.save(buildCompraDto(compra)));
  }

  private Compra buildCompra(CompraDto compraDto){
    return new Compra(compraDto.getIdCompra(), compraDto.getTotal());
  }

  private CompraDto buildCompraDto(Compra compra){
    return new CompraDto(compra.getIdCompra(), compra.getTotal());
  }
}
