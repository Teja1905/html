package com.teja.patientinsert;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatDao extends JpaRepository<patient, Integer> {

}
