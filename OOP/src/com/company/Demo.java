package com.company;

import java.util.*;

public class Demo {
    public static void main(String args[]) {
//        Instrument guitar = new Guitar();
//        guitar.shout();
//        Address address = new Address(630, "Hendersonville", "NC");
//        Programmer object = new Programmer("Sarah", address);
//        System.out.println(object.name);
//        System.out.println(object.programmerAddr.streetNum);
//        System.out.println(object.programmerAddr.city);
//        System.out.println(object.programmerAddr.state);
        NetflixMovie movieObject1 = new NetflixMovie("Titanic", "James Cameron");
        NetflixMovie movieObject2 = new NetflixMovie("47 Meters Down", "James Harris");
        List<NetflixMovie> allNetflixMovies = new ArrayList<NetflixMovie>();
        allNetflixMovies.add(movieObject1);
        allNetflixMovies.add(movieObject2);

        NetflixMovieLibrary netflix = new NetflixMovieLibrary(allNetflixMovies);
        List<NetflixMovie> mvs = netflix.getTotalNetflixMoviesInNetflixLibrary();
        for (NetflixMovie mv : mvs) {
            System.out.println("Title : " + mv.title + " and "
                    + " Producer : " + mv.producer);
        }
    }
}