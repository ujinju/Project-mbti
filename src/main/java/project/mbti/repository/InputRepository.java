package project.mbti.repository;

import org.springframework.util.StringUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.mbti.domain.Input;
import project.mbti.domain.InputButton.TendencyStatus;
import project.mbti.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class InputRepository {

    private final EntityManager em;


    public void save(Input input){
        em.persist(input);
    }



    public List<Input> findByMbtiSum(String mbtiSum){
        return em.createQuery("select i from Input i where i.mbtiSum = :mbtiSum", Input.class)
                .setParameter("mbtiSum", mbtiSum)
                .getResultList();
    }

//    public List<Input> findByStatus(String mbtiSum){
//        return em.createQuery("select i from Input i where i.tendencyStatus = :tendencyStatus", Input.class)
//                .setParameter("tendencyStatus", setMbti);
//    }
}
