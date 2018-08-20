package com.aria.test.headfirst.project_one;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List<String> getBrands(String color)
    {
        List<String> brands = new ArrayList<String>();
        if (color.equals("amber"))
        {
            brands.add("Jack Ambar");
            brands.add("Red Moose");

        }
        else
        {
            brands.add("jack pale ale");
            brands.add("Gout Stout");

        }
        return brands;
    }
}
