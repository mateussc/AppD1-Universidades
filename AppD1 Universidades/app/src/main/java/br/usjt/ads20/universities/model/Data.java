package br.usjt.ads20.universities.model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Nome: Mateus Santos Carvalho
 * RA: 818229525
 */

public class Data {
    private static ArrayList<University> characters;

    public static void setUniversities(ArrayList<University> pUniversities){
        characters = pUniversities;
    }

    public static University[] searchUniversities(String key) {
        ArrayList<University> list = characters;

        if (key == null || key.length() == 0) {
            return list.toArray(new University[0]);
        }
        else {
            ArrayList<University> filter = new ArrayList<>();
            for (University character : list) {
                String name = character.getName();
                if (name.toUpperCase().contains(key.toUpperCase())) {
                    filter.add(character);
                }
            }
            return filter.toArray(new University[0]);
        }
    }
}