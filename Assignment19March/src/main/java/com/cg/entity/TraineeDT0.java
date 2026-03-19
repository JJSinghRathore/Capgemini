
package com.cg.entity;


public class TraineeDT0 {
    private Integer traineeId;
    private String traineeName;
    private String domain;
    private String location;

    public TraineeDT0(){}

    public TraineeDT0(Integer traineeId, String traineeName, String location) {
        this.traineeId = traineeId;
        this.traineeName = traineeName;
        this.location = location;
    }

    public TraineeDT0(Integer traineeId, String traineeName, String domain, String location) {
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
