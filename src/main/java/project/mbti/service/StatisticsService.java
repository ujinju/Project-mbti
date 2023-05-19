package project.mbti.service;

import lombok.RequiredArgsConstructor;
import org.hibernate.stat.Statistics;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.mbti.domain.Input;
import project.mbti.domain.Statistics.MbtiStatistics;
import project.mbti.domain.User;
import project.mbti.repository.InputRepository;
import project.mbti.repository.StatisticsRepository;
import project.mbti.repository.UserRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class StatisticsService {

    private final StatisticsRepository statisticsRepository;
    private final UserRepository userRepository;
    private Input[] inputs;

    public List<User> findUsers(){
        return userRepository.findAll();
    }

}
