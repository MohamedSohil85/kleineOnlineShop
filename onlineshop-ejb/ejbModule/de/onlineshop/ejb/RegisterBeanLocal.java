package de.onlineshop.ejb;

import javax.ejb.Local;

@Local
public interface RegisterBeanLocal {
	public abstract String pruefeAngaben(String email, String password);

}
