<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>http://localhost:8080/프로젝트명/sampleList 요청을 하고</h3>
<h3>디스패치가 sampleController에 있는 sampleDelete 메서드로 이동해서</h3>
<h3>데이터베이스 작업에서 얻은 결과를 DTO에 저장해서 </h3>
<h3>현재 페이지를 클라이언트에게 저장된 DTO를 전달한 화면이 이 화면입니다.</h3>
<h3>model.addAttribute(samVo)==>samVo.DTO내에 선언한 변수명</h3>
<h3>컨트롤러로부터 전달받은 이름 : ${samVo.name}, 가격 :${samVo.price}</h3>


</body>
</html>