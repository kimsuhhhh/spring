//각 테이블별로 Controller 생성해서 사용
//서블렛은 클래스가 하나의 컨트롤 ,스프링은 메서드가 하나의 컨트롤
package com.aaa.bbb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//생략가능(프린트문 대신 사용하기 위해서)
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//해당클래스 컨트롤인지를 등록
@Controller
public class sampleController {
	//해당클래스에 대한 로그 변수 선언
	private static final Logger logger = LoggerFactory.getLogger(sampleController.class);
	
	//기본 웹페이지 연결
	//주소창에서 접속할 값을 등록
	//http://localhost:3306/sampleconfig/sampleList 접속시
	//주소창에 마지막 단어가 sampleList이면 아래 메서드를 실행
	@RequestMapping("sampleList")
	public void sampleList() { //작업하고자 하는 메소드(요청받아서 해당페이지를 연결)
		logger.info("sampleList로 접속을 했습니다.");
		//sampleList.jsp 페이지로 연결
	}

	//2. 요청과 연결페이지 이름 다른 경우
	// void - > String 데이터 형으로 변경 return 페이지 이름
	@RequestMapping("update")
  //public void edit() {           --->
	public String edit() {
		logger.info("update로 접속을 했습니다.");
		return "sampleUpdate";
	}
	
	//3. 요청과 함께 값을 전달했을 때 해당페이지에 값을 재전달
	//Model Attribute - 페이지에서 사용할 변수를 지정
	@RequestMapping("sampleInsert")
	public void sampleInsert(@ModelAttribute("msg") String msg) { //주소로부터 msg변수로 값을 전달받는다.
		logger.info("msg값을 전달했습니다.");
	}
	
	//4. 데이터베이스의 DTO 결과물을 해당페이지에게 전달, 몰록, 상세페이지 구현
	//DTO로 값을 전달할 때는 인수를 반드시 Model로 선언
	@RequestMapping("sampleDelete")
	public void sampleDelete(Model model) { //주소로부터 msg변수로 값을 전달받는다.
		logger.info("DTO의 값을 전달했습니다.");
		//dto생성하고 기본값을 저장
		sampleVO samVo = new sampleVO("홍길동",5000);
		//전달페이지에 변수를 추가 -->samVO DTO를
		model.addAttribute(samVo);
	}
}