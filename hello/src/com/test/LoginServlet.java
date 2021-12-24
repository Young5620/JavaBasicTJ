package com.test; //패키지선언

import java.io.IOException; //필요한클래스들을 자동으로 가져온다.
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet") //호출되는 이름
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super(); //생성자 부모클래스의 생성자를 호출하여 초기화
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //get 방식으로 (주소와 함께 넘겨받는 데이터)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String uid = request.getParameter("id");
		String ups = request.getParameter("ps");
		
		String res = "<html><h3>user ID "+ uid + "</h3>";
			   res +="<h3>user Password" + ups + "</h3>";
			   res += "</html>";
		
		response.getWriter().print(res);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//post 방식으로 (body에 포함하여 넘겨받는 데이터)
	//post 방식으로 넘겨받은 데이터도 결국 내부적으로는 doGet()매서드를 다시 호출하여 처리한다.
	//따라서 doGet() 매서드만 구현하면 함께 처리할 수 있다.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
