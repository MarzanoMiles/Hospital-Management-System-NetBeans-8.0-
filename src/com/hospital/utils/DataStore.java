package com.hospital.utils;

import com.hospital.models.*;
import java.util.ArrayList;
import java.util.List;

public class DataStore {

    private static DataStore instance;

    private List<User> users;          // admin, co-admin, doctor, nurse, cashier, patient
    private List<Signup> signup;        // for patients only
    private List<Patient> patients;     // all patient records
    private List<Reservation> reservations; // checkup / admission
    private List<Room> rooms;           // room management
    private List<Billing> billings;     // fees & charges

    private DataStore() {
        users = new ArrayList<>();
        signup = new ArrayList<>();     // FIX: was incomplete
        patients = new ArrayList<>();
        reservations = new ArrayList<>();
        rooms = new ArrayList<>();
        billings = new ArrayList<>();
        initializeData();
    }

    public static DataStore getInstance() {
        if (instance == null) {
            instance = new DataStore();
        }
        return instance;
    }

    private void initializeData() {

        /* =========================
           DEFAULT ACCOUNTS
           ========================= */

        // Admin (fixed account)
        users.add(new User("kurt", "kurt123", "ADMIN"));

        // Co-Admin / Management
        users.add(new User("coadmin", "co123", "CO_ADMIN"));

        // Doctor
        users.add(new User("doc", "doc123", "DOCTOR"));

        // Nurse
        users.add(new User("nurse", "nurse123", "NURSE"));

        // Cashier
        users.add(new User("cash", "cash123", "CASHIER"));

        /* =========================
           Sign Up
           ========================= */
        signup.add(new Signup(
                null, //Hidden to signup pageUI, empty patient ID admin/co-admin to assign when approve
                "Miles Marzano",
                "miles@email.com",
                "09170000001",
                "San Francisco",
                null, //Hidden empty patient status(Inpatient/Outpatient)admin/co-admin to assign when approve
                "Username",
                "Password",
                null, //Hidden to signup pageUI, empty doctor assign admin/co-admin to assign when approve
                null, //Hidden to signup pageUI, empty room assign admin/co-admin to assign when approve
                0.0 // Hidden to signup pageUI, empty bill updated by admin/co-admin to assign when approve
        ));

        /* =========================
           ROOMS
           ========================= */
        rooms.add(new Room("R101", null, "Available", "Juan Cleaner", "Clean"));
        rooms.add(new Room("R102", null, "Unavailable", "Ana Cleaner", "Need Repair"));
        rooms.add(new Room("R103", null, "Reserved", "Mike Cleaner", "Not Cleaned"));

        /* =========================
           PATIENTS
           ========================= */
        patients.add(new Patient(
                "P001",
                "Miles Marzano",
                "miles@email.com",
                "09170000001",
                "Outpatient",
                "Flu", //type of desease assigned/editable by doctor only
                "Checked In",
                "dr.juan",
                null,
                0.0
        ));

        patients.add(new Patient(
                "P002",
                "Rosalyn Locson",
                "rosalyn@email.com",
                "09170000002",
                "Inpatient",
                "Flu", // type of desease assigned/editable by doctor only
                "Checked In",
                "dr.juan",
                "R101",
                2500.0
        ));

        /* =========================
           RESERVATIONS
           ========================= */
        reservations.add(new Reservation(
                "RES001",
                "P001",
                "Check-up",
                "dr.juan",
                "2026-01-15",
                "Pending",
                ""
        ));

        reservations.add(new Reservation(
                "RES002",
                "P002",
                "Admission",
                "dr.juan",
                "2026-01-10",
                "Approved",
                "Room available"
        ));

        /* =========================
           BILLINGS
           ========================= */
        billings.add(new Billing(
                "BILL001",
                "P002",
                "Room Charge",
                2500.0,
                "Unpaid"
        ));
    }

    /* =========================
       GETTERS (ACCESS CONTROL VIA UI)
       ========================= */

    // Admin / Co-Admin only
    public List<Room> getRooms() {
        return rooms;
    }

    // Shared login portal (role-based dashboard)
    public List<User> getUsers() {
        return users;
    }

    // Patients see own record only
    // Admin sees all
    // Doctor sees assigned patients and nurse under them
    // Nurse see doctor and patient assign to them
    public List<Patient> getPatients() {
        return patients;
    }

    // Reservation Management
    // Patient → create
    // Admin / Co-Admin → approve / decline
    public List<Reservation> getReservations() {
        return reservations;
    }

    // Billing
    // Cashier / Admin → edit
    // Co-Admin → view only
    public List<Billing> getBillings() {
        return billings;
    }

    // Sign-up requests
    // Patient → submit
    // Admin / Co-Admin → approve / reject
    public List<Signup> getSignup() {
        return signup;
    }

    /* =========================
       PATIENT LOGIN (SEPARATE)
       ========================= */

    // Patient login uses signup list ONLY
    public Signup patientLogin(String username, String password) {

        for (Signup s : signup) {
            if (s.getUsername().equals(username)
                    && s.getPassword().equals(password)) {
                return s;
            }
        }
        return null;
    }

    // After approval, get patient record
    public Patient getPatientById(String patientId) {

        for (Patient p : patients) {
            if (p.getPatientId().equals(patientId)) {
                return p;
            }
        }
        return null;
    }
}