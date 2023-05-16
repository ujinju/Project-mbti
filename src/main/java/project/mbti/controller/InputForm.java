package project.mbti.controller;

import project.mbti.domain.InputButton.mbtiEI;
import project.mbti.domain.InputButton.mbtiNS;
import project.mbti.domain.InputButton.mbtiPJ;
import project.mbti.domain.InputButton.mbtiTF;

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
