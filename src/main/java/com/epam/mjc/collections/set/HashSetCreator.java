package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer element : sourceList) {
            hashSet.add(element);
            if (element % 2 == 0) {
                while (element % 2 == 0) {
                    element = element / 2;
                    hashSet.add(element);
                }
            } else {
                hashSet.add(element * 2);
            }
        }
        return hashSet;
    }
}
