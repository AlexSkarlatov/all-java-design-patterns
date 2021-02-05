package com.skarlatov.stateExample.challenge;

public class AlertStateContext {
    private MobileAlertState currentState;

    public AlertStateContext(){
        currentState = new VibrationState();

    }
    public void setState(MobileAlertState state){
        currentState = state;
    }
    public void alert(){
        currentState.alert();
    }

}



