package com.example.demo.repositories;

import com.example.demo.entities.CurrencyRecord;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface CurrencyRecordRepository extends JpaRepository<CurrencyRecord, Long> {

}
