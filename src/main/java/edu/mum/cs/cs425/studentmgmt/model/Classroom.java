package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Classroom {

    @Id
   private int  classroomId;

   private String buildingName;

   private String roomNumber ;

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Classroom(int classroomId, String buildingName, String roomNumber) {
        this.classroomId = classroomId;
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
    }

    public Classroom() {
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "classroomId=" + classroomId +
                ", buildingName='" + buildingName + '\'' +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
