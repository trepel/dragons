package org.trepel.jsf2springsecurity.reproducer;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service("dragonDataProvider")
public class DragonDataProviderImpl implements DragonDataProvider {

    private List<Dragon> dragons;

    @PostConstruct
    private void prepareData() {
        dragons = new ArrayList<Dragon>();

        Dragon d1 = new Dragon();
        d1.setName("Draco");
        d1.setAge(182);
        dragons.add(d1);

        Dragon d2 = new Dragon();
        d2.setName("Smaug");
        dragons.add(d2);
    }

    public List<Dragon> getDragons(boolean onlyWithAge) {
        List<Dragon> result = new ArrayList<Dragon>();

        for (Dragon dragon : dragons) {
            if (onlyWithAge) {
                if (dragon.getAge() != null) {
                    result.add(dragon);
                }
            } else {
                result.add(dragon);
            }
        }
        return result;
    }

    public void add(Dragon newDragon) {
        dragons.add(newDragon);
    }

}
