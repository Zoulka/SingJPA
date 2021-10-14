package com.example.springjpa.Produit.InterfaceProduit.Implementation;


import com.example.springjpa.Produit.Produits;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
// ici c'est ma classe DAO
public class ProduitsImplementation extends Produits {
    @PersistenceContext //Permet de creer la connexion
    private EntityManager entityManager;


    public Produits save(Produits p){
        entityManager.persist(p);
        return p;
    }

    public List<Produits> findAll() {
        Query req = entityManager.createQuery("select p from Produits ");
        return req.getResultList();
    }
public Produits findOne(Long id){
        Produits p=entityManager.find(Produits.class, id);
        return p;
}
public void remove (Long id){
        Produits p=entityManager.find(Produits.class, id);
        entityManager.remove(p);

}
}
