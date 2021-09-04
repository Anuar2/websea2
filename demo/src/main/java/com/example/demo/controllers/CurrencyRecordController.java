package com.example.demo.controllers;

import com.example.demo.entities.CurrencyRecord;
import com.example.demo.services.CurrencyRecordService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value = "/api/v1/currency_records")
public class CurrencyRecordController {

    @Autowired
    private CurrencyRecordService currencyRecordService;

    @ResponseBody
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public CurrencyRecord getCurrencyConvert(@RequestParam(value="from_currency_id", required=true) Long fromCurrencyId,
                                             @RequestParam(value="to_currency_id", required=true) Long toCurrencyId,
                                             @RequestParam(value="value", required=true) Double value) {
        return currencyRecordService.convertWithTypingRecord(fromCurrencyId, toCurrencyId, value);
    }

}
