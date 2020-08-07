package pl.sda.advanced.wzorceProjektowe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ChildrenListImpl implements IChildren {
    List<String> names;

    public ChildrenListImpl() {
        this.names = new ArrayList<>();
    }

    @Override
    public void addChildren(String name) {
        names.add(name);
    }

    @Override
    public String getChildren() {
        return names.toString();
    }

    @Override
    public void sortChildren() {
        Collections.sort(names);
    }

    @Override
    public void removeDuplicate() {
        names = new ArrayList<>(new HashSet<>(names));
        sortChildren();
    }

    @Override
    public void setToUpperCaseName() {
//        for (String name : names) {
//            names.set(name, names.get().toUpperCase());
//        }
    }

    @Override
    public void setToLowerCaseName() {

    }
}
