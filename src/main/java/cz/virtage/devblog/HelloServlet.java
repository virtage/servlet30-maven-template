package cz.virtage.devblog;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {

	//--------------------------------------------------------------------------
	// Class fields - public
	//--------------------------------------------------------------------------

	//--------------------------------------------------------------------------
	// Class fields - non-public
	//--------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;
	private static final Logger log = LoggerFactory.getLogger(HelloServlet.class);

	//--------------------------------------------------------------------------
	// Instance fields - public
	//--------------------------------------------------------------------------

	//--------------------------------------------------------------------------
	// Instance fields - non-public
	//--------------------------------------------------------------------------

	//--------------------------------------------------------------------------
	// Instance fields - bean properties
	//--------------------------------------------------------------------------

	//--------------------------------------------------------------------------
	// Constructors, static initializers, factories
	//--------------------------------------------------------------------------

	//--------------------------------------------------------------------------
	// Public API - class (static)
	//--------------------------------------------------------------------------

	//--------------------------------------------------------------------------
	// Public API - instance
	//--------------------------------------------------------------------------

	//--------------------------------------------------------------------------
	// Overrides and implementations
	//--------------------------------------------------------------------------

	@Override
	protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
			throws ServletException, IOException {

		log.debug("doGet() << entering doGet()");

		resp.getWriter().println("Hello from Servlet 3.0 Maven template brought "
				+ "to you by http://virtage.cz");
	}

	@Override
	protected void doPost(final HttpServletRequest req, final HttpServletResponse resp)
			throws ServletException, IOException {

		log.debug("doPost() <<");

		doGet(req, resp);

	}

	//--------------------------------------------------------------------------
	// Consider toString(), equals(), hashCode()
	//--------------------------------------------------------------------------

	//--------------------------------------------------------------------------
	// Getters/setters of properties
	//--------------------------------------------------------------------------

	//--------------------------------------------------------------------------
	// Helper methods (mostly private)
	//--------------------------------------------------------------------------

}