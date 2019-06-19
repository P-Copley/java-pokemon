package com.northcoders;

public class Move {

    private String name;
    private int dmg;
    private Type type;


    public Move(String name, int dmg, Type type) {
        this.name = name;
        this.dmg = dmg;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getDmg() {
        return dmg;
    }

    public Type getType() {
        return type;
    }
}
