package com.dilshan.designpattern.designpattern.factoryMethod;

/**
 * @author dilshanboteju
 */
public class PlatinumPackage extends Package{
    @Override
    protected void createPackage() {
        decoratioms.add(new BridesMaidDeco());
        decoratioms.add(new BridalDeco());
        decoratioms.add(new ParentDeco());
        decoratioms.add(new FlowerGirlDeco());
    }
}
