package com.hospital.models;

public class Patient {
    private String patientId;
    private String fullName;
    private String email;
    private String phone;
    private String patientStatus; // Inpatient/Outpatient
    private String disease;
    private String status; // Checked In, Discharged, etc.
    private String assignedDoctor;
    private String assignedRoom;
    private double bill;
    
    public Patient(String patientId, String fullName, String email, String phone,
                   String patientStatus, String disease, String status,
                   String assignedDoctor, String assignedRoom, double bill) {
        this.patientId = patientId;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.patientStatus = patientStatus;
        this.disease = disease;
        this.status = status;
        this.assignedDoctor = assignedDoctor;
        this.assignedRoom = assignedRoom;
        this.bill = bill;
    }
    
    // Getters
    public String getPatientId() { return patientId; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getPatientStatus() { return patientStatus; }
    public String getDisease() { return disease; }
    public String getStatus() { return status; }
    public String getAssignedDoctor() { return assignedDoctor; }
    public String getAssignedRoom() { return assignedRoom; }
    public double getBill() { return bill; }
    
    // Setters
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setPatientStatus(String patientStatus) { this.patientStatus = patientStatus; }
    public void setDisease(String disease) { this.disease = disease; }
    public void setStatus(String status) { this.status = status; }
    public void setAssignedDoctor(String assignedDoctor) { this.assignedDoctor = assignedDoctor; }
    public void setAssignedRoom(String assignedRoom) { this.assignedRoom = assignedRoom; }
    public void setBill(double bill) { this.bill = bill; }
}