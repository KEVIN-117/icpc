package org.example.LinkedList;

import java.util.HashSet;

public class N705_DesignHashSet {
    private HashSet<Integer> set;
    public N705_DesignHashSet() {
        set = new HashSet<>();
    }

    public void add(int key) {
        set.add(key);
    }

    public void remove(int key) {
        set.remove(key);
    }

    public boolean contains(int key) {
        return set.contains(key);
    }

    public static void main(String[] args) {
        N705_DesignHashSet obj = new N705_DesignHashSet();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);

        System.out.println(obj.contains(1));
        System.out.println(obj.contains(2));
        System.out.println(obj.contains(3));

        obj.remove(1);
        System.out.println(obj.contains(1));

    }
}
