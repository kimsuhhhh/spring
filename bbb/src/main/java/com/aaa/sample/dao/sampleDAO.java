package com.aaa.sample.dao;

import com.aaa.bbb.sampleVO; //DTO연결

//DAO에서 작업할 메서드 선언
//데이터베이스에 접근할 작업영역(메소드)

public interface sampleDAO {
	//삽입,수정,삭제,조회에 관련된 메서드(Mapper에 만든 SQL 개수만큼 메서드 생성)
	//이름도 Mapper의 id와 동일하게 작업
//	id="allList" resultType = "sampleVO">
//	id="whereList" resultType = "sampleVO"> 
//	id ="ascList" resultType="sampleVO"> 
//	id ="descList" resultType="sampleVO"> 
//	id="update">
//	id="delete">
//	public resultType참고 id이름(질의어 내용을 참고)
	public void create(sampleVO samblevo) throws Exception;
	public sampleVO allList() throws Exception;
	//#{변수명}->인수명 동일하게
	public sampleVO whereList(String name) throws Exception;
	public sampleVO ascList() throws Exception;
	public sampleVO descList() throws Exception;
	public void update(sampleVO vo) throws Exception;
	public void delete(String name) throws Exception;
	//인터페이스는 메서드 이름을 공통적으로 사용하고 내용은 상황에따라 재수정해서 사용
	//인터페이스의 메서드를 복사를해서 클래스에다 붙여넣기
}
