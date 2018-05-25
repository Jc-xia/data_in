package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.service.GenEntity;

@RestController
public class GenController {
	@Autowired
	private GenEntity genEntity;
	
	@RequestMapping("/gen")
	public String gen() {
		
		genEntity.gen();
		return "实体创建成功，还需手动添加@Entity和@ID注解";
		
	}
	
	
}
