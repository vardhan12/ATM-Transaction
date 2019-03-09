
package atm;

import java.util.*;
public class Atm {
    
Scanner s=new Scanner(System.in);
int c,f=1,pin=0000,count=0;
float ab=500,mb=500,am;
void balanceEnquiry(){
    System.out.println("Available Balance:"+ab);
}
void withdraw(){
    System.out.println("Enter the amount");
    am=s.nextFloat();
    if(ab-am>mb)
    {
     ab=ab-am;
        System.out.println("Collect your amount");
    }
    else
    {
        System.out.println("Balance insufficient");
    }
}
void pinchange(){
    int cpin;
    System.out.println("Enter your current pin");
    cpin=s.nextInt();
    if(cpin==pin){
        System.out.println("new pin");
        pin=s.nextInt();
}
else
    {
        System.out.println("Enter your correct pin");
        count=count+1;
        if(count>2){
            try{
                throw new pinexception();
            }catch(pinexception z){
                System.out.println("exception handled");
            }
        }
    }}
void block(){}
void cancelTransaction(){}
       
void choice(){
    System.out.println("1.Balance Enquiry 2.Withdraw 3.Pinchange 4.Block 5.Cancel");
    System.out.println("enter the choice");
    c=s.nextInt();
    switch(c){
    case 1:balanceEnquiry();
    break;
    case 2:withdraw();break;
    case 3:pinchange();
    break;
    case 4:block();break;
    case 5:cancelTransaction();
    break;
    }
    
}
}
class pinexception extends Exception{
void pinexception(){
    System.out.println("your atm card has been temp blocked due to wrong entry" );
}
}
class Transaction extends Atm{
  


    
public static void main(String[] args) {
    
        
    }
    
}
