package org.trepel.jsf2springsecurity.reproducer;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "dragonListBean")
@SessionScoped
public class DragonList {

    @ManagedProperty("#{dragonDataProvider}")
    private DragonDataProvider dragonDataProvider;

    private List<Dragon> dragonList;

    public String getDragons() {
        dragonList = dragonDataProvider.getDragons(false);
        return "/dragonList.xhtml";
    }

    // ajax call from filtering button
    public void showAllDragons() {
        dragonList = dragonDataProvider.getDragons(false);
    }

    // ajax call from filtering button
    public void showDragonsWithAge() {
        dragonList = dragonDataProvider.getDragons(true);
    }

    public void setDragonList(List<Dragon> dragonList) {
        this.dragonList = dragonList;
    }

    public List<Dragon> getDragonList() {
        return dragonList;
    }

    public void setDragonDataProvider(DragonDataProvider dragonDataProvider) {
        this.dragonDataProvider = dragonDataProvider;
    }

    public String addNewDragon() {
        Dragon dragon = new Dragon();
        dragon.setName("Added Dragon");
        dragon.setAge(100);
        this.dragonDataProvider.add(dragon);

        return "/dragonList.xhtml";
    }

}
