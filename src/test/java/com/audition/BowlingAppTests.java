package com.audition;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class BowlingAppTests {

    @Test
    public void givenUserGetSpareCheckthatNextRollIsAddedtoFrame() {
        List<Frame> Bowling = new ArrayList<Frame>();
        Frame fOne = new Frame(1, 5, 5);
        Frame fTwo = new Frame(2, 10);
        Bowling.add(fOne);
        Bowling.add(fTwo);
        BowlingApp.setSpares(fOne, Bowling);
        assertEquals(10, fOne.getNextFrameRoll());
    }

    @Test
    public void givenUserGetSpareCheckthat2ndNextRollIsNotAddedtoFrame() {
        List<Frame> Bowling = new ArrayList<Frame>();
        Frame fOne = new Frame(1, 5, 5);
        Frame fTwo = new Frame(2, 10);
        Bowling.add(fOne);
        Bowling.add(fTwo);
        BowlingApp.setSpares(fOne, Bowling);
        assertEquals(0, fOne.getNextFrameSecondRoll());
    }

    @Test
    public void givenUserGetTwoStrikesCheckthatNextTwoRollsareAddedtoFrame() {
        List<Frame> Bowling = new ArrayList<Frame>();
        Frame fOne = new Frame(1, 10);
        Frame fTwo = new Frame(2, 10);
        Frame fThree = new Frame(3, 5, 5);
        Bowling.add(fOne);
        Bowling.add(fTwo);
        Bowling.add(fThree);
        BowlingApp.setStrikes(fOne, Bowling);
        assertEquals(10, fOne.getNextFrameRoll());
        assertEquals(5, fOne.getNextFrameSecondRoll());
    }

    @Test
    public void givenUserGetOneStrikeCheckthatNextTwoRollsareAddedtoFrame() {
        List<Frame> Bowling = new ArrayList<Frame>();
        Frame fOne = new Frame(1, 10);
        Frame fTwo = new Frame(3, 5, 5);
        Bowling.add(fOne);
        Bowling.add(fTwo);
        BowlingApp.setStrikes(fOne, Bowling);
        assertEquals(5, fOne.getNextFrameRoll());
        assertEquals(5, fOne.getNextFrameSecondRoll());
    }

    @Test
    public void givenUserRolls300CheckifAppReturns300() {
        List<Frame> Bowling = new ArrayList<Frame>();
        Frame fOne = new Frame(1, 10);
        Frame fTwo = new Frame(2, 10);
        Frame fThree = new Frame(3, 10);
        Frame fFour = new Frame(4, 10);
        Frame fFive = new Frame(5, 10);
        Frame fSix = new Frame(6, 10);
        Frame fSeven = new Frame(7, 10);
        Frame fEight = new Frame(8, 10);
        Frame fNine = new Frame(9, 10);
        Frame fTen = new Frame(10, 10);
        Frame fEleven = new Frame(11, 10);
        Frame fTwelve = new Frame(12, 10);
        Bowling.add(fOne);
        Bowling.add(fTwo);
        Bowling.add(fThree);
        Bowling.add(fFour);
        Bowling.add(fFive);
        Bowling.add(fSix);
        Bowling.add(fSeven);
        Bowling.add(fEight);
        Bowling.add(fNine);
        Bowling.add(fTen);
        Bowling.add(fEleven);
        Bowling.add(fTwelve);
        BowlingApp.addSparesandStrikes(Bowling);
        int sum = BowlingApp.calculateScore(Bowling);
        assertEquals(300, sum);
    }

    @Test
    public void givenUserRolls150CheckifAppReturns150() {
        List<Frame> Bowling = new ArrayList<Frame>();
        Frame fOne = new Frame(1, 5, 5);
        Frame fTwo = new Frame(2, 5, 5);
        Frame fThree = new Frame(3, 5, 5);
        Frame fFour = new Frame(4, 5, 5);
        Frame fFive = new Frame(5, 5, 5);
        Frame fSix = new Frame(6, 5, 5);
        Frame fSeven = new Frame(7, 5, 5);
        Frame fEight = new Frame(8, 5, 5);
        Frame fNine = new Frame(9, 5, 5);
        Frame fTen = new Frame(10, 5);
        Frame fEleven = new Frame(11, 5);
        Frame fTwelve = new Frame(12, 5);
        Bowling.add(fOne);
        Bowling.add(fTwo);
        Bowling.add(fThree);
        Bowling.add(fFour);
        Bowling.add(fFive);
        Bowling.add(fSix);
        Bowling.add(fSeven);
        Bowling.add(fEight);
        Bowling.add(fNine);
        Bowling.add(fTen);
        Bowling.add(fEleven);
        Bowling.add(fTwelve);
        BowlingApp.addSparesandStrikes(Bowling);
        int sum = BowlingApp.calculateScore(Bowling);
        assertEquals(150, sum);
    }

    @Test
    public void givenUserRolls20CheckifAppReturns20() {
        List<Frame> Bowling = new ArrayList<Frame>();
        Frame fOne = new Frame(1, 1, 1);
        Frame fTwo = new Frame(2, 1, 1);
        Frame fThree = new Frame(3, 1, 1);
        Frame fFour = new Frame(4, 1, 1);
        Frame fFive = new Frame(5, 1, 1);
        Frame fSix = new Frame(6, 1, 1);
        Frame fSeven = new Frame(7, 1, 1);
        Frame fEight = new Frame(8, 1, 1);
        Frame fNine = new Frame(9, 1, 1);
        Frame fTen = new Frame(10, 1);
        Frame fEleven = new Frame(11, 1);
        Bowling.add(fOne);
        Bowling.add(fTwo);
        Bowling.add(fThree);
        Bowling.add(fFour);
        Bowling.add(fFive);
        Bowling.add(fSix);
        Bowling.add(fSeven);
        Bowling.add(fEight);
        Bowling.add(fNine);
        Bowling.add(fTen);
        Bowling.add(fEleven);
        BowlingApp.addSparesandStrikes(Bowling);
        int sum = BowlingApp.calculateScore(Bowling);
        assertEquals(20, sum);
    }

    @Test
    public void givenUserRolls200CheckifAppReturns200() {
        List<Frame> Bowling = new ArrayList<Frame>();
        Frame fOne = new Frame(1, 10);
        Frame fTwo = new Frame(2, 5, 5);
        Frame fThree = new Frame(3, 10);
        Frame fFour = new Frame(4, 5, 5);
        Frame fFive = new Frame(5, 10);
        Frame fSix = new Frame(6, 5, 5);
        Frame fSeven = new Frame(7, 10);
        Frame fEight = new Frame(8, 5, 5);
        Frame fNine = new Frame(9, 10);
        Frame fTen = new Frame(10, 5);
        Frame fEleven = new Frame(11, 5);
        Frame fTwelve = new Frame(12, 10);
        Bowling.add(fOne);
        Bowling.add(fTwo);
        Bowling.add(fThree);
        Bowling.add(fFour);
        Bowling.add(fFive);
        Bowling.add(fSix);
        Bowling.add(fSeven);
        Bowling.add(fEight);
        Bowling.add(fNine);
        Bowling.add(fTen);
        Bowling.add(fEleven);
        Bowling.add(fTwelve);

        BowlingApp.addSparesandStrikes(Bowling);
        int sum = BowlingApp.calculateScore(Bowling);
        assertEquals(200, sum);
    }

    @Test
    public void givenUserRolls199CheckifAppReturns199() {
        List<Frame> Bowling = new ArrayList<Frame>();
        Frame fOne = new Frame(1, 10);
        Frame fTwo = new Frame(2, 5, 5);
        Frame fThree = new Frame(3, 10);
        Frame fFour = new Frame(4, 5, 5);
        Frame fFive = new Frame(5, 10);
        Frame fSix = new Frame(6, 5, 5);
        Frame fSeven = new Frame(7, 10);
        Frame fEight = new Frame(8, 5, 5);
        Frame fNine = new Frame(9, 10);
        Frame fTen = new Frame(10, 5);
        Frame fEleven = new Frame(11, 5);
        Frame fTwelve = new Frame(12, 9);
        Bowling.add(fOne);
        Bowling.add(fTwo);
        Bowling.add(fThree);
        Bowling.add(fFour);
        Bowling.add(fFive);
        Bowling.add(fSix);
        Bowling.add(fSeven);
        Bowling.add(fEight);
        Bowling.add(fNine);
        Bowling.add(fTen);
        Bowling.add(fEleven);
        Bowling.add(fTwelve);
        BowlingApp.addSparesandStrikes(Bowling);
        int sum = BowlingApp.calculateScore(Bowling);
        assertEquals(199, sum);
    }
}
