package org.trepel.jsf2springsecurity.reproducer;

import javax.annotation.security.RolesAllowed;

public interface AuthenticationService {

    boolean login(String username, String password);

    @RolesAllowed({ "ROLE_ADMIN", "ROLE_REGISTERED" })
    void logout();

}
