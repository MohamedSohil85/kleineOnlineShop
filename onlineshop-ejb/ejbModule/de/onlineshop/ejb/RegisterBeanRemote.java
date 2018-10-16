package de.onlineshop.ejb;

import javax.ejb.Remote;

@Remote
public interface RegisterBeanRemote {
	public abstract String pruefeAngaben(String email, String password);

}
