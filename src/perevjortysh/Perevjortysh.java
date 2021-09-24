
package perevjortysh;

import java.util.Arrays;
import java.util.Scanner;

public class Perevjortysh {

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("str = " + str);
        char[] charStr = str.toCharArray(); // STRING TO CHAR - stroku skopirovali v massiv, razbili po simvolam 
        System.out.println("charStr = " + Arrays.toString(charStr));
        char[] newCharStr = new char[charStr.length]; // NEW EMPTY CHAR - sozdali razmer, no ne zapolnili  
        System.out.println("newCharStr = " + Arrays.toString(newCharStr));
        for (int i = 0; i < charStr.length; i++) {
            newCharStr[(charStr.length-1)-i] = charStr[i]; // skopirovali posledni simvol, otnjali ego iz dliny massiva
        }
        System.out.println("newCharStr = "+Arrays.toString(newCharStr));
        
        String str2 = new String(newCharStr); // CHAR TO STRING - massiv simvolov preobrazovat v stroku tipa string
        System.out.println("str2 = " + str2);
        
        // STRINGBUILDER
        
        StringBuilder stringbuilder = new StringBuilder(str); //konstruktor StringBuilder, sozdai object!
        System.out.println("string otherwise = " + stringbuilder.reverse().toString()); //pomestili v stringbuilder stroku, ona preobrazovana vnutri (reverse) i return toString
    }
    
}
