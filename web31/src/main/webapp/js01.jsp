<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	//alert('tern project')
	function idCheck() {
		//1. id에 입력한 값 가져와야함
		//1-1. id가 "id"인 input 태그를 먼저 찾아야 함
		idTag = document.getElementById("id") //<input name="id" id="id" value="test">
		//1-2. 그 태그내에 있는 value값을 가져오면 됨
		idValue = idTag.value //value="test"(value값 입력하기 싫어서 넣어둔 것임)
		alert('id is>> ' + idValue)
		alert('id 길이>> ' + idValue.length)
		//2. 가져온 값의 글자수를 세야함
		//3. 5글자 이상이 아닌 경우, 메시지를 보여주어야 함
		result = ""
		if (idValue.length >= 5) {
			result = "5글자 이상입니다. 유효합니다."
		} else {
			result = "5글자 미만입니다. 재입력 해주세요."
		}
		divTag = document.getElementById("result") //<div id="result"></div>태그 인식
		divTag.innerHTML = result; //innerHTML: text도, 하위 태그도 넣을 수 있다. 여기선 div태그사이에 result값을 넣은 것.
	}
	function pwCheck() {
		pw1Tag = document.getElementById("pw1") //pw1은 id
		pw2Tag = document.getElementById("pw2")
		pw1Value = pw1Tag.value
		pw2Value = pw2Tag.value
		result = "패스워드가 일치하지 않습니다.!!<img src=img/no.jpg>"
		if (pw1Value == pw2Value) {
			result = "패스워드가 일치합니다.<img src=img/ok.jpg>"
		}
		resultTag = document.getElementById("result")
		resultTag.innerHTML = result;
		pw1Tag.value = "" 
		pw2Tag.value = "" //확인 후 값 지우기. pw1Value는 변수라 안 통한 것
	}
</script>
</head>
<body>
	<h3>자바 스크립트 테스트</h3>
	<hr>
	아이디:
	<input name="id" id="id" value="test">
	<button onclick="idCheck()" id="b1"
		style="color: blue; background: pink; width: 100px; height: 20px">글자수
		체크</button>
	<br> 패스워드 :
	<input name="pw1" id="pw1" value="test">
	<br> 패스워드2 :
	<input name="pw2" id="pw2" value="test">
	<button onclick="pwCheck()" id="b2"
		style="color: white; background: olive; width: 170px; height: 20px">패스워드
		동일 여부 체크</button>
	<br>
	<hr>
	<div id="result"
		style="color: red; background: yellow; width: 500px; height: 50px; font-size: 30px"></div>
</body>
</html>