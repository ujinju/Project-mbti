package project.mbti.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class UserForm {

    @NotEmpty(message = "학번을 입력하시오.")
    private int studentId;

    @NotEmpty(message = "학과를 선택하시오.")
    private String major;

    private String authId;
    private String password;
    private Long phoneNum;
    private String email;
}
