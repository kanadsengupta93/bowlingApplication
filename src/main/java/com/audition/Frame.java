package com.audition;
import java.util.*;
public class Frame {
    private int frameNum;
    private int firstRoll;
    private int secondRoll;
    private int nextFrameRoll;
    private int nextFrameSecondRoll;

    public Frame(int frameNum,int firstRoll,int secondRoll){
        this.frameNum=frameNum;
        this.firstRoll=firstRoll;
        this.secondRoll=secondRoll;
    }

    public Frame(int frameNum,int firstRoll){
        this.frameNum=frameNum;
        this.firstRoll=firstRoll;
    }

    public int getFrame() {
        return this.frameNum;
    }

    public int getfirstRoll() {
        return firstRoll;
    }

    public int getsecondRoll() {
        return secondRoll;
    }
    public boolean checkStrike(){
        boolean strike=false;
        if(this.firstRoll==10){
            strike=true;
        }
        return strike;
    }
    public boolean checkSpare(){
        boolean spare=false;
        if((this.firstRoll+this.secondRoll)==10){
            spare=true;
        }
        return spare;
    }

    public void setNextFrameRoll(int nextFrameRoll) {
        this.nextFrameRoll = nextFrameRoll;
    }

    public int getNextFrameRoll() {
        return nextFrameRoll;
    }

    public void setNextFrameSecondRoll(int nextFrameSecondRoll) {
        this.nextFrameSecondRoll = nextFrameSecondRoll;
    }

    public int getNextFrameSecondRoll() {
        return nextFrameSecondRoll;
    }
}
