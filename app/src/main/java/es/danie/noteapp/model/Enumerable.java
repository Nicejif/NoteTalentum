package es.danie.noteapp.model;


import java.util.List;

public interface Enumerable<T> {

    int count();
    void add(T element);
    void remove(int index);
    void update(int index, T newElement);

    List<Note> getAll();
}
