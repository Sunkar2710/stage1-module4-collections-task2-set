package com.epam.mjc.collections.set;

import java.util.*;
import java.util.stream.Collectors;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> set = new TreeSet<>(sourceList.stream().map(element -> (int) Math.pow(element, 2)).collect(Collectors.toList()));
        return set.subSet(lowerBound, true, upperBound, true);
    }
}
