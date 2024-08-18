package servlet;

import service.StudentService;

import service.UserService;
import serviceImpl.StudentServiceImpl;
import serviceImpl.UserServiceImpl;
import entity.Student;
import entity.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/registerUserServlet")
public class RegisterUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.设置编码
        request.setCharacterEncoding("utf-8");
        //2.获取参数
        Map<String, String[]> map = request.getParameterMap();
        //3.封装对象
   
        String a = request.getParameter("username");
        String b = request.getParameter("password");
      
        User user = new User(a,b);

        //4.调用Service保存
        UserService service = new UserServiceImpl();
        service.addUser(user);

        //5.跳转到userListServlet
        response.sendRedirect(request.getContextPath()+"/login.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
