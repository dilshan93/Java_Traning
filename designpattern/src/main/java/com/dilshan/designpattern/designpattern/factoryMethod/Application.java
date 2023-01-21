package com.dilshan.designpattern.designpattern.factoryMethod;

import java.text.NumberFormat;

/**
 * @author dilshanboteju
 */
public class Application {

    public static void main(String[] args) {

        Package aPackage = PackageFactory.createPAckage(PackageCode.SILVER);
        System.out.println(aPackage);

        Package aPackage1 = PackageFactory.createPAckage(PackageCode.PLATINUM);
        System.out.println(aPackage1);
    }

}
