package com.ua.satrumroom.dao.daoimplementations.hsql;

import com.ua.satrumroom.dao.DoctorDao;
import com.ua.satrumroom.dao.daoimplementations.HibernateUtil;
import com.ua.satrumroom.domain.Doctor;
import org.hibernate.Session;
import java.util.UUID;

public class DoctorDAOImplementation extends HibernateUtil implements DoctorDao {

    public void addDoctor(Doctor doctor) {
        Session sessionObject = null;
        try {
            sessionObject = buildSessionFactory().openSession();
            sessionObject.beginTransaction();
            sessionObject.save(doctor);
            System.out.println("\n.......Records Saved Successfully To The Database.......\n");
            sessionObject.getTransaction().commit();
        } catch (Exception sqlException) {
            if (sessionObject.getTransaction() != null) {
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
