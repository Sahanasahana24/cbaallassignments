package com.hospital.management;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Hospital Management System");

        Patient patient = new Patient(101, "Ravi Kumar", 25);
        Doctor doctor = new Doctor(201, "Dr. Anjali", "Cardiology");

        patient.displayPatientInfo();
        doctor.displayDoctorInfo();
    }
}
