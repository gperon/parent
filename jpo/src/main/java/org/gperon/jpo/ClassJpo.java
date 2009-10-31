/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gperon.jpo;

/**
 *
 * @author GiorgioP
 */
public class ClassJpo {

    protected String name = "Cammello";

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("Hello Giorgio");
    }

    public void a(String[] args) {
        System.out.println("a");
    }

    public void b(String[] args) {
        System.out.println("b");
    }

    public void c(String[] args) {
        System.out.println("c");
    }
}
