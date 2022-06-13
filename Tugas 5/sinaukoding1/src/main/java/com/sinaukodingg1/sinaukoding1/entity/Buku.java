package com.sinaukodingg1.sinaukoding1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "buku")
@Setter
@Getter
public class Buku {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_buku")
    private int id_buku;

    @Column(name = "judul")
    private String judul;

    @Column(name = "penulis")
    private String penulis;

    @Column(name = "tahun_terbit")
    private int tahun_terbit;

    @Column(name = "jenis_buku")
    private String jenis_buku;

}
