import java.util.*;

class roman{
    public static void main(String arg[]){
        String a;
        Scanner input = new Scanner(System.in);
        a=input.nextLine();
        int number=0;
        switch(a){
            case "I":
                number = 1;
                break;
            case "II":
                number = 2;
                break;
            case "III":
                number = 3;
                break;
            case "IV":
                number = 4;
                break;
            case "V":
                number = 5;
                break;
            case "VI":
                number = 6;
                break;
            case "VII":
                number = 7;
                break;
            case "VIII":
                number = 8;
                break;
            case "IX":
                number = 9;
                break;
            case "X":
                number = 10;
                break;
        }
        System.out.print(number);
    }
}