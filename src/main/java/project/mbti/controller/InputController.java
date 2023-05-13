package project.mbti.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import project.mbti.domain.Input;
import project.mbti.domain.Login;
import project.mbti.domain.User;
import project.mbti.service.InputService;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class InputController {

    private final InputService inputService;

    @GetMapping("/input/EI")
    public String createForm(Model model){
        model.addAttribute("inputForm", new InputForm());
        return "input/createInputForm";
    }

    @PostMapping("/input/EI")
    public String create(@Valid InputForm form){

        Input input = new Input();
        input.setMbtiSum(form.toString());

        return "redirect:/";
    }
}
