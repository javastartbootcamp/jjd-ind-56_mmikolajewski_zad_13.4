package pl.javastart.task;

// Uzupełnij klasę. Możesz ją dowolnie modyfikować.
// Celem jest, żeby przechodziły testy w src/test/java/[...]/CustomListTest

import java.util.Arrays;

public class CustomList<T> {
    private Object[] elements;
    public static final int DEFAULT_SIZE = 1;
    private int size = 0;

    public CustomList() {
        elements = new Object[DEFAULT_SIZE];
    }

    public CustomList(int size) {
        if (size > 0) {
            this.elements = new Object[size];
        } else if (size == 0) {
            this.elements = new Object[]{};
        } else {
            throw new IllegalArgumentException("Illegal size: " + size);
        }
    }

    public void add(T element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length + 1);
        }
        elements[size] = element;
        size++;
    }

    public void add(int index, T object) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("index: " + size);
        }
        insert(index, object);
        putObjectToNullSpace(object);
    }

    public T get(int index) {
        T element;
        if (index <= size || index > 0) {
            element = (T) this.elements[index];
        } else {
            throw new ArrayIndexOutOfBoundsException("index: " + size);
        }
        return element;
    }

    private void putObjectToNullSpace(T object) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                elements[i] = object;
            }
        }
    }

    private void insert(int index, T object) {
        Object[] result = new Object[elements.length + 1];
        System.arraycopy(elements, 0, result, 0, index);
        result[index] = object;
        System.arraycopy(elements, index, result, index + 1, elements.length - index);
        elements = result;
        size++;
    }

    private void moveElementsFromIndexToLeft(int index) {
        for (int i = index; i <= elements.length - 1; i++) {
            if (i == elements.length - 1) {
                elements[i] = null;
            } else {
                elements[i] = elements[i + 1];
            }

        }
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        if (index <= size || index > 0) {
            elements[index] = null;
            moveElementsFromIndexToLeft(index);
            elements = Arrays.copyOf(elements, elements.length - 1);
            size--;
        } else {
            throw new IndexOutOfBoundsException("index: " + size);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
