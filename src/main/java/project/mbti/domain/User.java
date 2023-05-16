package project.mbti.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.stat.Statistics;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter @Setter
public class User {

    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    private int studentId;

    private String major;

    private int age;

    private String gender;

    private Long loginByKakao;

    private Long loginByNaver;

    private Long loginByGoogle;

    @OneToMany(mappedBy = "user")
    private List<Input> input = new ArrayList<>();

}
