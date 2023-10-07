

package dris.test;

import java.util.*;
public class Test {

    public static void main(String[] args) {
       
        
        
int salary = introduction();
double tax=calculation(salary);
conclusion(tax);

}
public static int introduction(){
Scanner s = new Scanner(System.in);
int num;
System.out. println("PAYE based on "
+ "the salary.");
System. out. println();
do {
System.out.print("Please enter the salary of the PAYE tax you wish "
+ "to calculate: ");
num=s. nextInt () ;
}while (num<0);
return num;
}
public static double calculation(int num){
double tax;
if (num>=0 && num<=235000) {
tax = 0;
}
else if(num>235000 && num<=335000) {
tax = 0.1 * num;
}else if (num>335000 && num<=410000) {
tax = (0.2*num) +10000;
}else if (num>410000 && num<=1000000){
tax = (0.3*num) +25000;
        }else{
tax = ((0.3*num) +25000)+ ((num-1000000) *0.35) ;
}
return tax;
}
public static void conclusion (double num) {
System.out.println("Your PAYE tax amounts to "+num+"UGX.");
}
}