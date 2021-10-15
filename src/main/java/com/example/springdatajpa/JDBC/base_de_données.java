package com.example.springdatajpa.JDBC;

import com.example.springdatajpa.DAOimp.DAOimp;
import com.example.springdatajpa.Mathematique.Cercle;

public class base_de_données {
    public static void main(String[] args) {

        Cercle cercle = new DAOimp().getCercle(1);
        System.out.println(cercle.getName());
    }
}
