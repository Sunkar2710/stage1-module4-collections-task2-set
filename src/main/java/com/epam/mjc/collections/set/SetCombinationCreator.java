package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        LinkedHashSet<String> result = new LinkedHashSet<>();

        result.addAll(thirdSet);
        result.removeAll(firstSet);
        result.removeAll(secondSet);

        firstSet.removeAll(thirdSet);
        secondSet.removeAll(thirdSet);

        firstSet.retainAll(secondSet);
        result.addAll(firstSet);

        return result;
    }
}
