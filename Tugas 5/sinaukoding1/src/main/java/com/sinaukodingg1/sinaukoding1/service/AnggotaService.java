package com.sinaukodingg1.sinaukoding1.service;

import com.sinaukodingg1.sinaukoding1.entity.Anggota;
import com.sinaukodingg1.sinaukoding1.repository.AnggotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnggotaService {
    @Autowired
    AnggotaRepository repository;

    public Anggota save(Anggota param){
        return repository.save(param);
    }
    public List<Anggota> lihatSemuaData(){
        return repository.findAll();
    }

    public Anggota findById(Integer id){
        return repository.findById(id).get();
    }

    public Anggota updateData(Anggota anggota, Integer id){
        Anggota referenceData = repository.findById(id).get();
        referenceData.setNama(anggota.getNama() !=null ? anggota.getNama():referenceData.getNama());
        referenceData.setAlamat(anggota.getAlamat() !=null ? anggota.getAlamat():referenceData.getAlamat());
        referenceData.setNo_telp(anggota.getNo_telp() !=null ? anggota.getNo_telp():referenceData.getNo_telp());
        referenceData.setJenis_buku(anggota.getJenis_buku() !=null ? anggota.getJenis_buku() : referenceData.getJenis_buku());

        return repository.save(referenceData);
    }

    public List<Anggota> findByNama(String param){
        return repository.findByNamaContaining(param);
    }

    public boolean deleteData(int id){
        Anggota reference = repository.findById(id).orElse(new Anggota());
        repository.delete(reference);

        reference = repository.findById(id).orElse(null);

        if (reference == null)
            return true;

        return false;
    }
}
