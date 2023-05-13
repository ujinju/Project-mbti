package project.mbti.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import project.mbti.domain.Login;
import project.mbti.domain.User;
import project.mbti.service.UserService;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users/login")
    public String createFrom(Model model){
        model.addAttribute("userForm", new UserForm());
        return "users/createUserForm";
    }

    @PostMapping("/users/login")
    public String create(@Valid UserForm form, BindingResult result){

        if(result.hasErrors()){
            return "users/createUserForm";
        }

        Login login = new Login(form.getPhoneNum(), form.getPassword(), form.getEmail(), form.getAuthId());

        User user = new User();
        user.setStudentNum(form.getStudentNum());
        user.setSubject(form.getSubject());

        userService.login(user);
        return "redirect:/";
    }
}
