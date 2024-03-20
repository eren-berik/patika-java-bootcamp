import java.util.Arrays;
import java.util.Objects;

public class CustomList<T> {
    private int size;
    private int head = 0;
    private Object[] list;

    public CustomList() {
        this.size = 10;
        this.list = new Object[size];
    }

    public CustomList(int size) {
        this.size = size;
        this.list = new Object[size];
    }

    public void add(T data) {
        ensureCapacity();
        list[head++] = data;
    }

    private void ensureCapacity() {
        if (size == list.length) {
            int newSize = list.length * 2;
            list = Arrays.copyOf(list, newSize);
        }
    }

    // Returns number of elements in the list
    public int size() {
        int count = 0;

        for (Object t : list) {
            if (t != null) {
                count++;
            }
        }

        return count;
    }

    // Returns length (capacity) of the list
    public int getCapacity() {
        return list.length;
    }

    public T get(int index) {
        if (index < 0 || index >= getCapacity()) {
            return null;
        }

        return (T) list[index];
    }

    //TODO: REFACTOR REMOVE
    public T remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index " + index + " is out of range!");
            return null;
        }

        for (int i = index; i < size - 1; i++) {
            list[i] = list[i + 1];
        }

        //list[size - 1] = null;
        size--;
        head--;

        return (T) list;
    }

    public T set(int index, T data) {
        if (index < 0 || index >= size) {
            return null;
        }

        list[index] = data;

        return (T) list;
    }

    public int indexOf(T data) {
        for (int i = 0; i < getCapacity(); i++) {
            if (Objects.equals(list[i], data)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        int lastKnownIndex = -1;
        for (int i = 0; i < getCapacity(); i++) {
            if (Objects.equals(list[i], data)) {
                lastKnownIndex = i;
            }
        }
        return lastKnownIndex;
    }

    public boolean isEmpty() {
        for (Object t : list) {
            if (t != null) {
                return false;
            }
        }

        return true;
    }

    public void clear() {
        Arrays.fill(list, null);
        head = 0;
    }

    public CustomList<T> sublist(int start, int finish) {
        CustomList<T> sublist = new CustomList<>(finish-start);

        for (int i = start; i <= finish; i++) {
            sublist.add((T) list[i]);
        }

        return sublist;
    }

    public boolean contains(T data) {
        for (int i = 0; i < size(); i++) {
            if (list[i].equals(data)) {
                return true;
            }
        }

        return false;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size(); i++) {
            result.append(list[i]);
            if (i < size() - 1) {
                result.append(",");
            }
        }
        result.append("]");

        return result.toString();
    }

}
