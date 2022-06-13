package com.sinaukodingg1.sinaukoding1.repository;

import com.sinaukodingg1.sinaukoding1.entity.Anggota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnggotaRepository extends JpaRepository<Anggota, Integer> {
    List<Anggota> findByNamaContaining(String nama);
}
