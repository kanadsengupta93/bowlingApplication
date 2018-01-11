package com.audition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrameTests {
    @Test
    public void checkFrameNumber() {
        Frame frame = new Frame(2, 4, 5);
        assertEquals(2, frame.getFrame());
    }

    @Test
    public void checkFirstRoll() {
        Frame frame = new Frame(2, 4, 5);
        assertEquals(frame.getfirstRoll(), 4);
    }

    @Test
    public void checkSecondRoll() {
        Frame frame = new Frame(2, 4, 5);
        assertEquals(frame.getsecondRoll(), 5);
    }

    @Test
    public void checkStrikeWhenStrike() {
        Frame frame = new Frame(2, 10);
        assertEquals(true, frame.checkStrike());
    }

    @Test
    public void checkStrikeWhenNotStrike() {
        Frame frame = new Frame(2, 4, 5);
        assertEquals(false, frame.checkStrike());
    }

    @Test
    public void checkSpareWhenSpare() {
        Frame frame = new Frame(2, 5, 5);
        assertEquals(true, frame.checkSpare());
    }

    @Test
    public void checkSpareWhenNotSpare() {
        Frame frame = new Frame(2, 4, 5);
        assertEquals(false, frame.checkSpare());
    }

    @Test
    public void checkNextFrameRoll() {
        Frame frame = new Frame(2, 5, 5);
        frame.setNextFrameRoll(5);
        assertEquals(5, frame.getNextFrameRoll());
    }

    @Test
    public void checkNextFrameSecondRoll() {
        Frame frame = new Frame(2, 10);
        frame.setNextFrameRoll(4);
        frame.setNextFrameSecondRoll(5);
        assertEquals(5, frame.getNextFrameSecondRoll());
    }

    @Test
    public void checkNextFrameNum() {
        Frame frame = new Frame(2, 10);
        frame.setNextFrame();
        assertEquals(3, frame.getNextFrame());

    }
}
