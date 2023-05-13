package project.mbti.controller;

import project.mbti.domain.mbtiEI;
import project.mbti.domain.mbtiNS;
import project.mbti.domain.mbtiPJ;
import project.mbti.domain.mbtiTF;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class InputForm {

    @Enumerated(EnumType.STRING)
    private mbtiEI ei;

    @Enumerated(EnumType.STRING)
    private mbtiNS ns;

    @Enumerated(EnumType.STRING)
    private mbtiTF tf;

    @Enumerated(EnumType.STRING)
    private mbtiPJ pj;

    private String mbtiSum;
}
