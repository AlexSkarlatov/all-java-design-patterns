package com.skarlatov.facadework.facade.number1.aa;

public class Client {
    public static void main(String[] args)
    {
        // the subsystem needs to manage these resources internally somehow through a resource pool, this is too much typing
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");


        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, tuner, dvd, cd,
                                                                projector, screen, lights, popper);

        homeTheaterFacade.watchMovie("some moivies");
        homeTheaterFacade.endMovie();
//        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd,
//                                                                projector, screen, lights, popper);
//        homeTheater.watchMovie("Inception");
//        homeTheater.endMovie();
    }
}
