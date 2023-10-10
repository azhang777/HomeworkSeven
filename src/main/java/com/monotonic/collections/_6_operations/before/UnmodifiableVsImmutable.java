package com.monotonic.collections._6_operations.before;

import java.util.*;

public class UnmodifiableVsImmutable
{
    public static void main(String[] args)
    {
        var mutableCountryToPopulation = new HashMap<>();
        mutableCountryToPopulation.put("UK", 67);
        mutableCountryToPopulation.put("USA", 328);

        var unmodifiable = Collections.unmodifiableMap(mutableCountryToPopulation);
        var copied = Map.copyOf(mutableCountryToPopulation);

        System.out.println("mutableCountryToPopulation = " + mutableCountryToPopulation);
        System.out.println("unmodifiable = " + unmodifiable);
        System.out.println("copied = " + copied);

        mutableCountryToPopulation.put("Germany",84);

        System.out.println("mutableCountryToPopulation = " + mutableCountryToPopulation);
        System.out.println("unmodifiable = " + unmodifiable);
        System.out.println("copied = " + copied);

    }
}
