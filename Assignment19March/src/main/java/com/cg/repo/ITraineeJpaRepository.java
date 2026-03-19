package com.cg.repo;

import com.cg.entity.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITraineeJpaRepository extends JpaRepository<Trainee,Integer> {
    public List<Trainee> findAllByTraineeName(String name);
    public List<Trainee> findAllByDomain(String domain);
    public List<Trainee> findAllByLocation(String location);
}
