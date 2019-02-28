package com.example.BookingSystem.repositories.customer;

import com.example.BookingSystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;


    @Transactional
    public List<Customer> getCustomersByCourse(Long id){
        List<Customer> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.createAlias("bookingAlias.course", "course");
            cr.add(Restrictions.eq("course.id", id));

            results = cr.list();

        } catch(HibernateException ex) {
            ex.printStackTrace();
        }

            return results;
    }

    @Transactional
    public List<Customer> getCustomersInTownForCourse(String town, Long id){
        List<Customer> results = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.createAlias("bookingAlias.course", "course");
            cr.add(Restrictions.eq("course.id", id));
            cr.add(Restrictions.eq("course.town", town));

            results = cr.list();

        } catch(HibernateException ex){
            ex.printStackTrace();
        }

        return results;
    }
    @Transactional
    public List<Customer> getCustomersInTownForCourseOverAge(String town, Long id, int age){
        List<Customer> results = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.createAlias("bookingAlias.course", "course");
//            cr.createAlias("customers", "customerAlias");
            cr.add(Restrictions.eq("course.id", id));
            cr.add(Restrictions.eq("course.town", town));
            cr.add(Restrictions.gt("age", age));

            results = cr.list();

        } catch(HibernateException ex){
            ex.printStackTrace();
        }

        return results;
    }
}
