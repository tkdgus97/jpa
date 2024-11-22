package entity;

import javax.persistence.Entity;

@Entity
public class LeagueBoard extends Board {
    private String ddd;

    public LeagueBoard() {
    }

    public LeagueBoard(String ddd) {
        this.ddd = ddd;
    }
}
