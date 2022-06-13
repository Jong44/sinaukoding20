package com.sinaukodingg1.sinaukoding1.service;

import com.sinaukodingg1.sinaukoding1.entity.Buku;
import com.sinaukodingg1.sinaukoding1.repository.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BukuService {

    @Autowired
    BukuRepository repository;

    public Buku save(Buku param){
        return repository.save(param);
    }

    public List<Buku> lihatSemuaData(){
        return repository.findAll();
    }

    public Buku findById(Integer id){
        return repository.findById(id).get();
    }

    public Buku updateData(Buku buku, Integer id){
        Buku referenceData = repository.findById(id).get();
        referenceData.setJudul(buku.getJudul() !=null ? buku.getJudul() : referenceData.getJudul());
        referenceData.setPenulis(buku.getPenulis() !=null ? buku.getPenulis() : referenceData.getPenulis());
        referenceData.setJenis_buku(buku.getJenis_buku() !=null ? buku.getJenis_buku() : referenceData.getJenis_buku());

        return repository.save(referenceData);
    }

    public List<Buku> findByNama(String param){
        return repository.findByNamaContaining(param);
    }
    public List<Buku> findByPenulis(String param){
        return repository.findByPenulisContaining(param);
    }

    public boolean deleteData(int id){
        Buku reference = repository.findById(id).orElse(new Buku());
        repository.delete(reference);

        reference = repository.findById(id).orElse(null);

        if (reference == null)
            return true;

        return false;
    }
}
