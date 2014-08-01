/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author chathura priyankara
 */
public class GenericMethodDemo {

    //This will print elements of any type of an array
    public static <E> void print(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+"\n");
        }
    }
}
