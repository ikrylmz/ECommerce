package com.bilgeadam.ecommerce.repo;


import com.bilgeadam.ecommerce.model.Deneme;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class DenemeRepo {


    public List<Deneme> getAllUsersRepository() {
        List<Deneme> liste = new ArrayList<Deneme>();

        Deneme deneme = new Deneme(1L, "servet");
        liste.add(deneme);

        return liste;
    }

}
