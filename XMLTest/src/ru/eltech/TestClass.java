package ru.eltech;

import ru.eltech.users.Reader;

public class TestClass {
    public static void main(String[] args) {
        Reader me = new Reader();
        me.setName("Tan Zung");
        System.out.println(me.getName());
    }
}
