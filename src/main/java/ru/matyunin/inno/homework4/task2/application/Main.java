package ru.matyunin.inno.homework4.task2.application;

import ru.matyunin.inno.homework4.task2.model.ObjectBox;


public class Main {
    public static void main(String[] args) {

        ObjectBox<Object> objectObjectBox = new ObjectBox<>(new Object[]{1, "string", new Object()});
        objectObjectBox.dump();
        Object object = new Object();
        objectObjectBox.addObject(object);
        objectObjectBox.dump();
        objectObjectBox.deleteObject(object);
        objectObjectBox.dump();

        ObjectBox<String> objectStringBox = new ObjectBox<>(new String[]{"one", "two", "three", "four", "five"});
        objectStringBox.dump();
        objectStringBox.addObject("last");
        objectStringBox.dump();
        objectStringBox.deleteObject("one");
        objectStringBox.dump();

    }
}

