package rocks.zipcode.io.quiz4.generics;

import java.util.Collections;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_ extends Comparable<_>> extends Group<_> {

    @Override
    public void insert(_ value) {
        super.insert(value);
        Collections.sort(super.list);
    }

    @Override
    public void delete(_ value) {
        super.delete(value);
    }

    public Integer indexOf(_ value) {
        return super.list.indexOf(value);
    }
}
