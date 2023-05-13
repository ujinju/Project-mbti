package project.mbti.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "Mbti_Statistics")
@Getter @Setter
public class MbtiStatistics extends Input{

    @Id @GeneratedValue
    @Column(name = "mbtiStatistics_id")
    private Long id;

    @OneToMany(mappedBy = "mbtiStatistics", cascade = CascadeType.ALL)
    private List<Input> inputs = new ArrayList<>();



}
