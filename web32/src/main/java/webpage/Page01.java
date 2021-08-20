package webpage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet; //jsp의 부모
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//JSP가 서버에서 실행될 떄는 자바 프로그램으로 자동 코드 변경되어 실행된다.
//이렇게 자동생성되는 자바 코드를 서블릿이라고 부른다.(=jsp)
//servlet: server + let(릿, 작은 프로그램)
//JSP-->Servelt으로 컨버팅 시켜주는 것: Tomcat 내의 JSP엔진(서블릿 엔진)
//JSP 내에 작성한 모든 자바 코드는 service()메서드 안으로 들어가서 자동 생성
//★★JSP 내에 선언된 변수는 모두 지역변수이다(메서드 안이라). 초기화를 반드시 해줘야한다. <% ~%>스크립트릿 내에 쓰는 것 모두 지역변수
//전역변수를 선언해서 사용하고자 하는 경우는 <%! ~~%>전역변수 선언시 사용!!
public class Page01 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		//out.println("<h3>test</h3>");
		super.service(req, resp);
	}
}
