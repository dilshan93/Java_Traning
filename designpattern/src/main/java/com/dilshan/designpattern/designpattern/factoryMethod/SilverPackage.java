package com.dilshan.designpattern.designpattern.factoryMethod;

/**
 * @author dilshanboteju
 */
public class SilverPackage extends Package{
    @Override
    protected void createPackage() {
        decoratioms.add(new BridalDeco());
        decoratioms.add(new BridesMaidDeco());
    }
}
