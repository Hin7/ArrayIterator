/**
 * Итератор массива. Задание на урок 8 СБТ.
 *
 * @author Hin7
 * @version 1.0
 */


package ru.course;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<E> implements Iterator<E> {
    private E[] data = null;
    private int index = 0;

    public ArrayIterator(E[] array){
        data = array;
    }

    @Override
    public boolean hasNext(){
        return data != null && index < data.length;
    }

    @Override
    public E next(){
        if(!hasNext()) throw new NoSuchElementException();
        return data[index++];
    }

}
