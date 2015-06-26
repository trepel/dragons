package org.trepel.jsf2springsecurity.reproducer;

import java.util.List;

import javax.annotation.security.RolesAllowed;

public interface DragonDataProvider {

    public abstract List<Dragon> getDragons(boolean onlyWithAge);

    @RolesAllowed({"ROLE_ADMIN"})
    public abstract void add(Dragon newDragon);

}
