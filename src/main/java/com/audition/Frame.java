package com.audition;

import java.util.*;

public class Frame {
    private int frameNum;
    private int firstRoll;
    private int secondRoll;
    private int nextFrameRoll;
    private int nextFrameSecondRoll;
    private int thirdRoll;
    private int nextFrame;

    public Frame(int frameNum, int firstRoll, int secondRoll) {
        this.frameNum = frameNum;
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
        this.nextFrame = this.frameNum + 1;
    }

    public Frame(int frameNum, int firstRoll) {
        this.frameNum = frameNum;
        this.firstRoll = firstRoll;
        this.nextFrame = this.frameNum + 1;


    }

    public Frame(int frameNum, int firstRoll, int secondRoll, int thirdRoll) {
        this.frameNum = frameNum;
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
        this.thirdRoll = thirdRoll;
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

    public boolean checkStrike() {
        boolean strike = false;
        if (this.firstRoll == 10) {
            strike = true;
        }
        return strike;
    }

    public boolean checkSpare() {
        boolean spare = false;
        if ((this.firstRoll + this.secondRoll) == 10) {
            spare = true;
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

    public void setNextFrame() {
        this.nextFrame = this.frameNum + 1;
    }

    public int getNextFrame() {
        return this.nextFrame;
    }
}
