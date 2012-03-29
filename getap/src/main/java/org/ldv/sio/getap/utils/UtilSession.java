package org.ldv.sio.getap.utils;

import org.ldv.sio.getap.app.User;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

/**
 * Un Helper de gestion de l'utilisateur dans sa session HTTP
 * 
 * @author sio-slam melun
 * 
 */

public class UtilSession {
	static public void setUserInSession(User user) {
		RequestContextHolder.currentRequestAttributes().setAttribute("user",
				user, RequestAttributes.SCOPE_SESSION);
	}

	static public User getUserInSession() {
		return (User) RequestContextHolder.currentRequestAttributes()
				.getAttribute("user", RequestAttributes.SCOPE_SESSION);
	}

	static public void setAnneeScolaireInSession(String anneeScolaire) {
		RequestContextHolder.currentRequestAttributes()
				.setAttribute("anneeScolaire", anneeScolaire,
						RequestAttributes.SCOPE_SESSION);
	}

	static public String getAnneeScolaireInSession() {
		return (String) RequestContextHolder.currentRequestAttributes()
				.getAttribute("anneeScolaire", RequestAttributes.SCOPE_SESSION);
	}

}