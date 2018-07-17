package miniproject;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class Functions {
static Random rand = new Random();
static int r=0;

	public static String hello(String usn){
               
		String[] ans=new String[4];
                ans[0]="Hello";
                ans[1]="Hi";
                ans[2]="Hello! Welcome to MEMIC";                
		ans[3]="Hello "+identify(usn);
                r=rand.nextInt(ans.length);
		return ans[r];
	}
        
        public static String bye(String usn){

                String[] ans=new String[5];
                ans[0]="Bye";
                ans[1]="Goodbye";
                ans[2]="Bye! See you soon";   
                ans[4]="Goodbye pal";
		ans[3]="Bye "+identify(usn);
            
                r=rand.nextInt(ans.length);
		return (ans[r]);
		
	}

	public static String other(String usn){
		String[] other={"Can you be more specific ?","Sorry, can you repeat again?","I didn't get you","Pardon","Come again"};
		r=rand.nextInt(other.length);
		return (other[r]);
	}

	public static String marks(String subcode,String usn){
		
        Statement stmt;
        Connection conn;
        conn = Conn12.getConnection();
        String ans1="";
        String ans2="";
        String ans3="";
        String ans="";
        

        String SQL="SELECT IA1_Marks,IA2_Marks,IA3_Marks FROM MARKS WHERE USN='"+usn+"' AND SCode='"+subcode+"';";
        
        try {
            stmt = conn.createStatement();
            java.sql.ResultSet rs=stmt.executeQuery(SQL);
            while(rs.next()){
                ans1=rs.getString(1);
                ans2=rs.getString(2);
                ans3=rs.getString(3);
            }
            ans="Internals 1st="+ans1+", 2nd="+ans2+", 3rd="+ans3;
        }
        catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        }
       
        return ans;

	}
        
        public static String attends(String subcode,String usn){
		
        Statement stmt;
        Connection conn;
        conn = Conn12.getConnection();
        String ans="";
        

        String SQL="SELECT Percentage FROM ATTENDANCE WHERE USN='"+usn+"' AND SCode='"+subcode+"';";
        
        try {
            stmt = conn.createStatement();
            java.sql.ResultSet rs=stmt.executeQuery(SQL);
            while(rs.next()){
                ans=rs.getString(1);
            }
            ans="Your attendance percentage is "+ans+" %";
        }
        catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        }
       
        return ans;

	}
        
        public static String exams(String subcode,String usn){
		
        Statement stmt;
        Connection conn;
        conn = Conn12.getConnection();
        String[] ansa=new String[3];
        String ans="";
        

        String SQL="SELECT Date FROM EXAM WHERE SCode='"+subcode+"';";
        
        try {
            stmt = conn.createStatement();
            java.sql.ResultSet rs=stmt.executeQuery(SQL);
            int i=0;
            while(rs.next()){
                ansa[i]=rs.getString(1);
                i++;
            }
            ans="1st="+ansa[0]+", 2nd="+ansa[1]+", 3rd="+ansa[2];
        }
        catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        }
       
        return ans;

	}

        public static String teach(String w,String usn){
	Statement stmt;
        Connection conn;
        conn = Conn12.getConnection();
        String ans="";
        

        String SQL="SELECT T.Name FROM TEACHER T,TEACHES S,BELONGS B WHERE B.CID=S.CID AND T.TID=S.TID AND S.Scode='"+w+"' AND B.USN='"+usn+"';";
        
        try {
            stmt = conn.createStatement();
            java.sql.ResultSet rs=stmt.executeQuery(SQL);
            while(rs.next()){
                ans=rs.getString(1);
               
            }
        }
        catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        }
       
        return ans;

	}
    
        public static String identify(String usn){
        Statement stmt;
        Connection conn;
        conn = Conn12.getConnection();
        String name="";

        String SQL="SELECT Name FROM STUDENT WHERE USN='"+usn+"';";

        try {
            stmt = conn.createStatement();
            java.sql.ResultSet rs=stmt.executeQuery(SQL);
            while(rs.next())
                name=rs.getString(1);
            conn.close();

        }
        catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        }
        return name;
    }
        
}
