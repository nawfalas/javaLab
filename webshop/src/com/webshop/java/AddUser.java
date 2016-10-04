package com.webshop.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webshop.models.DbConnector;
import com.webshop.models.Gender;
import com.webshop.models.User;

/**
 * Servlet implementation class AddUser
 */
@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddUser() {
		super();  
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/add_user.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user = new User();
		request.setAttribute("errors", false);

		
		
		user.setFirstName(request.getParameter("first-name"));
		if (user.getFirstName().length() == 0) {
			System.out.println("empty first name error");
			request.setAttribute("errors", true);
			request.setAttribute("firstname_error", true);

		}
		user.setLastName(request.getParameter("last-name"));
		if (user.getLastName().length() == 0) {
			System.out.println("empty last name error");
			request.setAttribute("errors", true);
			request.setAttribute("lastname_error", true);

		}
		if(!user.setEmail(request.getParameter("email"))){
			System.out.println("empty email error");
			request.setAttribute("errors", true);
			request.setAttribute("email_error", true);
		}
		
		user.setAddress(request.getParameter("street-name"),
				request.getParameter("city"),
				request.getParameter("country"));
		try{
			String tmp = request.getParameter("post-code").trim().replace(" ","");
			user.setPostCode(Integer.parseInt(tmp));
		}catch(NumberFormatException e){
			System.out.println("Postcode error, number only!");
			request.setAttribute("errors",true);
			request.setAttribute("postCode_error", true);
		}
		if(user.getStreetName().length() == 0){
			System.out.println("empty street name error");
			request.setAttribute("errors", true);
			request.setAttribute("streetName_error",true);
		}
		if(user.getCity().length() ==0){
			System.out.println("empty city error");
			request.setAttribute("errors", true);
			request.setAttribute("city_error", true);
		}
		if(user.getCountry().length()==0){
			System.out.println("country error");
			request.setAttribute("errors", true);
			request.setAttribute("country_error", true);
		}
		
		
		String dob_raw = request.getParameter("dob");
		String dobArray[] = dob_raw.split("\\/");

		// check if date pattern matches
		String pattern = "^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(dob_raw);
		if (m.find()) {

			String dob_day = dobArray[0];
			String dob_month = dobArray[1];
			String dob_year = dobArray[2];


			System.out.println(user.getFirstName() + " " + user.getLastName());
			System.out.println("day: " + dob_day);
			System.out.println("month: " + dob_month);
			System.out.println("year: " + dob_year);

			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.YEAR, Integer.parseInt(dob_year));
			cal.set(Calendar.MONTH, Integer.parseInt(dob_month)-1);
			cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dob_day));

			Date dob = cal.getTime();
			user.setDob(dob);
			System.out.println(dob);
			
			DbConnector db = new DbConnector();
			ArrayList<User> us= db.getUsers();
			
			for(User u: us){
				System.out.println(u.getFirstName());
				System.out.println(u.getLastName());
				System.out.println(u.getStreetName());
				System.out.println(u.getCity());
				System.out.println(u.getPostCode());
				System.out.println("USER ID: "+u.getUserId());
				System.out.println("Password: "+ u.getPassword());
			}
			
		} else {
			System.out.println("invalid date of birth");
			request.setAttribute("errors", true);
			request.setAttribute("date_format_error", true);
		}
		String gender_raw = request.getParameter("gender");
		user.setGender(Gender.valueOf(gender_raw));
		
		if ((Boolean) request.getAttribute("errors")) {
			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/add_user.jsp");
			
			view.forward(request, response);
		}else{
			ArrayList<User> uList = new ArrayList<>();
			uList.add(user);
			response.sendRedirect("/webshop/redirect");
		}
	}
}
