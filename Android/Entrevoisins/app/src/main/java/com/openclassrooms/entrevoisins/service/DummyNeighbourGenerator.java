package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DummyNeighbourGenerator {

    public static List<Neighbour> DUMMY_NEIGHBOURS = Arrays.asList(
            new Neighbour(1, "Caroline", "http://i.pravatar.cc/150?u=a042581f4e29026704d",
                    "06 70 80 90 10", "Saint pierre du Mont à 5km", "www.facebook.com/Caroline",false),
            new Neighbour(2, "Jack", "http://i.pravatar.cc/150?u=a042581f4e29026704e",
                    "06 70 50 90 10", "Saint Jean du Mont à 9km", "www.facebook.com/Jack",false),
            new Neighbour(3, "Chloé", "http://i.pravatar.cc/150?u=a042581f4e29026704f",
                    "06 70 80 95 10", "Maisigny-Sur-Loissel", "www.facebook.com/Chloé",false),
            new Neighbour(4, "Vincent", "http://i.pravatar.cc/150?u=a042581f4e29026704a",
                    "02 47 84 95 62", "Pernemy-Le-Grâia", "www.facebook.com/Vincent",false),
            new Neighbour(5, "Elodie", "http://i.pravatar.cc/150?u=a042581f4e29026704b",
            "02 28 74 25 36","Écare-Lès-Suye", "www.facebook.com/Elodie",false),
            new Neighbour(6, "Sylvain", "http://i.pravatar.cc/150?u=a042581f4e29026704c",
                    "02 14 52 36 98", "La Roncourt-Le-Comme", "www.facebook.com/Sylvain",false),
            new Neighbour(7, "Laetitia", "http://i.pravatar.cc/150?u=a042581f4e29026703d",
            "07 85 95 65 35", "Lasbron-Aux-Macq", "www.facebook.com/Laetitia",false),
            new Neighbour(8, "Dan", "http://i.pravatar.cc/150?u=a042581f4e29026703b",
            "04 52 41 36 69", "La Chapelle-Aubelles", "www.facebook.com/Dan",false),
            new Neighbour(9, "Joseph", "http://i.pravatar.cc/150?u=a042581f4e29026704d",
                    "Non renseigné", "Près de la gare", "www.facebook.com/Joseph",false),
            new Neighbour(10, "Emma", "http://i.pravatar.cc/150?u=a042581f4e29026706d",
                    "+33 03 02 01 02", "La Chapelle-Aubelles", "www.facebook.com/Emma",false),
            new Neighbour(11, "Patrick", "http://i.pravatar.cc/150?u=a042581f4e29026702d",
                    "09 08 07 04 05", "Noimpavy-Fontagne", "www.facebook.com/Patrick",false),
            new Neighbour(12, "Ludovic", "http://i.pravatar.cc/150?u=a042581f3e39026702d",
                    "05 04 07 08", "La Roncourt-Le-Comme","www.facebook.com/Ludovic", false)
    );

    static List<Neighbour> generateNeighbours() {
        return new ArrayList<>(DUMMY_NEIGHBOURS);
    }
}
