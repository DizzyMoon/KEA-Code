package com.example.pokedexpogchamp.pokemon;

public class Pokemon {
    private int pokedexNumber;
    private String name;
    private int speed;
    private int specialDefence;
    private int specialAttack;
    private int defence;
    private int attack;
    private int hp;
    private String primaryType;
    private String secondaryType;


    public Pokemon(){

    }

    public Pokemon(int pokedexNumber, String name, int speed, int specialDefence, int specialAttack, int defence, int attack, int hp, String primaryType, String secondaryType){

    }

    public int getPokedexNumber(){
        return pokedexNumber;
    }

    public String getName(){
        return name;
    }

    public int getSpeed(){
        return speed;
    }

    public int getSpecialDefence(){
        return specialDefence;
    }

    public int getSpecialAttack(){
        return specialAttack;
    }

    public int getDefence(){
        return defence;
    }

    public int getAttack(){
        return attack;
    }

    public int getHp(){
        return hp;
    }

    public String getPrimaryType(){
        return primaryType;
    }

    public String getSecondaryType(){
        return secondaryType;
    }

    public String toString(){
        return pokedexNumber + ", " + name + ", " + speed + ", " + specialDefence + ", " + specialAttack
                + ", " + defence + ", " + attack + ", " + hp + ", " + primaryType + ", " + secondaryType;
    }
}
