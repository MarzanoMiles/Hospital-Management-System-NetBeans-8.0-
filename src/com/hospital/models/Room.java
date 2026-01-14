package com.hospital.models;

public class Room {
    private String roomNumber;
    private String patientId;
    private String status; // Available, Unavailable, Reserved
    private String assignedCleaner;
    private String cleaningStatus; // Clean, Not Cleaned, Need Repair
    
    public Room(String roomNumber, String patientId, String status, 
                String assignedCleaner, String cleaningStatus) {
        this.roomNumber = roomNumber;
        this.patientId = patientId;
        this.status = status;
        this.assignedCleaner = assignedCleaner;
        this.cleaningStatus = cleaningStatus;
    }
    
    // Getters
    public String getRoomNumber() { return roomNumber; }
    public String getPatientId() { return patientId; }
    public String getStatus() { return status; }
    public String getAssignedCleaner() { return assignedCleaner; }
    public String getCleaningStatus() { return cleaningStatus; }
    
    // Setters
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public void setStatus(String status) { this.status = status; }
    public void setAssignedCleaner(String assignedCleaner) { this.assignedCleaner = assignedCleaner; }
    public void setCleaningStatus(String cleaningStatus) { this.cleaningStatus = cleaningStatus; }
}