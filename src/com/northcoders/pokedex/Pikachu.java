package com.northcoders.pokedex;

import com.northcoders.Pokemon;
import com.northcoders.Type;
import com.northcoders.Move;


public class Pikachu extends Pokemon {

//    private Move[] moveList;
//    private int moveIndex = 0;

    public Pikachu() {
        super("Pikachu", new Type[]{Type.Electric});
        learnMove(new Move("thundershock", 20, Type.Electric), 0);
    }

    public Pikachu(String nickname) {
        super("Pikachu", nickname, new Type[]{Type.Electric});
        learnMove(new Move("thundershock", 20, Type.Electric), 0);
    }
}
