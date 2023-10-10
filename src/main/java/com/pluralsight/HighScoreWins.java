package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a team and score information in the format 'Team Score1 - Team Score2':'");
        String input = myScanner.nextLine();
        String[] parts = input.split("-");
        if (parts.length != 2) {
            System.out.println("Invalid inout format. Please use 'Team1 Score1 - Team2 Score2' format.");
        } else {
            String team1Info = parts[0].trim();
            String team2Info = parts[0].trim();

            String[] team1Data = team1Info.split(" ");
            String[] team2Data = team2Info.split(" ");
            if (team1Data.length != 2 || team2Data.length != 2) {
                System.out.println("Invalid inout format for team information.");
            } else {
                String team1Name = team1Data[0];
                int team1Score = Integer.parseInt(team1Data[1]);
                String team2Name = team2Data[0];
                int team2Score = Integer.parseInt(team2Data[1]);
                if (team1Score > team2Score) {

                    System.out.println("The winner is " + team1Name);
                } else if (team2Score > team1Score) {
                    System.out.println("The winner is " + team2Name);
                } else {
                }
            }
        }


    }
}
