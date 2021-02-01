package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {


    @Override
    public int compare(Cone o1, Cone o2) {
         if(o1.getCost() > o2.getCost())
        return (double)o1;
    } else {
        return (double)o2;
    }


}