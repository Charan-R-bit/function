package Exceptions;

public class VoteEligiblity {   
    //this function to check if person is eligible to vote or not   
    public static void validate(int age) throws ArithmeticException
    {  
        if(age<18) {  
            //it will throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }   
    public static void main(String args[]){  
        //calling the function  
        validate(17);     
  }    
}    