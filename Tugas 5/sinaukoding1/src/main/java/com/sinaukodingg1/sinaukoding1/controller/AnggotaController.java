package com.sinaukodingg1.sinaukoding1.controller;

import com.sinaukodingg1.sinaukoding1.entity.Anggota;
import com.sinaukodingg1.sinaukoding1.service.AnggotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/anggota")
public class AnggotaController {
    @Autowired
    AnggotaService service;

    @PostMapping
    public Anggota saveAnggota(@RequestBody Anggota param){
        return service.save(param);
    }

    @GetMapping
    public List<Anggota> findAll(){
        return service.lihatSemuaData();
    }

    @GetMapping(value = "/find-by-nama")
    public List<Anggota> findByNama(@RequestParam(value = "nama") String nama){
        return service.findByNama(nama);
    }

    @GetMapping(value =" /{id}")
    public Anggota findById(@PathVariable int id){
        return service.findById(id);
    }

    @PutMapping(value = "/{id}")
    public Anggota updateData(@RequestBody Anggota param, @PathVariable int id){
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
