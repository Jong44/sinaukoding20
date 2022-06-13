package com.sinaukodingg1.sinaukoding1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sinaukodingg1.sinaukoding1.entity.Buku;

import java.util.List;

@Repository
public interface BukuRepository extends JpaRepository<Buku, Integer> {
    List<Buku> findByNamaContaining(String nama);
    List<Buku> findByPenulisContaining(String penulis);
}


