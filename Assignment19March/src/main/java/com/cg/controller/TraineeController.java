package com.cg.controller;

import com.cg.entity.TraineeDT0;
import com.cg.repo.ITraineeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TraineeController {
    @Autowired
    ITraineeRepo service;

    @GetMapping("all")
    public List<TraineeDT0> task1(){
        return service.getAll();
    }

    @GetMapping("findByName/{name}")
    public List<TraineeDT0> task2(@PathVariable String name){
        return service.getByName(name);
    }

    @PostMapping("insert")
    public String task3(@RequestBody TraineeDT0 traineeDTO){
        return service.Insert(traineeDTO);
    }

    @RequestMapping("delete/{id}")
    public String task4(@PathVariable int id){
        return service.Delete(id);
    }

    @GetMapping("findById/{id}")
    public TraineeDT0 task5(@PathVariable int id){
        return service.getById(id);
    }

    @RequestMapping("update")
    public String task6(@RequestBody TraineeDT0 td){
        return service.update(td);
    }

    @GetMapping("findByLocation/{location}")
    public List<TraineeDT0> task7(@PathVariable String location){
        return service.getByLocation(location);
    }

    @GetMapping("findByDomain/{domain}")
    public List<TraineeDT0> task8(@PathVariable String domain){
        return service.getByDomain(domain);
    }
}