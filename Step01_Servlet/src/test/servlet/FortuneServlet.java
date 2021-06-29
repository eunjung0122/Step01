package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sub/fortune")
public class FortuneServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//한글 깨지지 않게
		resp.setCharacterEncoding("utf-8");
		//클라이언트에게 내가 뭘 응답할지 미리 알리는 역할
		resp.setContentType("text/html;charset=utf-8");
		
		//클라이언트에게 문자열을 출력할 수 있는 객체의 참조값 얻어오기
		PrintWriter pw=resp.getWriter();
		pw.println("<!doctype html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8'/>");
		pw.println("<title>fortune</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>오늘의 운세</h1>");
		String[] fortunes= {
				"동쪽으로 가면 귀인을 만나요",
				"복권을 사면 당첨될 거에요",
				"코인을 사면 폭락할지도 몰라요",
				"열심히 공부하면 좋은 결과가 있어요",
				"오늘의 행운의 숫자는 4"
		};
		Random ran=new Random();
		int num=ran.nextInt(5);
		
		pw.println("<p>"+fortunes[num]+"</p>");
		pw.println("<a href=\"/Step01_Servlet/index.html\">인덱스로 가기</a>");
		pw.println("<a href='../index.html'>인덱스로 가기2</a>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}
	
}
