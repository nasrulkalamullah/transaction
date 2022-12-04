package com.investree.demo;

import com.investree.demo.model.Transaksi;
import com.investree.demo.repository.TransaksiRepo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

public class TestingController {
    @Autowired
    private TransaksiRepo trxRepo;
    @Autowired
    Transaksi transaksi;

    @Test
    @PostMapping("/save/{id}")
    void restTemplateSave (){
        Map map = new HashMap();
        Map obj = (Map) trxRepo.save(transaksi);
    }
}
