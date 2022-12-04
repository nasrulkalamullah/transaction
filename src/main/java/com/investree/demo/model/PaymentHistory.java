package com.investree.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "payment_history")
public class PaymentHistory {
    @Id
    private long id;
    @OneToOne
    @JoinColumn(name = "transaksi_id")
    private Transaksi transaksi;
    private int pembayaranKe;
    private double jumlah;
    private String buktiPembayaran;

}
