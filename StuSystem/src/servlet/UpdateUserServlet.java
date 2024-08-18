package servlet;

import service.StudentService;
import serviceImpl.StudentServiceImpl;
import entity.Student;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/updateUserServlet")
public class UpdateUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.设置编码
        request.setCharacterEncoding("utf-8");
        //2.获取map
        Map<String, String[]> map = request.getParameterMap();
        //3.封装对象
        Student student = new Student(Integer.parseInt(request.getParameter("id1")),request.getParameter("name"),request.getParameter("gender"),Integer.parseInt(request.getParameter("age")),request.getParameter("address"),request.getParameter("qq"),request.getParameter("email"));

        //4.调用Service修改
        StudentService service = new StudentServiceImpl();
        service.updateUser(student);

        //5.跳转到查询所有Servlet
        response.sendRedirect(request.getContextPath()+"/findUserByPageServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
