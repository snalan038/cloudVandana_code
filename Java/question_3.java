import java.util.*;


class pangram{
    public static void main(String arg[]){
        String a;
        int count=0;
        Scanner input=new Scanner(System.in);
        a=input.nextLine();
        for(int i=97;i<=122;i++){
            for(int j=0;j<a.length();j++){
                if((int)a.charAt(j)==i){
                    count++;
                    break;
                }
            }
        }
        if(count==26){
            System.out.print("Panogram");
        }
        else{
            System.out.print("not a Panogram");
        }
    }
}

