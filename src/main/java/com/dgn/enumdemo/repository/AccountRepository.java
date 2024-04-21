package com.dgn.enumdemo.repository;

import com.dgn.enumdemo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account,Long> {


    @Query(value = "SELECT * FROM T_ACCOUNT WHERE STATUS IN (?)",nativeQuery = true)
    List<Account> getAccountByStatusId(List<Integer> statusId);

}
