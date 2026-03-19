package com.cg.repo;

import com.cg.entity.TraineeDT0;

import java.util.List;

public interface ITraineeRepo {
    public List<TraineeDT0> getAll();
    public List<TraineeDT0> getByName(String TraineeName);
    public TraineeDT0 getById(int id);
    public String Delete(int id);
    public String Insert(TraineeDT0 td);
    public String update(TraineeDT0 td1);
    public List<TraineeDT0> getByDomain(String domain);
    public List<TraineeDT0> getByLocation(String location);
	
}
