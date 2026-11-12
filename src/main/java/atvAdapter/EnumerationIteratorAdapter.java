package atvAdapter  ;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIteratorAdapter<T> implements Iterator<T> {

    private final Enumeration<T> enumeration;

    public EnumerationIteratorAdapter(Enumeration<T> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public T next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Enumeration não suporta remoção");
    }
}