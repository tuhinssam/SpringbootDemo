package com.tsamanta.lil.learningspring.repository;

import com.tsamanta.lil.learningspring.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    @Override
    Reservation getById(Long aLong);

    Iterable<Reservation> findReservationByReservationDate(Date date);
}
