package com.nextreme.lib;

/**
 * Created by huazhang on 10/20/15.
 */
public class Body {
    public long idNum;
    public String name;
    public Body orbits;

    public static long nextID = 0;
    public static final long Count = 0; // constant variable

    // 初始化block
    {
        idNum = nextID++;
    }

    public Body(String bodyName, Body orbitsAround) {
        //this(); // call self ctor Body()

        name = bodyName;
        orbits = orbitsAround;
    }
}
