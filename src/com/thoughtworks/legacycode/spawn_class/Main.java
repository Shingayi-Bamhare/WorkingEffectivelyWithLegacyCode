package com.thoughtworks.legacycode.spawn_class;

import com.thoughtworks.legacycode.primitivize_parameter.Vector2;

public class Main {
    public static void main(String[] args) {
        new Monster(10, "Angry", new Vector2(0, 0)).processAi();
    }
}
