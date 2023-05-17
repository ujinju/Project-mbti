package project.mbti.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import project.mbti.domain.Input;
import project.mbti.domain.InputButton.mbtiEI;
import project.mbti.domain.InputButton.mbtiNS;
import project.mbti.domain.InputButton.mbtiPJ;
import project.mbti.domain.InputButton.mbtiTF;
import project.mbti.service.InputService;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class InputController {

    private final InputService inputService;

    @GetMapping("/input/EI")
    public String createEIForm(Model model){
        model.addAttribute("inputForm", new InputForm());
        return "input/createInputEIForm";
    }

    @PostMapping("/input/EI")
    public String createEI(@Valid InputForm form){

        Input input = new Input();
        input.setMbtiSum(form.toString());

        input.setEi(mbtiEI.valueOf(form.toString()));

        return "input/createInputNSForm";
    }

    @GetMapping("/input/NS")
    public String createNSForm(Model model){
        model.addAttribute("inputForm", new InputForm());
        return "input/createInputNSForm";
    }

    @PostMapping("/input/NS")
    public String createNS(@Valid InputForm form){

        Input input = new Input();
        input.setMbtiSum(form.toString());

        input.setNs(mbtiNS.valueOf(form.toString()));

        return "input/createInputTFForm";
    }

    @GetMapping("/input/TF")
    public String createTFForm(Model model){
        model.addAttribute("inputForm", new InputForm());
        return "input/createInputTFForm";
    }

    @PostMapping("/input/TF")
    public String createTF(@Valid InputForm form){

        Input input = new Input();
        input.setMbtiSum(form.toString());

        input.setTf(mbtiTF.valueOf(form.toString()));

        return "input/createInputPJForm";
    }

    @GetMapping("/input/PJ")
    public String createPJForm(Model model){
        model.addAttribute("inputForm", new InputForm());
        return "input/createInputPJForm";
    }

    @PostMapping("/input/PJ")
    public String createPJ(@Valid InputForm form){

        Input input = new Input();
        input.setMbtiSum(form.toString());

        input.setPj(mbtiPJ.valueOf(form.toString()));

        return "result/inputResult";
    }
}
