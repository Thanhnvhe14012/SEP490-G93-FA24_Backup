package com.fpt.quickhire.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "account")
@Data
public class User {
    @Id
    @Column(name="id")
    private Long id;

    // Mapping thông tin biến với tên cột trong Database
    @Column(name = "name")
    private String name;
}
