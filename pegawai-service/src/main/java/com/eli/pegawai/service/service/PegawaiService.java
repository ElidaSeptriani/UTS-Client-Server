/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eli.pegawai.service.service;

import com.eli.pegawai.service.entity.Pegawai;
import com.eli.pegawai.service.repository.PegawaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class PegawaiService {
     @Autowired
    private PegawaiRepository pegawaiRepository;
    
    public Pegawai savePegawai(Pegawai pegawai) {
        return pegawaiRepository.save(pegawai);
    }
    
    public Pegawai findPegawaiById(Long pegawaiNIP){
        return pegawaiRepository.findByPegawaiNIP(pegawaiNIP);
    }
}
