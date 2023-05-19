package project.mbti.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import project.mbti.domain.InputButton.*;
import project.mbti.domain.Statistics.MbtiStatistics;

import static javax.persistence.FetchType.LAZY;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Input {

    @Id
    @GeneratedValue
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

    @Enumerated(EnumType.STRING)
    private TendencyStatus tendencyStatus;

//    @Column(name = "inputEI")
//    private String EI;
//    @Column(name = "inputNS")
//    private String NS;
//    @Column(name = "inputFT")
//    private String FT;
//    @Column(name = "inputPJ")
//    private String PJ;


    private String mbtiSum;

    public void setUser(User user) {
        this.user = user;
        user.getInput().add(this);
    }

    public String getMbti() {
        if (getTendencyStatus() == tendencyStatus.E) {
            //mbtiSum += getTendencyStatus();
            mbtiSum += tendencyStatus.toString();
            if (getTendencyStatus() == tendencyStatus.N) {
                //mbtiSum += getTendencyStatus();
                mbtiSum += tendencyStatus.toString();
                if (getTendencyStatus() == tendencyStatus.T) {
                    //mbtiSum += getTendencyStatus();
                    mbtiSum += tendencyStatus.toString();
                    if (getTendencyStatus() == tendencyStatus.P) {
                        //mbtiSum += getTendencyStatus();
                        mbtiSum += tendencyStatus.toString();
                    } else {
                        //mbtiSum += getTendencyStatus();
                        mbtiSum += tendencyStatus.toString();
                    }
                } else {
                    //mbtiSum += getTf();
                    mbtiSum += tendencyStatus.toString();
                    if (getTendencyStatus() == tendencyStatus.P) {
                        //mbtiSum += getTendencyStatus();
                        mbtiSum += tendencyStatus.toString();
                    } else {
                        //mbtiSum += getTendencyStatus();
                        mbtiSum += tendencyStatus.toString();
                    }
                }
            } else {
                //mbtiSum += getNs();
                mbtiSum += tendencyStatus.toString();
                if (getTendencyStatus() == tendencyStatus.T) {
                    //mbtiSum += getTendencyStatus();
                    mbtiSum += tendencyStatus.toString();
                    if (getTendencyStatus() == tendencyStatus.P) {
                        //mbtiSum += getTendencyStatus();
                        mbtiSum += tendencyStatus.toString();
                    } else {
                        //mbtiSum += getTendencyStatus();
                        mbtiSum += tendencyStatus.toString();
                    }
                } else {
                    //mbtiSum += getTendencyStatus();
                    mbtiSum += tendencyStatus.toString();
                    if (getTendencyStatus() == tendencyStatus.P) {
                        //mbtiSum += getTendencyStatus();
                        mbtiSum += tendencyStatus.toString();
                    } else {
                        //mbtiSum += getTendencyStatus();
                        mbtiSum += tendencyStatus.toString();
                    }
                }
            }
        } else {
            //mbtiSum += getEi();
            mbtiSum += tendencyStatus.toString();
            if (getTendencyStatus() == tendencyStatus.N) {
                //mbtiSum += getTendencyStatus();
                mbtiSum += tendencyStatus.toString();
                if (getTendencyStatus() == tendencyStatus.T) {
                    //mbtiSum += getTendencyStatus();
                    mbtiSum += tendencyStatus.toString();
                    if (getTendencyStatus() == tendencyStatus.P) {
                        //mbtiSum += getTendencyStatus();
                        mbtiSum += tendencyStatus.toString();
                    } else {
                        //mbtiSum += getTendencyStatus();
                        mbtiSum += tendencyStatus.toString();
                    }
                } else {
                    //mbtiSum += getTendencyStatus();
                    mbtiSum += tendencyStatus.toString();
                    if (getTendencyStatus() == tendencyStatus.P) {
                        //mbtiSum += getTendencyStatus();
                        mbtiSum += tendencyStatus.toString();
                    } else {
                        //mbtiSum += getTendencyStatus();
                        mbtiSum += tendencyStatus.toString();
                    }
                }
            } else {
                //mbtiSum += getTendencyStatus();
                mbtiSum += tendencyStatus.toString();
                if (getTendencyStatus() == tendencyStatus.T) {
                    //mbtiSum += getTf();
                    mbtiSum += tendencyStatus.toString();
                    if (getTendencyStatus() == tendencyStatus.P) {
                        //mbtiSum += getTendencyStatus();
                        mbtiSum += tendencyStatus.toString();
                    } else {
                        //mbtiSum += getTendencyStatus();
                        mbtiSum += tendencyStatus.toString();
                    }
                } else {
                    //mbtiSum += getTendencyStatus();
                    mbtiSum += tendencyStatus.toString();
                    if (getTendencyStatus() == tendencyStatus.P) {
                        //mbtiSum += getTendencyStatus();
                        mbtiSum += tendencyStatus.toString();
                    } else {
                        //mbtiSum += getTendencyStatus();
                        mbtiSum += tendencyStatus.toString();
                    }
                }
            }
        }

        return mbtiSum;
    }
}

//    public void getMbti(){
//        if(getEi() == mbtiEI.E){
//            mbtiSum += getEi();
//            if (getNs() == mbtiNS.N){
//                mbtiSum += getNs();
//                if (getTf() == mbtiTF.T){
//                    mbtiSum += getTf();
//                    if (getPj() == mbtiPJ.P){
//                        mbtiSum += getPj();
//                    }else {
//                        mbtiSum += getPj();
//                    }
//                }else {
//                    mbtiSum += getTf();
//                    if (getPj() == mbtiPJ.P){
//                        mbtiSum += getPj();
//                    }else {
//                        mbtiSum += getPj();
//                    }
//                }
//            }else {
//                mbtiSum += getNs();
//                if (getTf() == mbtiTF.T){
//                    mbtiSum += getTf();
//                    if (getPj() == mbtiPJ.P){
//                        mbtiSum += getPj();
//                    }else {
//                        mbtiSum += getPj();
//                    }
//                }else {
//                    mbtiSum += getTf();
//                    if (getPj() == mbtiPJ.P){
//                        mbtiSum += getPj();
//                    }else {
//                        mbtiSum += getPj();
//                    }
//                }
//            }
//        }else {
//            mbtiSum += getEi();
//            if (getNs() == mbtiNS.N){
//                mbtiSum += getNs();
//                if (getTf() == mbtiTF.T){
//                    mbtiSum += getTf();
//                    if (getPj() == mbtiPJ.P){
//                        mbtiSum += getPj();
//                    }else {
//                        mbtiSum += getPj();
//                    }
//                }else {
//                    mbtiSum += getTf();
//                    if (getPj() == mbtiPJ.P){
//                        mbtiSum += getPj();
//                    }else {
//                        mbtiSum += getPj();
//                    }
//                }
//            }else {
//                mbtiSum += getNs();
//                if (getTf() == mbtiTF.T){
//                    mbtiSum += getTf();
//                    if (getPj() == mbtiPJ.P){
//                        mbtiSum += getPj();
//                    }else {
//                        mbtiSum += getPj();
//                    }
//                }else {
//                    mbtiSum += getTf();
//                    if (getPj() == mbtiPJ.P){
//                        mbtiSum += getPj();
//                    }else {
//                        mbtiSum += getPj();
//                    }
//                }
//            }
//        }
//
//        this.setMbtiSum(mbtiSum);
//    }


