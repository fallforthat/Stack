/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import static java.lang.System.exit;

/**
 *
 * @author Hieu
 */
public class StackUsingLinkedlist {

    // Node dạng linked list 
    private class Node {

        int info; //info 
        Node next; //biến con trỏ 
    }

    Node top;

    StackUsingLinkedlist() {
        this.top = null;
    }

    //thêm vào 1 phần tử
    public void push(int x) //chèn vào đầu
    {

        //tạo 1 nút mới, gán data muốn thêm vào nút đó, gán đỉnh stack vào nút vừa tạo.
        Node temp = new Node();

//        if (temp == null) {
//            System.out.print("\nOverflow");
//            return;
//        } 
        temp.info = x;  //gán data 

        temp.next = top;    //temp trỏ đến top

        top = temp;
    }


    //kiểm tra xem có rỗng hay k
    public boolean isEmpty() {
        return top == null;
    }

    //trả về phần tử đầu trong stack
    public int peek() {
        if (!isEmpty()) {
            return top.info;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    //lấy phần tử đầu ra khỏi stack
    public void pop() {
        //kiểm tra stack còn empty k 
        if (top == null) {
            System.out.print("\nUnderflow");
            return;
        }

        // cập nhập biên con trỏ của node top đến node tiếp theo
        top = (top).next;
    }

    public void display() {
        if (top == null) {
            System.out.printf("\nStack Underflow");
            exit(1);
        } else {
            Node temp = top;
            while (temp != null) {

                System.out.printf("%5d", temp.info);

                temp = temp.next;
            }
        }
    }
    
}
