package com.chris.graphql.repository;

import com.chris.graphql.types.Inventor;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ye830 on 1/4/2018.
 */
@Component
public class InventorRepository {

    /**
     * Get inventors by patent id
     * @param patentId A patent id
     * @return A list of inventors
     */
    public List<Inventor> getInventorByPatentId(String patentId){
        Inventor inventor1 = new Inventor();
        inventor1.setAge(34);
        inventor1.setName("Markus");
        inventor1.setAddress("Su Zhou YinShan Lake");
        inventor1.setCountry("Germany");

        Inventor inventor2 = new Inventor();
        inventor2.setAge(36);
        inventor2.setName("Jeffery");
        inventor2.setAddress("Singapore some where");
        inventor2.setCountry("Singapore");

        List<Inventor> inventors = new ArrayList<>();
        inventors.add(inventor1);
        inventors.add(inventor2);

        return inventors;
    }
}
