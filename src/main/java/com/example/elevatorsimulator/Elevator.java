package com.example.elevatorsimulator;

public abstract class Elevator {
    enum direction{
        UP,
        IDLE,
        DOWN
    }

        protected int elevatorID;
        protected String elevatorType;
        public abstract boolean move(direction _direction);
    }

