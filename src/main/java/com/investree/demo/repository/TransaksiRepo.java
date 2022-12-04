package com.investree.demo.repository;

import com.investree.demo.model.Transaksi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;

public interface TransaksiRepo extends JpaRepository<Transaksi,Long> {
    public Map update(Transaksi transaksi);

}
