package com.skarlatov.facadework.facade.number1.aa;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp,
                             Tuner tuner,
                             DvdPlayer dvd,
                             CdPlayer cd,
                             Projector projector,
                             Screen screen,
                             TheaterLights lights,
                             PopcornPopper popper){
    this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;

    }
    public void watchMovie(String movie){
        System.out.println("watching movie soon get ready");

        popper.on();
        popper.pop();

        lights.dim(2);
        screen.down();

        projector.on();
        projector.wideScreenMode();

        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume();

        dvd.on();
        dvd.play(movie);
    }


    public void endMovie(){
        System.out.println("the system is turning off");

        popper.off();
        lights.on();
        screen.up();
        projector.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}

