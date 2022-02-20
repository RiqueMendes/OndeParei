package com.ondeparei.OndeParei.repository;


import java.util.List;

import com.ondeparei.OndeParei.model.Catalog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository extends JpaRepository<Catalog, Long>{

    public List<Catalog> findAllByAuthorContainingIgnoreCase (String author);

}