import java.util.Scanner;
class CheckPalindrome{
    int arr_size;
    char[]arr;
    int top=-1;

    public CheckPalindrome(int arr_size){
        this.arr_size=arr_size;
        this.arr=new char[arr_size];
    }

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
    public void push(char x){
        if(isFull()==true){
            System.out.println("Stack is Overflowing");
        }
        else{
            top++;
            arr[top]=x;
        }
    }
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

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String you want to check palindrome");
       String str=sc.nextLine();

       CheckPalindrome cpld=new CheckPalindrome(str.length());
      
       for (int i = 0; i < str.length(); i++) {
            cpld.push(str.charAt(i));
       }
       int count=0;
       for (int i = 0; i < str.length(); i++) {
         if(cpld.pop()==str.charAt(i)){
            count=count+1;
         }
       }
       if(count==str.length()){
        System.out.println(str+" Is A Palindrome");
       }
       else{
        System.out.println(str+" Is Not a palindrome");
       }

    }
}