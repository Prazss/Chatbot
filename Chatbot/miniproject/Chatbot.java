package miniproject;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Chatbot {
    
    public static String start_chat(String sent,String usn){
        
        
       StringTokenizer t=new StringTokenizer(sent," ?.'");
       String[] sent_array=new String[t.countTokens()];
       for(int i=0;i<sent_array.length;i++){
            sent_array[i]=t.nextToken();
       }
       
       String ans=Text.start_chat(sent_array,usn);
       
        return ans;
    }
    
    }
    

