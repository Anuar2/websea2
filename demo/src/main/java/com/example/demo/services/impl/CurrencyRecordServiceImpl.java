package com.example.demo.services.impl;

import com.example.demo.repositories.CurrencyRecordRepository;
import com.example.demo.services.CurrencyRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyRecordServiceImpl implements CurrencyRecordService {

    @Autowired
    private CurrencyRecordRepository currencyRecordRepository;

}
