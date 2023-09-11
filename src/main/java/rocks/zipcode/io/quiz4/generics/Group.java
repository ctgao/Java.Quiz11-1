package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements GroupInterface<_> {
    protected List<_> list;

    public Group() {
//        throw new UnsupportedOperationException("Method not yet implemented");
        list = new ArrayList<>();
    }

    public Integer count() {
        return list.size();
    }

    public void insert(_ value) {
        list.add(value);
    }

    public Boolean has(_ value) {
        return list.contains(value);
    }

    public _ fetch(int indexOfValue) {
        return list.get(indexOfValue);
    }

    public void delete(_ value) {
        list.remove(value);
    }

    public void clear() {
        list.clear();
    }

    public Iterator<_> iterator() {
        return list.iterator();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(_ item : list){
            sb.append(item + ", ");
        }
        sb = sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }
}
