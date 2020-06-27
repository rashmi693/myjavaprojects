
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NewUser
 */
public class MobileUser {
    public static void main(String arg[]){
    Scanner x=new Scanner(System.in);
    Mobile2G  nokia2g=new Mobile2G();
    Mobile3G nokia3g =new Mobile3G();
     Mobile4G nokia4g =new Mobile4G();
     int c;
    
     do{
     System.out.println("Enter Your Mobile 1.NOKIA2G 2.NOKIA3G 3.NOKIA4G");
     int m=x.nextInt();
    switch(m){
        case 1:System.out.println("1.Airtel2g 2.IDEA2G 3.Vodafone2g : ");
                c=x.nextInt();
                if(c==1)  nokia2g.insertSIM(new Airtel2G());
                else if(c==2)  nokia2g.insertSIM(new IDEA2G());
                else if(c==3)  nokia2g.insertSIM(new Vodafone2G());
                break;
       case 2:System.out.println("1.Airtel2g 2.IDEA2G 3.Airtel3g 4.IDEA3G 5.Vodafonnr2g 6.Vodafone 3g : ");
                c=x.nextInt();
                if(c==1)  nokia3g.insertSIM(new Airtel2G());
                else if(c==2)  nokia3g.insertSIM(new IDEA2G());
                else if(c==3)  nokia3g.insertSIM(new Airtel3G());
                else if(c==4)  nokia3g.insertSIM(new IDEA3G());
                else if(c==5)  nokia3g.insertSIM(new Vodafone2G());
                else if(c==6)  nokia3g.insertSIM(new Vodafone3G());
                break;       
       case 3:System.out.println("1.Airtel2g 2.IDEA2G 3.Airtel3g 4.IDEA3G  5.Airtel4g 6.Vodafonnr2g 7.Vodafone3g 8.Vodafone4g: ");
                c=x.nextInt();
                if(c==1)  nokia4g.insertSIM(new Airtel2G());
                else if(c==2)  nokia4g.insertSIM(new IDEA2G());
                else if(c==3)  nokia4g.insertSIM(new Airtel3G());
                else if(c==4)  nokia4g.insertSIM(new IDEA3G());
                else if(c==5)  nokia4g.insertSIM(new Airtel4G());
                else if(c==6)  nokia4g.insertSIM(new Vodafone2G());
                else if(c==7)  nokia4g.insertSIM(new Vodafone3G());
                else if(c==8)  nokia4g.insertSIM(new Vodafone4G());
                break;        
                
    }
    System.out.println("Want to continue our Service? 1.yeas 2.no.:");
    c=x.nextInt();
     }while(c!=2);
    }
    }
    

