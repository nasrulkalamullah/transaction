package com.investree.demo.view.impl;

import com.investree.demo.model.Transaksi;
import com.investree.demo.repository.TransaksiRepo;
import com.investree.demo.view.TransaksiService;

import java.util.HashMap;
import java.util.Map;

public class TransaksiPaymentImple implements TransaksiService {
    private TransaksiRepo repoSupp;

    @Override
    public Map save(Transaksi transaksi) {
        Map map = new HashMap();
        try {
            Transaksi trx = repoSupp.save(transaksi);
            map.put("data", trx);
            map.put("statusCode", "200");
            map.put("statusMessage", "Sukses");
            return map;

        } catch (Exception e) {
            e.printStackTrace();
            map.put("statusCode", "500");
            map.put("statusMessage", e);
            return map;
        }
    }

    @Override
    public Map updateStatus(Transaksi transaksi) {
        Map map = new HashMap();
        try {
            Transaksi trx = repoSupp.save(transaksi);

            if(trx == null ){
                map.put("statusCode", "404");
                map.put("statusMessage", "Data id tidak ditemukan");
                return map;
            }
            map.put("data", trx);
            map.put("statusCode", "200");
            map.put("statusMessage", "Lunas");
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            map.put("statusCode", "500");
            map.put("statusMessage", e);
            return map;
        }
    }
}
