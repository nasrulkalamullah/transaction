package com.investree.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_detail")

public class UserDetail {
    @Id
    private long id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users user;
    private String nama;
    private String alamat;

}
