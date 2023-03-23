package com.example.compras.infrastructure.repository;

import com.example.compras.infrastructure.dto.CompraDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRespository extends JpaRepository<CompraDto,Integer> {

}
