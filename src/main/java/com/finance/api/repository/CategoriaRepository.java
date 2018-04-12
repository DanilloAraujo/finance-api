package com.finance.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
