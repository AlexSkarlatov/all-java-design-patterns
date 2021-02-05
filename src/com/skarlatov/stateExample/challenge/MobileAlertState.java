package com.skarlatov.stateExample.challenge;

/* can
can be either abstract or interface it really depends on whether theree  is any kind of default state shared b3etween all implementations

 */
public interface MobileAlertState {
    public void alert();

}


class VibrationState implements MobileAlertState{
    @Override
    public void alert() {
        System.out.println("I am vibrating now");

    }

}

class SoundState implements MobileAlertState{
    @Override
    public void alert() {
        System.out.println("I am loud and beeping now");

    }

}

class SilentState implements MobileAlertState{
    @Override
    public void alert() {
        System.out.println("I am Silent now");

    }

}