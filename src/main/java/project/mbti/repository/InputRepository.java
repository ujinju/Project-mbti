package project.mbti.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.mbti.domain.Input;
import project.mbti.domain.User;

import javax.persistence.EntityManager;
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
