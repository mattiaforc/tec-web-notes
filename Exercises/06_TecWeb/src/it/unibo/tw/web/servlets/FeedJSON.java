package it.unibo.tw.web.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import org.jabsorb.JSONSerializer;
import org.jabsorb.serializer.MarshallException;

import it.unibo.tw.web.beans.Feed;
import it.unibo.tw.web.beans.FeedDb;

public class FeedJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
	JSONSerializer jser;
	
	@Override
	public void init() throws ServletException {
		FeedDb feedDb = (FeedDb)this.getServletContext().getAttribute("feedDb");
		if(feedDb == null) {
			feedDb = new FeedDb();
			this.getServletContext().setAttribute("feedDb", feedDb);
		}
		
		jser = new JSONSerializer();
		try { 
	    	jser.registerDefaultSerializers(); 
	    } 
	    catch (Exception e) {
	    	System.out.println(e.getMessage());
	    	e.printStackTrace();
	    }
	}
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String category = request.getParameter("category");
		FeedDb feedDb = (FeedDb) this.getServletContext().getAttribute("feedDb");
		
		List<String> categories = feedDb.getCategories(category);	
		List<Feed> someFeeds = new ArrayList<Feed>();
		for(String c : categories) {
			someFeeds.addAll(feedDb.find(c));
		}
		
		try {
			response.getWriter().println(jser.toJSON(someFeeds.toArray()));
		} catch (MarshallException e) {
			e.printStackTrace();
		}
	}
	
}
