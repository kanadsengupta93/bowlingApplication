package com.audition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BowlingApp {
    public static void main(String args[]) {
        List<Frame> Bowling = new ArrayList<Frame>();
        Scanner sc = new Scanner(System.in);
        Bowling = addFrames(sc, Bowling);
        addSparesandStrikes(Bowling);
        int sum = calculateScore(Bowling);
        System.out.println("Your Final Score is " + sum);
    }

    private static List<Frame> addFrames(Scanner sc, List<Frame> Bowling) {
        int i = 0;
        while (i < 9) {
            Bowling.add(setframes(sc, i));
            i++;
        }
        Frame tenth = setTenthFrame(sc, i);
        Bowling.add(tenth);
        i++;
        Frame eleventh = setTenthFrame(sc, i);
        Bowling.add(eleventh);
        i++;
        Frame twelfth;
        if (tenth.checkStrike() || (tenth.getfirstRoll() + eleventh.getfirstRoll() == 10)) {
            twelfth = setTenthFrame(sc, i);
            Bowling.add(twelfth);
        }
        return Bowling;
    }

    public static void addSparesandStrikes(List<Frame> Bowling) {
        int i = 0;
        while (i < 9) {
            setSpares(Bowling.get(i), Bowling);
            setStrikes(Bowling.get(i), Bowling);
            i++;
        }

    }

    private static Frame setTenthFrame(Scanner sc, int i) {
        Frame frame;
        System.out.println("What is your roll Frame(10)");
        int roll = sc.nextInt();
        frame = new Frame(i + 1, roll);
        return frame;
    }

    private static Frame setframes(Scanner sc, int i) {
        Frame frame;
        System.out.println("What is your roll" + " Frame(" + (i + 1) + ")");
        int roll = sc.nextInt();
        if (roll == 10) {
            frame = new Frame(i + 1, roll);
        } else {
            System.out.println("What is your roll" + "Frame(" + (i + 1) + ")");
            int secondRoll = sc.nextInt();

            frame = new Frame(i + 1, roll, secondRoll);
        }

        return frame;
    }

    public static void setStrikes(Frame frame, List<Frame> bowling) {
        if (frame.checkStrike()) {
            if (bowling.get(frame.getFrame()).checkStrike()) {
                frame.setNextFrameRoll(bowling.get(frame.getFrame()).getfirstRoll());
                frame.setNextFrameSecondRoll(bowling.get(frame.getFrame() + 1).getfirstRoll());
            } else {
                frame.setNextFrameRoll(bowling.get(frame.getFrame()).getfirstRoll());
                frame.setNextFrameSecondRoll((bowling.get(frame.getFrame()).getsecondRoll()));

            }

        }

    }

    public static void setSpares(Frame frame, List<Frame> bowling) {
        if (frame.checkSpare() && !frame.checkStrike()) {
            frame.setNextFrameRoll(bowling.get(frame.getFrame()).getfirstRoll());
        }

    }

    private static int sum(Frame frame) {
        return frame.getfirstRoll() + frame.getsecondRoll() + frame.getNextFrameRoll() + frame.getNextFrameSecondRoll();
    }

    public static int calculateScore(List<Frame> Bowling) {
        int i = 0;
        int sum = 0;
        while (i < Bowling.size()) {
            sum += sum(Bowling.get(i));
            i++;
        }
        if ((Bowling.get(9).getfirstRoll() + Bowling.get(10).getfirstRoll() == 10) && (!Bowling.get(9).checkStrike()) && (Bowling.get(8).checkStrike())) {
            sum += Bowling.get(10).getfirstRoll();
        }
        return sum;
    }


}


