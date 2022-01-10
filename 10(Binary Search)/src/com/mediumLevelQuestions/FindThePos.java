package com.mediumLevelQuestions;

public class FindThePos {
    public static void main(String[] args) {
        System.out.println(reachNumber(100));
    }

    public static int reachNumber(int target) {

        int currentPosition = 0;
        int stepCount = 1;
        int moves = 0;
        target = Math.abs(target);

        while(currentPosition < target || ((currentPosition - target) % 2 != 0)) {
            currentPosition = currentPosition + stepCount;
            stepCount++;
            moves++;
        }

        return moves;
    }
}
