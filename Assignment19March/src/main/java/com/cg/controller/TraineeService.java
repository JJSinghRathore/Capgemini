package com.cg.controller;

import com.cg.dto.EntityManager;
import com.cg.entity.Trainee;
import com.cg.entity.TraineeDT0;
import com.cg.repo.ITraineeJpaRepository;
import com.cg.repo.ITraineeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TraineeService implements ITraineeRepo {

    @Autowired
    ITraineeJpaRepository repo;

    @Override
    public List<TraineeDT0> getAll(){
        List<Trainee> trainees = repo.findAll();
        List<TraineeDT0> traineeDT0s = new ArrayList<>();
        for (Trainee t: trainees){
            traineeDT0s.add(EntityManager.convertTraineeToDTO(t));
        }
        return traineeDT0s;
    }


    @Override
    public List<TraineeDT0> getByName(String name) {
        List<Trainee> trainees = repo.findAllByTraineeName(name);
        List<TraineeDT0> traineeDT0s = new ArrayList<>();
        for (Trainee t: trainees){
            traineeDT0s.add(EntityManager.convertTraineeToDTO(t));
        }
        return traineeDT0s;
    }

    @Override
    public TraineeDT0 getById(int id) {
        Optional<Trainee> op = repo.findById(id);
        if (op.isPresent()){
            return EntityManager.convertTraineeToDTO(op.get());
        }
        else{
            return null;
        }
    }

    @Override
    public String Delete(int id) {
        Optional<Trainee> op = repo.findById(id);
        if (op.isPresent()){
            repo.deleteById(id);
            return "Delete Successfull";
        }
        else{
            return "No Trainee Found";
        }
    }

    @Override
    public String Insert(TraineeDT0 td1) {
        Optional<Trainee> op = repo.findById(td1.getTraineeId());

        if (op.isPresent()){
            return "Already Exists";
        }
        else{
            Trainee e = EntityManager.convertDtoToObject(td1);
            repo.save(e);
            return "Saved Successfully";
        }
    }

    @Override
    public String update(TraineeDT0 td) {
        Optional<Trainee> op = repo.findById(td.getTraineeId());
        if (op.isPresent()){
            Trainee org = op.get();
            org.setTraineeName(td.getTraineeName());
            org.setLocation(td.getLocation());
            org.setDomain(td.getDomain());
            repo.saveAndFlush(org);
        }
        return "Update Succesfull";
    }

    @Override
    public List<TraineeDT0> getByDomain(String domain) {
        List<Trainee> trainees = repo.findAllByDomain(domain);
        List<TraineeDT0> traineeDT0s = new ArrayList<>();
        for (Trainee t: trainees){
            traineeDT0s.add(EntityManager.convertTraineeToDTO(t));
        }
        return traineeDT0s;
    }

    @Override
    public List<TraineeDT0> getByLocation(String location) {
        List<Trainee> trainees = repo.findAllByLocation(location);
        List<TraineeDT0> traineeDT0s = new ArrayList<>();
        for (Trainee t: trainees){
            traineeDT0s.add(EntityManager.convertTraineeToDTO(t));
        }
        return traineeDT0s;
    }


}