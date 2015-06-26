package org.trepel.jsf2springsecurity.reproducer;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String login;
    private String password;

    @ManagedProperty(value = "#{authenticationService}")
    private AuthenticationService authenticationService;

    public String login() {

        boolean success = authenticationService.login(login, password);

        if (success) {
            return "dragonList.xhtml";
        }
        else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Login or password incorrect."));
            return "login.xhtml";
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAuthenticationService(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

}
