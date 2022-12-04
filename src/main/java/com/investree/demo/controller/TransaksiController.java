package com.investree.demo.controller;


import com.investree.demo.model.Transaksi;
import com.investree.demo.repository.TransaksiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/transaksi/")
public class TransaksiController {

    @Autowired
    private TransaksiRepo trxRepo;

    @PostMapping("/save/{id}")
    public ResponseEntity<Map> save(@PathVariable(value = "id") @RequestBody Transaksi objModel) {
        Map map = new HashMap();
        Map obj = (Map) trxRepo.save(objModel);
        return new ResponseEntity<Map>(obj, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Map> update(@PathVariable(value = "id")  @RequestBody Transaksi objModel ) {
        Map map = trxRepo.update(objModel);
        return new ResponseEntity<Map>(map, HttpStatus.OK);
    }

}
