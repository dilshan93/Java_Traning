package com.dilshan.designpattern.designpattern.factoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dilshanboteju
 */
public abstract class Package {

    protected List<Decoratiom> decoratioms = new ArrayList<>();

    protected Package(){
        createPackage();
    }
    protected abstract void createPackage();

    @Override
    public String toString() {
        return "Package{ "+" decorations= "+decoratioms+" }";
    }
}
