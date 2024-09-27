package com.utp.viacosta.dao;

import com.utp.viacosta.model.SedesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedesRepository extends JpaRepository<SedesModel, Integer> {

}
