package com.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mvc.dao.MemberJoinDAO;
import com.mvc.dao.MemberJoinDTO;

@Component
public class memberService {
	
	@Autowired
	MemberJoinDAO memberJoinDAO;
	
	public void memberJoin(MemberJoinDTO memberJoinDTO){
		System.out.println("memberService");
		memberJoinDAO.memberJoin(memberJoinDTO);
	}
	
}
