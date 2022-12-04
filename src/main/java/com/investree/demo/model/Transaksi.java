package com.investree.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transaksi")
public class Transaksi {
    @Id
    private long id;
    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;
    @ManyToOne
    @JoinColumn(name = "user_detail_id")
    private UserDetail userDetail;
    private int tenor;
    private double totalPinjaman;
    private double bungaPersen;
    private String status;


}
