**Code Documentation**

The program starts by importing the Scanner class from the java.util package, which is used to read input from the user.

import java.util.Scanner;

The main class, CheckPalindrome, implements a stack that can hold characters. It has a size, an array to hold the characters, and an index (top) to keep track of the top of the stack.

class CheckPalindrome{
    int arr_size;
    char[]arr;
    int top=-1;

    public CheckPalindrome(int arr_size){
        this.arr_size=arr_size;
        this.arr=new char[arr_size];
    }

The isFull method returns true if the stack is full and false otherwise. The isEmpty method returns true if the stack is empty and false otherwise.

    public boolean isFull(){
        if(top==(arr_size-1)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }

The push method adds an element to the top of the stack if the stack is not full. If the stack is full, the method outputs an error message.

    public void push(char x){
        if(isFull()==true){
            System.out.println("Stack is Overflowing");
        }
        else{
            top++;
            arr[top]=x;
        }
    }

The pop method removes and returns the element from the top of the stack if the stack is not empty. If the stack is empty, the method returns the character 'n'

    public char pop(){
        if(isEmpty()==true){
            return 'n';
        }
        else{
            char temp=arr[top];
            top--;
            return temp;
        }
    }

The main method is where the program starts. It uses a Scanner object to read the string to check for a palindrome from the user. The method then creates a CheckPalindrome object and pushes each character of the string onto the stack.

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String you want to check palindrome");
       String str=sc.nextLine();

       CheckPalindrome cpld=new CheckPalindrome(str.length());
      
       for (int i = 0; i < str.length(); i++) {
            cpld.push(str.charAt(i));
       }

Next, the method pops each character from the stack and compares it to the corresponding character in the original string. If all the characters match, the string is a palindrome and the program outputs a message to that effect. If any of the characters do not match, the string is not a palindrome and the program outputs a message to that effect.


**Palindrome Checker Program in Java**


This Java program helps you determine whether a given string is a palindrome or not by using the Stack data structure. The user is prompted to enter the string to check, and the program returns the result, indicating whether the string is a palindrome or not.


**Features**

User-friendly interface for inputting strings to check for palindromes
Utilizes the Stack data structure to efficiently check for palindromes
Outputs the result of whether the string is a palindrome or not

**Prerequisites**

Java Development Kit (JDK)
Java Integrated Development Environment (IDE)

**Installation and Running the Program**

1) Clone or download the repository to your local machine.
2) Open the program in your IDE.
3) Run the program.
4) Enter the string you want to check for a palindrome when prompted.
5) The program will output whether the string is a palindrome or not.

**Conclusion**

This program is a great tool for anyone looking to learn about the Stack data structure and how it can be used to check for palindromes. It is a simple, yet effective program that can be used for educational purposes or as a starting point for more advanced programs.
