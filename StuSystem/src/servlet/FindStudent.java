package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.PageBean;
import entity.Student;
import service.StudentService;
import serviceImpl.StudentServiceImpl;

/**
 * Servlet implementation class FindStudent
 */
@WebServlet("/FindStudent")
public class FindStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1.调用service查询
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		String a1 = request.getParameter("name");
		String a2 = request.getParameter("address");
		String a3 = request.getParameter("email");
        StudentService service = new StudentServiceImpl();

        PageBean<Student> pb = service.findStudent(a1,a2,a3);
       
        System.out.println(pb);

        //2.将PageBean存入request
        request.setAttribute("pb",pb);

        //3.转发到list.jsp
        request.getRequestDispatcher("/list.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
