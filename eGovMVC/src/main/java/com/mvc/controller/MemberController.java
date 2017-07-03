package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.dao.MemberJoinDTO;
import com.mvc.service.Service;
import com.mvc.service.memberService;

@Controller
public class MemberController {

	@Autowired
	Service service;
	
	@Autowired
	memberService memberService;

	//회원가입 폼 띄우기
	@RequestMapping(value = "/memberJoinForm")
	public String memberJoinForm(Model model) {
		System.out.println("MemberController 회원가입 폼");
		return "memberJoinForm";
	}
	
	//회원가입
	@RequestMapping(value="/memberJoin")
	public String memberJoin(MemberJoinDTO memberJoinDTO){
		System.out.println("회원가입 정보");
		memberService.memberJoin(memberJoinDTO);
		return "memberJoinSuccess";
	}
	
}
