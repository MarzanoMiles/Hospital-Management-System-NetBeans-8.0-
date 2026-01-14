package com.hospital.models;

public class Billing {
    private String billingId;
    private String patientId;
    private String description;
    private double amount;
    private String status; // Paid, Unpaid
    
    public Billing(String billingId, String patientId, String description,
                   double amount, String status) {
        this.billingId = billingId;
        this.patientId = patientId;
        this.description = description;
        this.amount = amount;
        this.status = status;
    }
    
    // Getters
    public String getBillingId() { return billingId; }
    public String getPatientId() { return patientId; }
    public String getDescription() { return description; }
    public double getAmount() { return amount; }
    public String getStatus() { return status; }
    
    // Setters
    public void setBillingId(String billingId) { this.billingId = billingId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public void setDescription(String description) { this.description = description; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setStatus(String status) { this.status = status; }
}