package ru.matyunin.inno.homework4.task2.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectBox<E> {
    private List<E> objectCollection = new ArrayList<>();

    public ObjectBox(E[] objectCollection) {
        this.objectCollection.addAll(Arrays.asList(objectCollection));
    }

    public void addObject(E obj) {
        objectCollection.add(obj);
    }

    private String toStrings() {
        return "ObjectBox{" +
                "objectCollection=" + objectCollection +
                '}';
    }

    public void deleteObject(E obj) {
        if (objectCollection.remove(obj)) {
            System.out.println(obj + " is deleted");
        } else {
            System.out.println("no such element " + obj);
        }
    }

    public void dump() {
        System.out.println(this.toStrings());

    }
}
