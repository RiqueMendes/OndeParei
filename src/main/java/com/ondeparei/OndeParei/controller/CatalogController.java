package com.ondeparei.OndeParei.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ondeparei.OndeParei.model.Catalog;
import com.ondeparei.OndeParei.repository.CatalogRepository;



    @RestController
    @RequestMapping("/catalog")
    @CrossOrigin("*")
    
    public class CatalogController {

        @Autowired
        private CatalogRepository repository;

        @GetMapping
        public ResponseEntity<List<Catalog>> GetAll(){
            
            return ResponseEntity.ok(repository.findAll());

        }
        
        @GetMapping("/{id}")
        public ResponseEntity<Catalog> GetById(@PathVariable long id) {

            return repository.findById(id)
                    .map(resp -> ResponseEntity.ok(resp))
                    .orElse(ResponseEntity.notFound().build());
                    
        }
         @GetMapping ("/author/{author}")
        public ResponseEntity <List<Catalog>>GetByCat_name(@PathVariable String author){
                return ResponseEntity.ok(repository.findAllByAuthorContainingIgnoreCase(author));
        }
        
        @PostMapping
            public ResponseEntity<Catalog> post (@RequestBody Catalog catalog){
                return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(catalog));
        }
        
        @PutMapping
        public ResponseEntity<Catalog> put (@RequestBody Catalog catalog){
            return ResponseEntity.status(HttpStatus.OK).body(repository.save(catalog));
        }
        
        @DeleteMapping("/{id}")
        public void delete (@PathVariable long id){
            repository.deleteById(id);
        } 


    }
