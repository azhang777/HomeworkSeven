package com.monotonic.collections._4_maps.before;

import java.util.HashMap;

public class AdvancedOperations
{
    public static void main(String[] args)
    {
        var defaultProduct = new Product(-1, "Whatever the customer wants", 100);

        var idToProduct = new HashMap<Integer, Product>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        //if key has no value, return new computed value.
        //else return the existing value, do not compute.
        var result = idToProduct.computeIfAbsent(10,key -> {
            return new Product(key, "unkown product", 100);
        });

        /*
        System.out.println(idToProduct.getOrDefault(10, defaultProduct));
        System.out.println(idToProduct.get(10));
        System.out.println(idToProduct);
        idToProduct.replaceAll((key, oldProduct) ->
                new Product(
                        oldProduct.getId(),
                        oldProduct.getName(),
                        oldProduct.getWeight()+10));
        System.out.println(idToProduct);
         */

    }
}
