package com.cybage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cybage.model.Complain;

@Repository
public interface ComplainRepo extends JpaRepository<Complain,Integer> {

	

	Complain findComplainByComplainStatus(String complainStatus);

}
