package com.mvc.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberJoinDAO extends SqlSessionDaoSupport{

	@Override
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	//회원가입
	public int memberJoin(MemberJoinDTO memberJoinDTO){
		System.out.println("memberJoinDAO");
		return getSqlSession().selectOne("memberMapper.memberJoin", memberJoinDTO);
	}

}
