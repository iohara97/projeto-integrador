package com.example.demo.repository;

import com.example.demo.entity.produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //corrigir classe produto ****
public interface ProdutoRepository extends JpaRepository <produto, Long> {
}