package com.tsamanta.lil.learningspring.repository;

import com.tsamanta.lil.learningspring.model.Guest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {

    @Override
    Guest getById(Long aLong);

    @Override
    <S extends Guest> Page<S> findAll(Example<S> example, Pageable pageable);
}
