package com.codingtheory.state.abuse;

public class Stopwatch {

    private State currentState = new StoppedState(this);

    public void click() {
        currentState.click();
    }

    public State getState() {
        return currentState;
    }

    public void setState(State state) {
        this.currentState = state;
    }
}
