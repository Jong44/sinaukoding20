package com.sinaukodingg1.sinaukoding1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "anggota")
@Setter
@Getter
public class Anggota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_anggota")
    private int id_anggota;

    @Column(name = "nama")
    private String nama;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "no_telp")
    private String no_telp;

    @Column(name = "tgl_lahir")
    private int tgl_lahir;

    @Column(name = "jenis_buku")
    private String jenis_buku;

}
