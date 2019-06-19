package com.northcoders;

public class Pokemon {
    private String name;
    private String nickname;
    private Type[] types;
    private Move[] moves = new Move[4];
    private int maxHp;
    private int hp;


    public Pokemon(String name, String nickname, Type[] types) {
        if (types.length > 2) throw new IllegalArgumentException("Max 2 types");
        this.name = name;
        this.nickname = nickname;
        this.types = types;
    }

    public Pokemon (String name, Type[] types) {
        if (types.length > 2) throw new IllegalArgumentException("Max 2 types");
        this.name = name;
        this.nickname = name;
        this.types = types;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type[] getTypes() {
        return types;
    }

    public void setTypes(Type[] types) {
        this.types = types;
    }

    public Move[] getMoves() {
        return moves;
    }

    public void learnMove(Move newMove, int index) {
        moves[index] = newMove;
    }

}
