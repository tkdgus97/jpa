package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class League {
    @Id
    private String id;

    private String name;
}
