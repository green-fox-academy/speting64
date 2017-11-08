package main;

import java.util.Arrays;
import java.util.List;

public class TennisGame3 implements TennisGame {

    private int p2;
    private int p1;
    private String p1Name;
    private String p2N;
    List<String> scoreNames = Arrays.asList("Love", "Fifteen", "Thirty", "Forty");

    public TennisGame3(String p1N, String p2N) {
        this.p1Name = p1N;
        this.p2N = p2N;
    }

    public String getScore() {
        String s;
        if (p1 < 4 && p2 < 4) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            s = p[p1];
            return (p1 == p2) ? s + "-All" : s + "-" + p[p2];
        } else {
            if (p1 == p2)
                return "Deuce";
            s = p1 > p2 ? p1Name : p2N;
            return ((p1-p2)*(p1-p2) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.p1 += 1;
        else
            this.p2 += 1;

    }

}
