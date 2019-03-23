package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.UserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login_do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		UserService serive = new UserService();
		User user = serive.login(username, password);
		if(user!=null) {
			req.getSession().setAttribute("user", user);
			
			if(user.isAdmin()) {
//				resp.sendRedirect( "/admin/goods_list.jsp");
//				req.getRequestDispatcher("/admin/goods_list").forward(req, resp);
				resp.sendRedirect(req.getContextPath() +"/admin/goods_list");
			}else {
				req.getRequestDispatcher("/").forward(req, resp);
			}
		}else {
			req.setAttribute("msg", "<font color='red'>username or password error!</font>");
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}
	}
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public LoginServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
