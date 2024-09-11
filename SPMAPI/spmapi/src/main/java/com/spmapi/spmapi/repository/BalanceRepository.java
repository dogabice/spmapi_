package com.spmapi.spmapi.repository;

import com.spmapi.spmapi.model.Balance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceRepository extends JpaRepository<Balance, Long> {
    // Balance ile ilgili özel sorgular eklenebilir
}