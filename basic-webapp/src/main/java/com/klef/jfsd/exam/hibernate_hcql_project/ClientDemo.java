package com.klef.jfsd.exam.hibernate_hcql_project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utilities.SessionFactoryProvider;

public class ClientDemo {
    public static void main(String[] args) {
        // Obtain the SessionFactory from the SessionFactoryProvider
        SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
        
        // Open a new session
        Session session = sessionFactory.openSession();
        
        // Begin a new transaction
        Transaction t = session.beginTransaction();

        // Create a new Project object
        Project p = new Project("Project X", 10, 300000, "Alice");

        // Save the Project object to the database
        session.save(p);

        // Commit the transaction to save the object
        t.commit();

        // Close the session and session factory
        session.close();
        sessionFactory.close();
    }
}
