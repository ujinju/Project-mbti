package project.mbti.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import project.mbti.domain.InputButton.mbtiEI;
import project.mbti.domain.InputButton.mbtiNS;
import project.mbti.domain.InputButton.mbtiPJ;
import project.mbti.domain.InputButton.mbtiTF;
import project.mbti.domain.Statistics.MbtiStatistics;

import static javax.persistence.FetchType.LAZY;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Input {

    @Id @GeneratedValue
    @Column(name = "input_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;



    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "mbtiStatistics_id")
    private MbtiStatistics mbtiStatistics;

    @Enumerated(EnumType.STRING)
    private mbtiEI ei;

    @Enumerated(EnumType.STRING)
    private mbtiNS ns;

    @Enumerated(EnumType.STRING)
    private mbtiTF tf;

    @Enumerated(EnumType.STRING)
    private mbtiPJ pj;

    private String mbtiSum;

    public void setUser(User user){
        this.user = user;
        user.getInput().add(this);
    }


    public void getMbti(){
        if(getEi() == mbtiEI.E){
            mbtiSum += getEi();
            if (getNs() == mbtiNS.N){
                mbtiSum += getNs();
                if (getTf() == mbtiTF.T){
                    mbtiSum += getTf();
                    if (getPj() == mbtiPJ.P){
                        mbtiSum += getPj();
                    }else {
                        mbtiSum += getPj();
                    }
                }else {
                    mbtiSum += getTf();
                    if (getPj() == mbtiPJ.P){
                        mbtiSum += getPj();
                    }else {
                        mbtiSum += getPj();
                    }
                }
            }else {
                mbtiSum += getNs();
                if (getTf() == mbtiTF.T){
                    mbtiSum += getTf();
                    if (getPj() == mbtiPJ.P){
                        mbtiSum += getPj();
                    }else {
                        mbtiSum += getPj();
                    }
                }else {
                    mbtiSum += getTf();
                    if (getPj() == mbtiPJ.P){
                        mbtiSum += getPj();
                    }else {
                        mbtiSum += getPj();
                    }
                }
            }
        }else {
            mbtiSum += getEi();
            if (getNs() == mbtiNS.N){
                mbtiSum += getNs();
                if (getTf() == mbtiTF.T){
                    mbtiSum += getTf();
                    if (getPj() == mbtiPJ.P){
                        mbtiSum += getPj();
                    }else {
                        mbtiSum += getPj();
                    }
                }else {
                    mbtiSum += getTf();
                    if (getPj() == mbtiPJ.P){
                        mbtiSum += getPj();
                    }else {
                        mbtiSum += getPj();
                    }
                }
            }else {
                mbtiSum += getNs();
                if (getTf() == mbtiTF.T){
                    mbtiSum += getTf();
                    if (getPj() == mbtiPJ.P){
                        mbtiSum += getPj();
                    }else {
                        mbtiSum += getPj();
                    }
                }else {
                    mbtiSum += getTf();
                    if (getPj() == mbtiPJ.P){
                        mbtiSum += getPj();
                    }else {
                        mbtiSum += getPj();
                    }
                }
            }
        }

       this.setMbtiSum(mbtiSum);

    }

}
