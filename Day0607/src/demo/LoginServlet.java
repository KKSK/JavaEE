package demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 14-6-8.
 */
public class LoginServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //String [] strings = request.getParameterValues("");
//    DB
        if (username.equalsIgnoreCase("zhangsan") && password.equals("123")) {
            req.getSession().setAttribute("username", "zhangsan");
//       原JSP中  session.setAttribute("username", "zhangsan");   //  doPost方法五session故通过req.getSession()方法获得

//页面跳转1 重定向REDIRECT: a.地址栏发生改变 b.不能保存request范围内的属性
            resp.sendRedirect("home.jsp");
//        request.getRequestDispatcher("home.jsp").forward(request, response);k
        } else {
            req.setAttribute("message", "用户名或密码错误");
//页面跳转2 转发FORWARD:    a.地址栏不变 b.可以保存request范围内的属性
            req.getRequestDispatcher("index.jsp").forward(req, resp);
//        response.sendRedirect("index.jsp");
        }
    }
}
