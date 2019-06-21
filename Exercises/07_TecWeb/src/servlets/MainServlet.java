package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import it.unibo.tw.db.PersistenceException;
import it.unibo.tw.db.StudentRepository;

public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
//		StudentRepository studRepo = (StudentRepository) this.getServletContext().getAttribute("studentRepository");
//		if(studRepo == null) {
//			studRepo = new StudentRepository(0); // DB TYPE: 0 -> DB2, 1 -> HSQLDB, 2 -> MySQL
//			this.getServletContext().setAttribute("studentRepository", studRepo);
//		}
	}
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//		StudentRepository studRepo = (StudentRepository) this.getServletContext().getAttribute("studentRepository");
		StudentRepository studRepo = new StudentRepository(0);
		
		String m = "Non ha funzionato";
		try {
			m = studRepo.findAll().stream()
				.map(t -> t.getFirstName()
						.concat(t.getLastName())
						.concat(t.getBirthDate().toString()))
				.reduce("" , String::concat);
			response.getWriter().println(m);
		} catch (PersistenceException e) {
			response.getWriter().println(
					"Message: " + e.getMessage() + "\n" +
					"Cause: "    + e.getCause()   + "\n"
			);
		}
		
	}
	
}

