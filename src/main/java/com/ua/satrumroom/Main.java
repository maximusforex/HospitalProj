package com.ua.satrumroom;

import com.ua.satrumroom.dao.DoctorDao;
import com.ua.satrumroom.dao.daoimplementations.HibernateUtil;
import com.ua.satrumroom.dao.daoimplementations.hsql.DoctorDAOImplementation;
import com.ua.satrumroom.domain.Doctor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Doctor> doctors = new ArrayList<>();

        Doctor doctor1 = new Doctor();
        System.out.println("Enter first name: ");
        doctor1.setFirstName(scanner.nextLine());
        System.out.println("Enter second name: ");
        doctor1.setSecondName(scanner.nextLine());
        System.out.println("Enter last name: ");
        doctor1.setLastName(scanner.nextLine());
        doctors.add(doctor1);
        Doctor doctor2 = new Doctor();
        System.out.println("Enter first name: ");
        doctor1.setFirstName(scanner.nextLine());
        System.out.println("Enter second name: ");
        doctor1.setSecondName(scanner.nextLine());
        System.out.println("Enter last name: ");
        doctor1.setLastName(scanner.nextLine());
        doctors.add(doctor2);

        DoctorDao doctorDao = new DoctorDAOImplementation();
        doctors.forEach(doctorDao::addDoctor);


    }
}
