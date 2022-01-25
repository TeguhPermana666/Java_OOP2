package OOP.regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class finpattern {
    public static void main(String[] args) {
        Pattern pattern =Pattern.compile ("HAI TEGUH",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("hai teguh hai tegar");//=>case_insensitive jika ada ascii yg sama maka true
        boolean cocok = matcher.find();
        if(cocok){
            System.out.println("Match ditemukan pada pattern");
        }
        else{
            System.out.println("IDIOT ga ketemu cuk");
        }
        /*
        Flags
        Pattern.CASE_INSENSITIVE - The case of letters will be ignored when performing a search.
        
        Pattern.LITERAL - Special characters in the pattern will not have any special meaning and will be treated as ordinary characters when performing a search.
        
        Pattern.UNICODE_CASE - Use it together with the CASE_INSENSITIVE flag to also ignore the case of letters outside of the English alphabet
        */
        

    }
}
