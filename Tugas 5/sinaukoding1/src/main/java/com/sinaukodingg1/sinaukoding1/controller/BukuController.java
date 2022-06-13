package com.sinaukodingg1.sinaukoding1.controller;

import com.sinaukodingg1.sinaukoding1.entity.Buku;
import com.sinaukodingg1.sinaukoding1.service.BukuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/buku")
public class BukuController {
    @Autowired
    BukuService service;

    @PostMapping
    public Buku saveUser(@RequestBody Buku param){
        return service.save(param);
    }

    @GetMapping
    public List<Buku> findAll(){
        return service.lihatSemuaData();
    }

    @GetMapping(value = "/find-by-nama")
    public List<Buku> findByNama(@RequestParam(value = "nama") String nama){
        return service.findByNama(nama);
    }

    @GetMapping(value = "/find-by-penulis")
    public List<Buku> findByPenulis(@RequestParam(value = "penulis") String penulis){
        return service.findByPenulis(penulis);
    }

    @GetMapping(value =" /{id}")
    public Buku findById(@PathVariable int id){
        return service.findById(id);
    }

    @PutMapping(value = "/{id}")
    public Buku updateData(@RequestBody Buku param, @PathVariable int id){
        return service.updateData(param,id);
    }

    @DeleteMapping(value = "/{id}")
    public String deleteData(@PathVariable int id){
        if (service.deleteData(id)){
            return "Data Berhasil dihapus";
        }
        else {
            return "Data Gagal dihapus";
        }
    }

}
