/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eli.gaji.service.controller;

import com.eli.gaji.service.VO.ResponseTemplateVO;
import com.eli.gaji.service.entity.Gaji;
import com.eli.gaji.service.service.GajiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author ASUS
 */
public class GajiController {
    @Autowired
    private GajiService gajiService;
    
    @PostMapping("/")
    public Gaji saveGaji(@RequestBody Gaji gaji){
        return gajiService.saveGaji(gaji);
    }
    
    @GetMapping("{id}")
    public ResponseTemplateVO getGaji(@PathVariable("id") Long gajiId){
     return gajiService.getGaji(GajiId);
    }
}
