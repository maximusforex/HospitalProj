package com.ua.satrumroom.dao.daoimplementations.hsql;

import com.ua.satrumroom.dao.DoctorDao;
import com.ua.satrumroom.dao.daoimplementations.HibernateUtil;
import com.ua.satrumroom.domain.Doctor;
import org.hibernate.Session;

import java.util.Scanner;

public class DoctorDAOImplementation extends HibernateUtil implements DoctorDao {

    Scanner scanner = new Scanner(System.in);

    public void addDoctor(Doctor doctor) {
        Session sessionObject = null;
        try {
            sessionObject = buildSessionFactory().openSession();
            sessionObject.beginTransaction();
            doctor = new Doctor();
            sessionObject.save(doctor);
            sessionObject.getTransaction().commit();
        } catch (Exception sqlException) {
            if (null != sessionObject.getTransaction()) {
                System.err.println("\n.......Transaction Is Being Rolled Back.......");
                sessionObject.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if (sessionObject != null) {
                sessionObject.close();
            }
        }
    }
}
