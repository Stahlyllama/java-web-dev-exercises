package org.launchcode.java.studios.areaofacircle;
/* 3 things:
1. Create a getArea method
2. Take in a radius that is a Double
3. Return the area
 */

public class Circle {
    /* remember 3 things we need to do when creating a class
    1. Declare class variables at the top
    2. Create a constructor - uses same name as the Class with ()
    3. Create our methods
          */
    public Circle(){
    }

    public static Double getArea(Double radius) {  //when you take in parameters in Java you must define type
        return 3.14 * radius * radius;
    }
}

/*
we updated Area.java with circle class getArea  - Why couldn't we call just directly
to getArea from circle and we didn't have to create a new circle instance?
-->It's b/c getArea is static and when it's static we don't have to create a new instance of class
to access it - we can just access it directly.
 */