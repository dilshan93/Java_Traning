package com.dilshan.designpattern.designpattern.factoryMethod;

/**
 * @author dilshanboteju
 */
public class BasicPackage extends Package{
    @Override
    protected void createPackage() {
        decoratioms.add(new BridalDeco());
    }
}
