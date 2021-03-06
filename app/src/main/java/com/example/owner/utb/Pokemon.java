package com.example.owner.utb;

/**
 * Created by Owner on 3/28/2015.
 */

public class Pokemon {

    Names name;
    int dexNum;
    Type type1;
    Type type2;
    int [][] resistenceT1 = new int [18][6];
    int [][] resistenceT2 = new int [18][6];
    AbilityEnum ab1;
    AbilityEnum ab2;
    AbilityEnum hiddenAb;
    int hp;
    int atk;
    int def;
    int spA;
    int spD;
    int spe;
    boolean canHaveItem;



    public Pokemon(Names name, int dexNum, Type type1, Type type2, AbilityEnum ab1, AbilityEnum ab2, AbilityEnum hiddenAb,
                   boolean canHaveItem, int hp, int atk, int def, int spA, int spD, int spe){

        this.name = name;
        this.dexNum = dexNum;
        this.type1 = type1;
        this.type2 = type2;
        this.ab1 = ab1;
        this.ab2 = ab2;
        this.hiddenAb = hiddenAb;
        this.canHaveItem = canHaveItem;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spA = spA;
        this.spD = spD;
        this.spe = spe;

        /*for (int m = 0; m < 18; m++) {
            for (int n = 0; n < 6; n++) {
                resistenceT1[m][n] = type1.resistMatrix[m][n];
                resistenceT2[m][n] = type2.resistMatrix[m][n];
            }
        }*/
    }

    @Override
    public String toString(){
        return name.toString();
    }
}
