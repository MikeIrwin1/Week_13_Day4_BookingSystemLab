package com.example.BookingSystem.repositories.course;

import com.example.BookingSystem.models.Course;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> getCoursesByCustomer(Long id){
        List<Course> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Course.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.createAlias("bookingAlias.customer", "customer");
            cr.add(Restrictions.eq("customer.id", id));

            results = cr.list();

        } catch(HibernateException ex) {
            ex.printStackTrace();
        }

        return results;
    }
}
