<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
//$(): body태그 안을 먼저 램에 dom tree로 읽어들여라(loading)
//$(function(){}): body를 다 읽어들인 후, 입력값으로 넣은 이름없는 함수부분을 실행해주세요.
//$('#b1'): document.getElementById(b1), id가 "b1"인 태그를 찾기
$(function() {
	//alert('dom tree를 모두 읽어들였음.!!!!')
	$('#b1').click(function() { //click안에 입력값으로 사용자 정의함수를 넣는것(anonymous function)
		location.href="domTree.jsp";
	});//;써도되고 안써도 되는데 ugly로 변환할때를 생각해서 넣는 것이 좋다.
	$('#b2').click(function() {
		//1, 2, 3 입력값 가지고 와야함
		in1Value = $('#in1').val()
		//alert(in1Value)
		//사이트를 찾아서, 조건에 따라서 사이트로 전환!
		if (in1Value == "3") {
			location.href="https://qooqoodongtan.modoo.at/"
		} else {
			location.href="https://map.naver.com"
		}
	});
	//기본 선택자(Default selector: tag, id, class)
	$('#b3').click(function() { 
		in2Tag = $('#in2') //in2Tag: nod객체(태그)
		in2Value = $('#in2').val() //in2Value: 값 담은 변수
		in3Tag = $('#in3')
		in3Value = $('#in3').val()
		result1Tag = $('#result1')
		if (in2Value == 1 && in3Value == 1) { //&&: 논리연산자
			//alert('우산을 가져가자!!')
			//result1Tag.text('우산을 가져가자!!') //.text: 태그사이에 글자를 넣고자 할때
			//기존값 덮어쓰지 말고 누적해보자(댓글 원리)
			result1Tag.append('<font color=blue>우산을 가져가자!!</font><br>')
		} else {
			//alert('알아서 하자!!')
			//result1Tag.html('<font color=red>알아서 하자!!</font>') //.html: 태그를 넣고자 할 때(글자도 됨! 그래서 .html을 더 많이 씀)
			result1Tag.append('<font color=red>알아서 하자!!</font><br>')
		}
		in2Tag.val('') // = $('#in2').val('')
			//$('#in2').val()="" -> 부적절한 위치에서 할당행위할 때 에러
			//in2Value = "" -> 값이 아니라 변수라 안 통함
		in3Tag.val('')
	})
});
</script>
</head>
<body>
<button id=b1>사이트 이동</button> <br> <hr>
먹고 싶은 음식 - 1)커피, 2)자장면, 3)초밥 :<input id='in1'>
<button id=b2>입력값 읽어서 처리</button> <br> <hr>
비가 오나요? - 1)온다. 2)안 온다. <input id='in2'> <br>
구름이 많은가요? - 1)많다. 2)아니다. <input id='in3'>
<button id=b3>입력값 읽어서 처리2</button>
<hr color=red>
<div id='result1'>결과가 나타나는 부분</div>
</body>
</html>