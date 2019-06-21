package it.unibo.tw.es2.servlets;

import it.unibo.tw.es2.beans.DescrizioneMacchina;

import java.io.IOException;
import java.util.Hashtable;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jabsorb.JSONSerializer;
import org.jabsorb.serializer.MarshallException;

import db.MacchinaRepository;
import db.PersistenceException;

public class CercaMacchine extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		Hashtable<String,DescrizioneMacchina> db = new Hashtable<String,DescrizioneMacchina>();
		MacchinaRepository macchinaRepository = (MacchinaRepository) this.getServletContext().getAttribute("macchinaRepository");
		if(macchinaRepository == null) {
			macchinaRepository = new MacchinaRepository(0); // DB TYPE: 0 -> DB2, 1 -> HSQLDB, 2 -> MySQL
			this.getServletContext().setAttribute("macchinaRepository", macchinaRepository);
		}
		
		JSONSerializer serializer = new JSONSerializer();
		try {
			serializer.registerDefaultSerializers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.getServletContext().setAttribute("serializer", serializer);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String targa = req.getParameter("targa");
		if( targa != null ) {
			MacchinaRepository macchinaRepository = (MacchinaRepository) this.getServletContext().getAttribute("macchinaRepository");
			DescrizioneMacchina macchina = null;
			try {
				macchina = macchinaRepository.get(targa);
			} catch (PersistenceException e1) {
				e1.printStackTrace();
			}
			if( macchina == null ) {
				macchina = new DescrizioneMacchina("errore","errore");
			}
			JSONSerializer serializer = (JSONSerializer)this.
			getServletContext().getAttribute("serializer");
			String output = null;
			try {
				output = serializer.toJSON(macchina);
			} catch (MarshallException e) {
				e.printStackTrace();
			}
			resp.getOutputStream().print(output);	
		}
	}
}
