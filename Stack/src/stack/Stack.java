/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Hieu
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StackUsingLinkedlist sull = new StackUsingLinkedlist();

        sull.push(11);
        sull.push(22);
        sull.push(33);
        sull.push(44);

        sull.display();

        System.out.printf("\nTop element is %d\n", sull.peek());

        sull.pop();
        sull.pop();

        sull.display();

        System.out.printf("\nTop element is %d\n", sull.peek());
    }

}
