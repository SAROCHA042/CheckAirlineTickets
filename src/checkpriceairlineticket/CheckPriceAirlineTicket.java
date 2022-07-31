/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpriceairlineticket;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class CheckPriceAirlineTicket {
    public static Scanner sc = new Scanner(System.in);  
 
    public static int[][] bizBN = new int[31][2];
    public static int[][] bizNB = new int[31][2];
    public static int[][] ecoBN = new int[31][2];
    public static int[][] ecoNB = new int[31][2];
    public static int departing = 0;
    public static int arriving = 0;
    public static int classToFly = 0;
    public static int start = 0;
    public static int last = 0;
    public static int passengers = 0;
    public static int date = 0;
    
    public static void main(String[] args) {
        Assign();
        System.out.println ("                     Welcome to KLM Royal Dutch Airlines                    ");
        ChooseTrip(Trip());
        
    }
    
    public static int Trip() {
        int trip = 0 ;
        
        do {
            System.out.println ("----------------------------------------------------------------------------");
            System.out.println ("                               Plan your trip                                ");
            System.out.println ("----------------------------------------------------------------------------");
            System.out.println ("1. Round trip");
            System.out.println ("2. One-way trip");
            System.out.println ("----------------------------------------------------------------------------");
            System.out.print   ("Choose your trip: ");
                trip = sc.nextInt();   
        } while (trip < 1 || trip > 2);
        return trip;        
    }
    
     public static void ChooseTrip(int Trip) {            
        if (Trip == 1) {
            System.out.println ("----------------------------------------------------------------------------");
            System.out.println ("                                Round Trip                                  ");
            System.out.println ("----------------------------------------------------------------------------");
            RoundTrip();
            Detail_RT();
            
        }
        if (Trip == 2) {
            System.out.println ("----------------------------------------------------------------------------");
            System.out.println ("                               One-way trip                                 ");
            System.out.println ("----------------------------------------------------------------------------");
            OneWayTrip();
            Detail_OW();
        }    
    }
     
    public static int RoundTrip() {
        while (classToFly < 1 || classToFly > 2) {
            System.out.println ("Class to fly");
            System.out.println ("1. Economy Class");
            System.out.println ("2. Business Class");
            System.out.println ("----------------------------------------------------------------------------"); 
            System.out.print   ("Choose your class to fly: ");
                classToFly = sc.nextInt();   
            System.out.println ("----------------------------------------------------------------------------");     
        }
        while (departing < 1 || departing > 2) {
            System.out.println ("Departing from");
            System.out.println ("1. BKK - Bangkok, Suvarnabhumi Intl.");
            System.out.println ("2. AMS - Amsterdam, Schiphol Airport");
            System.out.println ("----------------------------------------------------------------------------");
            System.out.print   ("Choose your departing from: ");
                departing = sc.nextInt();
            System.out.println ("----------------------------------------------------------------------------");           
        }
        while ((arriving < 1 || arriving > 2) || arriving == departing){
            System.out.println ("Arriving at");
            System.out.println ("1. BKK - Bangkok, Suvarnabhumi Intl.");
            System.out.println ("2. AMS - Amsterdam, Schiphol Airport");
            System.out.println ("----------------------------------------------------------------------------");
            System.out.print   ("Choose your arriving from: ");
                arriving = sc.nextInt();
            System.out.println ("----------------------------------------------------------------------------");   
        }
        while (start < 1 || start > 31) {
            System.out.print   ("Start travel date: ");
                start = sc.nextInt();
        }    
        while (last < 1 || last > 31 || start > last) {
            System.out.print   ("Last travel date: ");
                last = sc.nextInt();       
        }
        System.out.println ("----------------------------------------------------------------------------"); 
        while (passengers < 1 || passengers > 9) {  
            System.out.print    ("Passengers: ");
                passengers = sc.nextInt();
            System.out.println ("----------------------------------------------------------------------------");     
        }
        return 0;
    }
    
    public static int OneWayTrip() {
        while (classToFly < 1 || classToFly > 2) {
            System.out.println ("Class to fly");
            System.out.println ("1. Economy Class");
            System.out.println ("2. Business Class");
            System.out.println ("----------------------------------------------------------------------------"); 
            System.out.print   ("Choose your class to fly: ");
                classToFly = sc.nextInt();
            System.out.println ("----------------------------------------------------------------------------");      
        }
        while (departing < 1 || departing > 2) {
                System.out.println ("Departing from");
                System.out.println ("1. BKK - Bangkok, Suvarnabhumi Intl.");
                System.out.println ("2. AMS - Amsterdam, Schiphol Airport");
                System.out.println ("----------------------------------------------------------------------------");
                System.out.print   ("Choose your departing from: ");
                    departing = sc.nextInt();
                System.out.println ("----------------------------------------------------------------------------");           
        }
        while ((arriving < 1 || arriving > 2) || arriving == departing){
                System.out.println ("Arriving at");
                System.out.println ("1. BKK - Bangkok, Suvarnabhumi Intl.");
                System.out.println ("2. AMS - Amsterdam, Schiphol Airport");
                System.out.println ("----------------------------------------------------------------------------");
                System.out.print   ("Choose your arriving from: ");
                    arriving = sc.nextInt();
                System.out.println ("----------------------------------------------------------------------------");   
        }
        while (date < 1 || date > 31) {
            System.out.print   ("Travel date: ");
                date = sc.nextInt();
            System.out.println ("----------------------------------------------------------------------------");    
        }    
        while (passengers < 1 || passengers > 9) {
            System.out.print    ("Passengers: ");
                passengers = sc.nextInt();
            System.out.println ("----------------------------------------------------------------------------");     
        }        
        return 0;
    }
    
    public static void BusinessKLM_BN(){      
        bizBN[0][0] = 1;
        bizBN[0][1] = 85720;
         
        bizBN[1][0] = 2;
        bizBN[1][1] = 44600;
        
        bizBN[2][0]  = 3;
        bizBN[2][1]  = 96010;
        
        bizBN[3][0]  = 4;
        bizBN[3][1]  = 86365;
         
        bizBN[4][0]  = 5;
        bizBN[4][1]  = 85720;
        
        bizBN[5][0]  = 6;
        bizBN[5][1]  = 44600;
        
        bizBN[6][0]  = 7;
        bizBN[6][1]  = 86365;
        
        bizBN[7][0]  = 8;
        bizBN[7][1]  = 44645;
               
        bizBN[8][0]  = 9;
        bizBN[8][1]  = 86320;
                
        bizBN[9][0]  = 10;
        bizBN[9][1]  = 88400;
              
        bizBN[10][0]  = 11;
        bizBN[10][1]  = 86366;
              
        bizBN[11][0]  = 12;
        bizBN[11][1]  = 96235;   
        
        bizBN[12][0]  = 13;
        bizBN[12][1]  = 86320;
        
        bizBN[13][0]  = 14;
        bizBN[13][1]  = 112645;
        
        bizBN[14][0]  = 15;
        bizBN[14][1]  = 112450;
        
        bizBN[15][0]  = 16;
        bizBN[15][1]  = 113050;
               
        bizBN[16][0]  = 17;
        bizBN[16][1]  = 112450;
                
        bizBN[17][0]  = 18;
        bizBN[17][1]  = 148095;
               
        bizBN[18][0]  = 19;
        bizBN[18][1]  = 96235;
                
        bizBN[19][0]  = 20;
        bizBN[19][1]  = 113050;
          
        bizBN[20][0]  = 21;
        bizBN[20][1]  = 77320;
                
        bizBN[21][0]  = 22;
        bizBN[21][1]  = 96235;
               
        bizBN[22][0]  = 23;
        bizBN[22][1]  = 77320;
          
        bizBN[23][0]  = 24;
        bizBN[23][1]  = 44225;
            
        bizBN[24][0]  = 25;
        bizBN[24][1]  = 112450;
             
        bizBN[25][0]  = 26;
        bizBN[25][1]  = 44225;
               
        bizBN[26][0]  = 27;
        bizBN[26][1]  = 77920;
              
        bizBN[27][0]  = 28;
        bizBN[27][1]  = 77320;
              
        bizBN[28][0]  = 29;
        bizBN[28][1]  = 112450;
               
        bizBN[29][0]  = 30;
        bizBN[29][1]  = 77920;
                
        bizBN[30][0]  = 31;
        bizBN[30][1]  = 112450;  
    }
    
    public static void EconomyKLM_BN(){      
        ecoBN[0][0] = 1;
        ecoBN[0][1] = 13225;
        
        ecoBN[1][0] = 2;
        ecoBN[1][1] = 13645;
           
        ecoBN[2][0]  = 3;
        ecoBN[2][1]  = 13225;
               
        ecoBN[3][0]  = 4;
        ecoBN[3][1]  = 13000;
               
        ecoBN[4][0]  = 5;
        ecoBN[4][1]  = 13225;
               
        ecoBN[5][0]  = 6;
        ecoBN[5][1]  = 13600;
                
        ecoBN[6][0]  = 7;
        ecoBN[6][1]  = 13645;
                
        ecoBN[7][0]  = 8;
        ecoBN[7][1]  = 28400;
               
        ecoBN[8][0]  = 9;
        ecoBN[8][1]  = 13645;
              
        ecoBN[9][0]  = 10;
        ecoBN[9][1]  = 28400;
            
        ecoBN[10][0]  = 11;
        ecoBN[10][1]  = 13645;
             
        ecoBN[11][0]  = 12;
        ecoBN[11][1]  = 19060; 
        
        ecoBN[12][0]  = 13;
        ecoBN[12][1]  = 28400;
              
        ecoBN[13][0]  = 14;
        ecoBN[13][1]  = 24180;
        
        ecoBN[14][0]  = 15;
        ecoBN[14][1]  = 28400;
        
        ecoBN[15][0]  = 16;
        ecoBN[15][1]  = 22965;
               
        ecoBN[16][0]  = 17;
        ecoBN[16][1]  = 28400;
                
        ecoBN[17][0]  = 18;
        ecoBN[17][1]  = 29000;
                
        ecoBN[18][0]  = 19;
        ecoBN[18][1]  = 24180;
                
        ecoBN[19][0]  = 20;
        ecoBN[19][1]  = 19435;
                
        ecoBN[20][0]  = 21;
        ecoBN[20][1]  = 21250;
                
        ecoBN[21][0]  = 22;
        ecoBN[21][1]  = 19060;
               
        ecoBN[22][0]  = 23;
        ecoBN[22][1]  = 13600;
                
        ecoBN[23][0]  = 24;
        ecoBN[23][1]  = 21250;
              
        ecoBN[24][0]  = 25;
        ecoBN[24][1]  = 13645;
           
        ecoBN[25][0]  = 26;
        ecoBN[25][1]  = 21280;
             
        ecoBN[26][0]  = 27;
        ecoBN[26][1]  = 13600;
              
        ecoBN[27][0]  = 28;
        ecoBN[27][1]  = 13645;
              
        ecoBN[28][0]  = 29;
        ecoBN[28][1]  = 30625;
              
        ecoBN[29][0]  = 30;
        ecoBN[29][1]  = 30625;
           
        ecoBN[30][0]  = 31;
        ecoBN[30][1]  = 23470;       
    }
    
    public static void EconomyKLM_NB(){       
        ecoNB[0][0] = 1;
        ecoNB[0][1] = 19260;
        
        ecoNB[1][0] = 2;
        ecoNB[1][1] = 22845;
        
        ecoNB[2][0]  = 3;
        ecoNB[2][1]  = 19260;
                
        ecoNB[3][0]  = 4;
        ecoNB[3][1]  = 22845;
               
        ecoNB[4][0]  = 5;
        ecoNB[4][1]  = 23070;
               
        ecoNB[5][0]  = 6;
        ecoNB[5][1]  = 19260;
                
        ecoNB[6][0]  = 7;
        ecoNB[6][1]  = 45975;
                
        ecoNB[7][0]  = 8;
        ecoNB[7][1]  = 23070;
                
        ecoNB[8][0]  = 9;
        ecoNB[8][1]  = 31055;
             
        ecoNB[9][0]  = 10;
        ecoNB[9][1]  = 23070;
                
        ecoNB[10][0]  = 11;
        ecoNB[10][1]  = 45975;
               
        ecoNB[11][0]  = 12;
        ecoNB[11][1]  = 45975;  
        
        ecoNB[12][0]  = 13;
        ecoNB[12][1]  = 27020;
               
        ecoNB[13][0]  = 14;
        ecoNB[13][1]  = 23070;
              
        ecoNB[14][0]  = 15;
        ecoNB[14][1]  = 28335;
                
        ecoNB[15][0]  = 16;
        ecoNB[15][1]  = 22965;
               
        ecoNB[16][0]  = 17;
        ecoNB[16][1]  = 29335;
             
        ecoNB[17][0]  = 18;
        ecoNB[17][1]  = 33675;
               
        ecoNB[18][0]  = 19;
        ecoNB[18][1]  = 28335;
               
        ecoNB[19][0]  = 20;
        ecoNB[19][1]  = 28110;
               
        ecoNB[20][0]  = 21;
        ecoNB[20][1]  = 31715;
             
        ecoNB[21][0]  = 22;
        ecoNB[21][1]  = 28335;
                
        ecoNB[22][0]  = 23;
        ecoNB[22][1]  = 33450;
                
        ecoNB[23][0]  = 24;
        ecoNB[23][1]  = 29110;
                
        ecoNB[24][0]  = 25;
        ecoNB[24][1]  = 28110;
            
        ecoNB[25][0]  = 26;
        ecoNB[25][1]  = 39815;
               
        ecoNB[26][0]  = 27;
        ecoNB[26][1]  = 28185;
                
        ecoNB[27][0]  = 28;
        ecoNB[27][1]  = 25490;
                
        ecoNB[28][0]  = 29;
        ecoNB[28][1]  = 23070;
             
        ecoNB[29][0]  = 30;
        ecoNB[29][1]  = 30625;
                
        ecoNB[30][0]  = 31;
        ecoNB[30][1]  = 31055;     
    }
     
    public static void BusinessKLM_NB(){       
        bizNB[0][0] = 1;
        bizNB[0][1] = 84340;
                
        bizNB[1][0] = 2;
        bizNB[1][1] = 87700;
               
        bizNB[2][0]  = 3;
        bizNB[2][1]  = 187205;
                
        bizNB[3][0]  = 4;
        bizNB[3][1]  = 133415;
               
        bizNB[4][0]  = 5;
        bizNB[4][1]  = 87440;
               
        bizNB[5][0]  = 6;
        bizNB[5][1]  = 187205;
               
        bizNB[6][0]  = 7;
        bizNB[6][1]  = 133285;
                
        bizNB[7][0]  = 8;
        bizNB[7][1]  = 106395;
                
        bizNB[8][0]  = 9;
        bizNB[8][1]  = 103235;
                
        bizNB[9][0]  = 10;
        bizNB[9][1]  = 133285;
              
        bizNB[10][0]  = 11;
        bizNB[10][1]  = 187205;
               
        bizNB[11][0]  = 12;
        bizNB[11][1]  = 133285;   
        
        bizNB[12][0]  = 13;
        bizNB[12][1]  = 133285;
               
        bizNB[13][0]  = 14;
        bizNB[13][1]  = 187205;
            
        bizNB[14][0]  = 15;
        bizNB[14][1]  = 187075;
                
        bizNB[15][0]  = 16;
        bizNB[15][1]  = 132405;
                
        bizNB[16][0]  = 17;
        bizNB[16][1]  = 187075;
              
        bizNB[17][0]  = 18;
        bizNB[17][1]  = 87065;
               
        bizNB[18][0]  = 19;
        bizNB[18][1]  = 133285;
              
        bizNB[19][0]  = 20;
        bizNB[19][1]  = 187205;
               
        bizNB[20][0]  = 21;
        bizNB[20][1]  = 133415;
                
        bizNB[21][0]  = 22;
        bizNB[21][1]  = 187075;
               
        bizNB[22][0]  = 23;
        bizNB[22][1]  = 187205;
                
        bizNB[23][0]  = 24;
        bizNB[23][1]  = 106505;
             
        bizNB[24][0]  = 25;
        bizNB[24][1]  = 187805;
                
        bizNB[25][0]  = 26;
        bizNB[25][1]  = 74250;
               
        bizNB[26][0]  = 27;
        bizNB[26][1]  = 133415;
              
        bizNB[27][0]  = 28;
        bizNB[27][1]  = 187075;
               
        bizNB[28][0]  = 29;
        bizNB[28][1]  = 187205;
               
        bizNB[29][0]  = 30;
        bizNB[29][1]  = 189705;
               
        bizNB[30][0]  = 31;
        bizNB[30][1]  = 187075;
    }
    
    public static void Detail_RT() {     
        System.out.println ("                          Detail of your flight                             ");
        System.out.println ("----------------------------------------------------------------------------");
        
        if(classToFly == 1){
            System.out.println ("Class to fly: Economy Class");
        }else{
            System.out.println("Class to fly: Business Class");}
        System.out.println(" ");
        
        if(departing == 1){
            System.out.println ("Departing from: BKK - Bangkok, Suvarnabhumi Intl.");
        }else{
            System.out.println ("Departing from: AMS - Amsterdam, Schiphol Airport");}
        
        if(start > 1 || start < 31){
            System.out.println ("Travel date: " + start + " December 2021");}
        System.out.println(" ");
        
        if(arriving == 1){
            System.out.println ("Arriving from: BKK - Bangkok, Suvarnabhumi Intl.");
        }else{
            System.out.println ("Arriving from: AMS - Amsterdam, Schiphol Airport");}
        
        if(last > 1 || last < 31){
            System.out.println ("Travel date: " + last + " December 2021");}
        System.out.println(" "); 
        
        if(passengers > 1 || passengers < 10){
            System.out.println ("Passengers : " + passengers);}
        System.out.println ("----------------------------------------------------------------------------"); 
        
        if(classToFly == 1){
            if(departing == 1 && arriving == 2){
                System.out.println("Price: " + ((ecoBN[start][1] + ecoNB[last][1]) * passengers));
            }
            if(departing == 2 && arriving == 1){
                System.out.println("Price: " + ((ecoNB[start][1] + ecoBN[last][1]) * passengers));}
            }
        
        else if(classToFly == 2){
            if(departing == 1 && arriving == 2){
                System.out.println("Price: " + ((bizBN[start][1] + bizNB[last][1]) * passengers));
            }
            if(departing == 2 && arriving == 1){
                System.out.println("Price: " + ((bizNB[start][1] + bizBN[last][1]) * passengers));
            }
        }
        System.out.println ("----------------------------------------------------------------------------");
    }
        
    public static void Detail_OW() {
        System.out.println ("                          Detail of your flight                             ");
        System.out.println ("----------------------------------------------------------------------------");
        
        if(classToFly == 1){
            System.out.println ("Class to fly: Economy Class");
        }else{
            System.out.println("Class to fly: Business Class");}
        System.out.println(" ");
        
        if(departing == 1){
            System.out.println ("Departing from: BKK - Bangkok, Suvarnabhumi Intl.");
        }else{
            System.out.println ("Departing from: AMS - Amsterdam, Schiphol Airport");}
               
        if(arriving == 1){
            System.out.println ("Arriving from: BKK - Bangkok, Suvarnabhumi Intl.");
        }else{
            System.out.println ("Arriving from: AMS - Amsterdam, Schiphol Airport");}
        System.out.println(" ");
        
        if(date > 1 || date < 31){
            System.out.println ("Travel date: " + date + " December 2021");}
        System.out.println(" "); 
        
        if(passengers > 1 || passengers < 10){
            System.out.println ("Passengers : " + passengers);}
        System.out.println ("----------------------------------------------------------------------------");    
        
        if(classToFly == 1){
            if(departing == 1 && arriving == 2){
                System.out.println("Price: " + ecoBN[date][1] * passengers);
            }
            if(departing == 2 && arriving == 1){
                System.out.println("Price: " + ecoNB[date][1] * passengers);
            }
        }
        else if(classToFly == 2){
            if(departing == 1 && arriving == 2){
                System.out.println("Price: " + bizBN[date][1] * passengers);
            }
            if(departing == 2 && arriving == 1){
                System.out.println("Price: " + bizNB[date][1] * passengers);
            }
        }
        System.out.println ("----------------------------------------------------------------------------");
    }    
    
    public static void Assign(){
        BusinessKLM_BN();
        BusinessKLM_NB();
        EconomyKLM_BN();
        EconomyKLM_NB();
    }
}