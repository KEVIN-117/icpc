package org.example.LinkedList;

import java.util.HashMap;

public class N706_DesignHashMap {
    private HashMap<Integer, Integer> map;
    public N706_DesignHashMap() {
        this.map = new HashMap<>();
    }

    public void put(int key, int value) {
        this.map.put(key, value);
    }

    public int get(int key) {
        return this.map.getOrDefault(key, -1);
    }

    public void remove(int key) {
        this.map.remove(key);
    }
}
