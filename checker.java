
public class checker extends Stronger
{
   public static int validEmails(String[] email){
       int count=0;
       //loop through email addresses
       for(int index=0; index<email.length; index++){
        if(email[index].contains("@")&&email[index].contains(".")){
        count++;
        }
        }
        return count;
    }
}
