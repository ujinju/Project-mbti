package project.mbti.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.mbti.domain.Input;
import project.mbti.domain.InputButton.TendencyStatus;
import project.mbti.domain.User;
import project.mbti.repository.InputRepository;
import project.mbti.repository.UserRepository;

import javax.persistence.EntityManager;
import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class InputService {

    private final InputRepository inputRepository;


    private void validateDuplicateUser(Input input){
        List<Input> findMbti = inputRepository.findByMbtiSum(input.getMbtiSum());
        if(!findMbti.isEmpty()){
            throw new IllegalStateException("이미 MBTI를 입력하였습니다.");
        }
    }

}
