package les10;

import java.util.Collection;

public class MyArrayList<T> implements MyList<T> {

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 1;
    }

    public MyArrayList(int capacity) {
        if (capacity < 0) {
            System.out.println("Не может быть отрицательной");
        }
        elements = new Object[capacity];
    }

    public MyArrayList(MyList<? extends T> col) {
        elements = new Object[DEFAULT_CAPACITY];
        for (int i = 1; i <= col.size(); i++) {
            add(col.get(i));
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 1;
    }

    @Override
    public T get(int index) {
        if (!isIndexValid(index)) {
            return null;
        }
        return (T) elements[index];
    }

    @Override
    public T set(int index, T value) {
        if (!isIndexValid(index)) {
            return null;
        }
        T oldValue = (T) elements[index];
        elements[index] = value;
        return oldValue;
    }

    private boolean isIndexValid(int index) {
        if (index < 0 || index > size) {
            System.out.println("Ошибка " + index);
            return false;
        }
        return true;
    }

    private void ensureCapacity() {
        if (size >= elements.length) {
            int newCapacity = elements.length * 2;
            if (newCapacity == 0) {
                newCapacity = DEFAULT_CAPACITY;
            }
            Object[] newElements = new Object[newCapacity];
            for (int i = 0; i <= size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }

    @Override
    public boolean add(T value) {
        ensureCapacity();
        elements[size] = value;
        size++;
        return true;
    }

    @Override
    public boolean add(int index, T value) {
        if (index < 0 || index > size) {
            System.out.println("Ошибка " + index);
            return false;
        }
        ensureCapacity();
        for (int i = size; i >= index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = value;
        size++;
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> value) {
        if (value.isEmpty()) {
            return false;
        }
        for (T item : value) {
            add(item);
        }
        return true;
    }

    @Override
    public int indexOf(Object value) {
        for (int i = 0; i <= size; i++) {
            if (value == null) {
                if (elements[i] == null) {
                    return i;
                }
            } else if (value.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object value) {
        return indexOf(value) != -1;
    }

    @Override
    public T remove(int index) {
        if (!isIndexValid(index)) {
            return null;
        }
        T removed = (T) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return removed;
    }

    @Override
    public boolean remove(Object value) {
        int index = indexOf(value);
        if (index == -1) {
            return false;
        }
        remove(index);
        return true;
    }
}