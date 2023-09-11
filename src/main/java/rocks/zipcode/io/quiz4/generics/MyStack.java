package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType>{
    private Stack<SomeType> data;

    public MyStack() {
//        throw new UnsupportedOperationException("Method not yet implemented");
        data = new Stack<>();
    }

    public Boolean isEmpty() {
        return data.isEmpty();
    }

    public void push(SomeType i) {
        data.push(i);
    }

    public SomeType peek() {
//        throw new UnsupportedOperationException("Method not yet implemented");
        return data.isEmpty() ? null : data.peek();
    }

    public SomeType pop() {
        return data.pop();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return data.iterator();
    }
}
