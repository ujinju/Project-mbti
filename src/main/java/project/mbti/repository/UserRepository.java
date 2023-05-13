package project.mbti.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import project.mbti.domain.User;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final EntityManager em;

    public void save(User user){
        em.persist(user);
    }

    public User findOne(Long id){
        return em.find(User.class, id);
    }

    public List<User> findAll(Long id){
        return em.createQuery("select u from User u", User.class)
                .getResultList();
    }

    public List<User> findByStudentNum(int studentNum){
        return em.createQuery("select u from User u where u.studentNum = :studentNum", User.class)
                .setParameter("studentNum", studentNum)
                .getResultList();
    }
}

