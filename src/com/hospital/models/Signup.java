package com.hospital.models;

public class Signup {
    private String patientId;
    private String fullName;
    private String email;
    private String phone;
    private String address;
    private String patientStatus; // Inpatient/Outpatient
    private String username;
    private String password;
    private String assignedDoctor;
    private String assignedRoom;
    private double bill;
    
    public Signup(String patientId, String fullName, String email, String phone, 
                  String address, String patientStatus, String username, String password,
                  String assignedDoctor, String assignedRoom, double bill) {
        this.patientId = patientId;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.patientStatus = patientStatus;
        this.username = username;
        this.password = password;
        this.assignedDoctor = assignedDoctor;
        this.assignedRoom = assignedRoom;
        this.bill = bill;
    }
    
    // Getters
    public String getPatientId() { return patientId; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public String getPatientStatus() { return patientStatus; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getAssignedDoctor() { return assignedDoctor; }
    public String getAssignedRoom() { return assignedRoom; }
    public double getBill() { return bill; }
    
    // Setters
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }
    public void setPatientStatus(String patientStatus) { this.patientStatus = patientStatus; }
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setAssignedDoctor(String assignedDoctor) { this.assignedDoctor = assignedDoctor; }
    public void setAssignedRoom(String assignedRoom) { this.assignedRoom = assignedRoom; }
    public void setBill(double bill) { this.bill = bill; }
}