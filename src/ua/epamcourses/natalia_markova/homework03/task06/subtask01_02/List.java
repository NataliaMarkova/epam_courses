package ua.epamcourses.natalia_markova.homework03.task06.subtask01_02;

/**
 * Created by natalia_markova on 12.05.2016.
 */
public interface List<T> {
    boolean contains(T value);
    void add(T value);
    void set(int index, T value);
    T get(int index);
    T remove(int index);
    int size();
    void clear();
    String toStringReverse();
}
