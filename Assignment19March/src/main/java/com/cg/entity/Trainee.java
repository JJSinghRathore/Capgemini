
package com.cg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Repository;

@Repository
@Entity
public class Trainee {
    @Id
    private Integer traineeId;
    private String traineeName;
    private String domain;
    private String location;

    public Trainee(){}

    public Trainee(Integer traineeId, String traineeName, String domain, String location) {
        this.traineeId = traineeId;
        this.traineeName = traineeName;
        this.domain = domain;
        this.location = location;
    }

    public Integer getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(Integer traineeId) {
        this.traineeId = traineeId;
    }

    public String getTraineeName() {
        return traineeName;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
