package miniproject;
public class Text {
    static String ans;
   public static String start_chat(String[] words,String usn){
		for(int i=0;i<words.length;i++){
			if(compare_hello(words[i])==0){
                            
                            ans=Functions.hello(usn);
				
			}
			else if(compare_bye(words[i])==0){
                            ans=Functions.bye(usn);
			}
			else{
				mid_chat(words,usn);
				break;
			}
		}

                return ans;
	}

	public static String mid_chat(String[] words,String usn){
		int i,j,k,l;
		for(i=0;i<words.length;i++){
			if(words[i].compareTo("Marks")==0||words[i].compareTo("marks")==0){
				ans="Subject code of the subject for marks";
                                return ans;
			}
		}

		for(j=0;j<words.length;j++){
			if(words[j].compareTo("Exams")==0||words[j].compareTo("exams")==0||words[j].compareTo("Exam")==0||words[j].compareTo("exam")==0){
				ans="Subject code of the subject for exams";
                                return ans;
			}
		}

		for(k=0;k<words.length;k++){
			if(words[k].compareTo("teacher")==0||words[k].compareTo("teaches")==0||words[k].compareTo("teaches")==0){
				ans="Subject code of the subject for the teacher";
                                return ans;
			}
		}
                
                for(l=0;l<words.length;l++){
			if(words[l].compareTo("classes")==0||words[l].compareTo("class")==0){
				ans="Subject code of the subject for attendance";
                                return ans;
			}
		}

		if(i==words.length&&j==words.length&&k==words.length&&l==words.length)
			ans=Functions.other(usn);

                return ans;
	}

	public static int compare_hello(String w){
		String[] Hello={"Hi","Hello","Hey","Hey MEMIC","Hello MEMIC","Hi MEMIC","hi","hello","hey","MEMIC","memic","hi memic","hello memic","hey memic"};
		for(int i=0;i<Hello.length;i++)
			if(w.compareTo(Hello[i])==0)
				return 0;
		return 1;
	}

	public static int compare_bye(String w){
		String[] Bye={"Bye"," Bye then","Bye Then","bye then","Goodbye","Bye Bye","Bye MEMIC","Goodbye MEMIC","bye","goodbye","bye memic","goodbye memic"};
		for(int i=0;i<Bye.length;i++)
			if(w.compareTo(Bye[i])==0)
				return 0;
		return 1;
	}


}
