package com.aaa.sample.dao;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.SqlSession;
import com.aaa.bbb.sampleVO;

//DAO는 repository 어노테이션 선언
@Repository
public class sampleDAOimpl implements sampleDAO{
	//root-context.xml의 반을 사용할 때는 inject 어노테이션으로 선언
	@Inject //bean에있는걸 떙겨오기
	private SqlSession sqlSession; //아이디 데이터베이스 주소 비밀번호
	
	//사용할 mapper 지정
	private static final String NAMESPACE = "com.aaa.bbb.mapper.BoardMapper"
			
			
	//인터퓨ㅔ이스의 내용을 수정
	@Override		
	public void create(sampleVO samblevo) throws Exception;{
		//mybatis의 질의어를 이용해서 작업지시
		//sqlSession(데이터베이스) + NAMESPACE(질의어)
		//sqlSession.질의어(batis+".질의어id",전달값)
		//member_Mapper에 create 질의어를 sqlSession데이터베이스에 insert(삽입)작업으로 진행
		sqlSession.insert(NAMESPACE+".create", samblevo);
		
	}
	@Override
	public sampleVO allList() throws Exception;{
		
	}
	@Override
	public sampleVO whereList(String name) throws Exception;{
		return sqlSession.selectOne(NAMESPACE+".whereList", name);
	}
	@Override
	public sampleVO ascList() throws Exception;{
		return sqlSession.selectList(NAMESPACE+".ascList");
	}
	@Override
	public sampleVO descList() throws Exception;{
		return sqlSession.selectOne(NAMESPACE+".descList");
	}
	@Override
	public void update(sampleVO vo) throws Exception;{
		sqlSession.update(NAMESPACE+".update", vo);
	}
	@Override
	public void delete(String name) throws Exception;{
		sqlSession.delete(NAMESPACE+".delete", name);
	}
}
