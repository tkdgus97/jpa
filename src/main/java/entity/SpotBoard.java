package entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class SpotBoard extends Board {
    private String testFiled;
    @ElementCollection
    @CollectionTable(
            name = "spot_board_mention",
            joinColumns = @JoinColumn(name = "spot_board_id")
    )
    private List<Mention> mentions;

    public SpotBoard() {
    }

    public SpotBoard(List<Mention> mentions) {
        this.mentions = mentions;
    }
}
