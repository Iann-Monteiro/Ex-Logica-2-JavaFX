package org.iannmonteiro.projetojavafxjdbc.services;

import org.iannmonteiro.projetojavafxjdbc.entities.Seller;

import java.util.ArrayList;
import java.util.List;

public class SellerService {
    public List<Seller> findAll(){
        List<Seller> list = new ArrayList<>();
        list.add(new Seller(1, "Alex", "alex@gmail.com"));
        list.add(new Seller(2, "Maria", "maria@gmail.com"));
        list.add(new Seller(3, "Pedruca", "pedruca@gmail.com"));
        return list;
    }
}
