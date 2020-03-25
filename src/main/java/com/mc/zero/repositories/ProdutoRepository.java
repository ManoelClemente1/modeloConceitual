package com.mc.zero.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mc.zero.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
