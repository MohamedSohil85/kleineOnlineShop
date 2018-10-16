package de.onlineshop.ejb;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;


@Stateless
@Local(de.onlineshop.ejb.RegisterBeanLocal.class)
@Remote(de.onlineshop.ejb.RegisterBeanRemote.class)
public class RegisterBean implements RegisterBeanRemote, RegisterBeanLocal {

	public RegisterBean() {
	}

	@Override
	public String pruefeAngaben(String email, String password) {
		return email + ":" + password + " - ok - ";
	}
}
