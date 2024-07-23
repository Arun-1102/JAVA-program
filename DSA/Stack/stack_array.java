package DSA.Stack;

import java.util.*;
class stack_array{
    int s [] = new int[9];
    int top;
    
    stack_array(){
        top = -1;
    }
    void push(int val){
        if(top ==9){
            System.out.println("full");
        }
        s[++top] = val;
    }
    int pop(){
        if(top>=0){
            return s[top--];
        }
        return -1;
    }
    void peak(){
        System.out.println("\nPeak = "+s[top]);
    }
    void display(){
        for(int i =0;i<top+1;i++){
            System.out.print(s[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){  
        stack_array a1 = new stack_array();
        
        a1.push(10);
        a1.push(20);
        a1.push(30);
        a1.push(40);
        a1.push(50);
        a1.push(60);
        a1.push(70);
        a1.push(80);
        a1.push(90);
        a1.display();
        
        System.out.println();
        a1.pop();
        a1.display();
        a1.pop();
        a1.display();
        
        a1.peak();
        
    }
}