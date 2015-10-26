package com.nextreme.lib;

/**
 * Created by huazhang on 10/26/15.
 */
public class More extends Base {
    protected String name() {
        return "More";
    }

    public void printName() {
        Base sref = (Base)this;

        System.out.println("this.name() = " + this.name());
        System.out.println("sref.name() = " + sref.name());
        System.out.println("super.name() = " + super.name());
    }
}
