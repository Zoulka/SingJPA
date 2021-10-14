package com.example.springjpa.Produit.InterfaceProduit;

import com.example.springjpa.Produit.Produits;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitsInterface {
    public Produits save(Produits p);
    public List<Produits> findAll();
    public Produits findOne(Long id);
    public void remove(Long id);
    public void update (Produits p);
    public List<Produits> findBydesignation(String des);

}
