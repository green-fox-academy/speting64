package main;

import java.util.Arrays;
import java.util.List;

public class TennisGame1 implements TennisGame {


    private int P1Point = 0;
    private int P2Point = 0;
    private Player player1;
    private Player player2;
    List<String> scoreNames = Arrays.asList("Love", "Fifteen", "Thirty", "Forty");
    List<String> scoreNamesWithAll = Arrays.asList("Love-All", "Fifteen-All", "Thirty-all", "Forty-All");

   /* public TennisGame1(String player1Name,String player2Name){

        this.player1 = player(player1Name,0);
        this.player2 = player(player2Name,0);

    }

   /* public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }*/

    public void wonPoint(String playerName) {
        if (player1Name == "player1")
            player1.setScore(1);
        else
            player1.setScore(1);
    }

    public String getScore() {
        String score = "";
        int tempScore=0;
        if (P1Point == P2Point){
            score = scoreNames.get(P1Point);
        /*{
            switch (P1Point)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }*/
        }
        else if (P1Point >=4 || P2Point >=4)
        {
            int minusResult = P1Point - P2Point;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = P1Point;
                else {
                    score+="-";
                    tempScore = P2Point;
                }
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}

