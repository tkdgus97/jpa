package entity;

import org.hibernate.LazyInitializationException;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Table(name = "member")
@DynamicUpdate
public class Member {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String username;
    @Column(name = "age")
    private Integer age;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @Column(nullable = true)
//    private Team team;

    public Member(Long id, String username, Integer age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    public Member() {
    }

//    public void changeTeam(Team team) {
//        if (this.team != null) {
//            this.team = null;
//        }
//        this.team = team;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
