package com.eatm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eatm.entity.Attendance;

@Component
public class AttendanceDao {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private EntityTransaction entityTransaction;

    public Attendance saveAttendance(Attendance attendance) {
        entityTransaction.begin();
        entityManager.persist(attendance);
        entityTransaction.commit();
        return attendance;
    }

    public Attendance updateAttendance(Attendance attendance) {
        entityTransaction.begin();
        entityManager.merge(attendance);
        entityTransaction.commit();
        return attendance;
    }

    public Attendance deleteAttendance(Attendance attendance) {
        entityTransaction.begin();
        entityManager.remove(attendance);
        entityTransaction.commit();
        return attendance;
    }

    public Attendance findAttendanceById(int attendanceId) {
        return entityManager.find(Attendance.class, attendanceId);
    }
}
