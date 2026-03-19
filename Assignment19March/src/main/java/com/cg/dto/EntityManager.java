package com.cg.dto;

import com.cg.entity.Trainee;
import com.cg.entity.TraineeDT0;

public class EntityManager {
    public static Trainee convertDtoToObject(TraineeDT0 traineeDT0){
        return new Trainee(traineeDT0.getTraineeId(),traineeDT0.getTraineeName(),traineeDT0.getDomain(),traineeDT0.getLocation());
    }

    public static TraineeDT0 convertTraineeToDTO(Trainee trainee){
        return new TraineeDT0(trainee.getTraineeId(),trainee.getTraineeName(),trainee.getLocation());
    }
}