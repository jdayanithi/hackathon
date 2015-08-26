/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mertics.tavis;

public class ClassA {

    private String myString;

    public ClassA() {

    }

    public ClassA(String myString) {
        this.myString = myString;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public String appendString(String newString) {
        newString= newString+"Hi";
        this.myString = this.myString.concat(newString);
        System.out.println("hi1");
        
        return this.myString;
    }
}
