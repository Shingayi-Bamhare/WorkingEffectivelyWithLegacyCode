package com.thoughtworks.legacycode.parameterize_method;

/**
 * Created by ThoughtWorker on 4/7/14.
 */
public class Book {
    private boolean overDue=false;
    private String name;

    public Book(String name) {

        this.name = name;
    }

    public boolean isOverDue() {
        return overDue;
    }
}
