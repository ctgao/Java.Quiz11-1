package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(Set<_> originalSet) {
        List<_> originalList = new ArrayList<>(originalSet);
        Group<Group<_>> result = new Group<>();
        for(int setSize = originalList.size(); setSize < originalList.size(); setSize++){
            Group<_> innerGroup = new Group<>();
            for(int i = 0; i < setSize; i++){

            }
        }
        return result;
    }

    public static <_ extends Comparable> Iterable<? extends Iterable<_>> powerSet(_... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

