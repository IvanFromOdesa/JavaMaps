package com.company;

public interface MyMap {

    interface Entry {
        String getKey();
        String getValue();
        void setValue(String value);
    }

    void clear();

    boolean containsKey(String key);

    String get(String key);

    boolean isEmpty();

    void remove(String key);

    String put(String key, String value); // Returns the previous value associated with key, or null

    int size();

    Entry[] toArray();

}