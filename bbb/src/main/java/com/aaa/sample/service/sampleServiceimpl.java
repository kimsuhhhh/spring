package com.aaa.sample.service;

import com.aaa.bbb.sampleVO;

//Controll에게 제공한 정보
//DAO에 있는 내용복다

public class sampleServiceimpl {
	public void create(sampleVO samblevo) throws Exception;
	public sampleVO allList() throws Exception;
	//#{변수명}->인수명 동일하게
	public sampleVO whereList(String name) throws Exception;
	public sampleVO ascList() throws Exception;
	public sampleVO descList() throws Exception;
	public void update(sampleVO vo) throws Exception;
	public void delete(String name) throws Exception;
}
