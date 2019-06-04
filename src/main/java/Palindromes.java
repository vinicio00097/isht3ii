import sun.misc.Regexp;

import java.util.Arrays;
import java.util.List;

public class Palindromes {
    public static void main(String args[]){
        evaluate("arenera");
        evaluate(null);
        evaluate("");
        evaluate("aa");
        evaluate("arepera ");
        evaluate("hoytuveexamendeiaymefuesuperbienyovoymalenesaclaseylaverdadcreo" +
                "ganarlarperosincerameentelaclasedeingeriadesoftwareesmuybuenaconelingenueroquetenemos" +
                "hoytuveexamendeiaymefuesuperbienyovoymalenesaclaseylaverdadcreoganarlarperosincerameentel" +
                "aclasedeingeriadesoftwareesmuybuenaconelingenueroquetenemos"
        );

        evaluate("%&(aviva.");
        evaluate("soos");
    }

    public static Object evaluate(String word) {
        if (word == null) {
            //throw new IllegalArgumentException("You can't pass a null String as input.");
            System.out.println("Probando "+word+" - Resultado "+word);
            return null;
        }

        if(word.isEmpty()){
            System.out.println("Probando "+word+" - Resultado "+word);
            return word;
        }

        if(word.length()<3){
            System.out.println("Probando "+word+" - Resultado "+word);
            return word;
        }


        if(word.matches(".*(\\s)")){
            System.out.println("Probando "+word+" - Resultado  ");
            return "";
        }

        if(word.length()>200){
            System.out.println("Probando "+word+" - Resultado  ");
            return "";
        }

        if(!word.matches("^[a-z]+$")){
            System.out.println("Probando "+word+" - Resultado \"solo letras o numeros\"");
            return "solo letras o numeros";
        }


        if(word.length()%2==0){
            System.out.println("Probando "+word+" - Resultado 0");
            return  0;
        }

        boolean result = true;
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                result = false;
                break;
            }
        }

        System.out.println("Probando "+word+" - Resultado "+result);
        return result;
    }
}
