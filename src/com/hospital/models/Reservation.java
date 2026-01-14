package com.hospital.models;

public class Reservation {
    private String reservationId;
    private String patientId;
    private String type; // Check-up, Admission
    private String assignedDoctor;
    private String date;
    private String status; // Pending, Approved, Declined
    private String notes;
    
    public Reservation(String reservationId, String patientId, String type,
                       String assignedDoctor, String date, String status, String notes) {
        this.reservationId = reservationId;
        this.patientId = patientId;
        this.type = type;
        this.assignedDoctor = assignedDoctor;
        this.date = date;
        this.status = status;
        this.notes = notes;
    }
    
    // Getters
    public String getReservationId() { return reservationId; }
    public String getPatientId() { return patientId; }
    public String getType() { return type; }
    public String getAssignedDoctor() { return assignedDoctor; }
    public String getDate() { return date; }
    public String getStatus() { return status; }
    public String getNotes() { return notes; }
    
    // Setters
    public void setReservationId(String reservationId) { this.reservationId = reservationId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public void setType(String type) { this.type = type; }
    public void setAssignedDoctor(String assignedDoctor) { this.assignedDoctor = assignedDoctor; }
    public void setDate(String date) { this.date = date; }
    public void setStatus(String status) { this.status = status; }
    public void setNotes(String notes) { this.notes = notes; }
}