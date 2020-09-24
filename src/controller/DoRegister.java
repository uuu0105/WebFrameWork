package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoRegister
 */
@WebServlet("/doRegister")
public class DoRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

	
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String n_id = request.getParameter("newCustomerId");
		String n_password = request.getParameter("newCustomerPwd");
		String n_name = request.getParameter("newCustomerName");
		String n_gender = request.getParameter("newCustomerGender");
		String n_email = request.getParameter("newCustomerEmail");
		
		CustomerService service = (CustomerService) CustomerService.getInstance();
		Customer n_customer = new Customer(n_id, n_password, n_name, n_gender, n_email);
		Boolean success = service.addCustomer(n_customer);
		
		String page;
		
		if(success == false) {
			page ="/view/registerFail.jsp";
			request.setAttribute("f_id", n_id);
		}
		else {
			page ="/view/registerSuccess.jsp";
			request.setAttribute("n_customer", n_customer);
		}
			
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

}

