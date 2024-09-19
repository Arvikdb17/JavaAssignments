package Strings;

public class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder s = new StringBuilder();
        int i=0;
        if(identifier.startsWith("i")){
            i=1;
        }
        for(;i<identifier.length();i++){
            if(identifier.charAt(i) == ' '){
                s.append("_");
            }else if(identifier.charAt(i) == '-'){
                s.append(identifier.substring(i+1,i+2).toUpperCase());
                i++;
            }else if(identifier.charAt(i) == '#'||identifier.charAt(i) == '!'||identifier.charAt(i) == '¡'||identifier.charAt(i) == '$'||identifier.charAt(i) == '.'){
                s.append("");
            }else if(identifier.charAt(i) == '3'){
                s.append("e");
            }else if(identifier.charAt(i) == '0'){
                s.append("o");
            }else if(identifier.charAt(i) == '1'){
                s.append("l");
            }else if(identifier.charAt(i) == '7'){
                s.append("t");
            }else if(identifier.charAt(i) == '4'){
                s.append("a");
            }else{
                s.append(identifier.charAt(i));
            }
        }
        return new String(s);
    }
}
