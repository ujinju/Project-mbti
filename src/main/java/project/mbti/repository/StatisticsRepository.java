package project.mbti.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import project.mbti.domain.Statistics.MbtiStatistics;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class StatisticsRepository {

    private final EntityManager em;

    //mbti 전체 찾음 ( 찾아서 통계 내야 하니까 )
    public List<MbtiStatistics> findAll() {
        return em.createQuery("select m from MbtiStatistics m", MbtiStatistics.class)
                .getResultList();
    }


}
