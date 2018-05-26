package com.example.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.service.GenEntity;

@RestController
public class GenEntityContrroller {
	@Autowired
	private GenEntity genEntity;
	
	@RequestMapping("/gen")
	public String genEntity() {
		genEntity.gen();
        return "创建实体完成";
    }



}
