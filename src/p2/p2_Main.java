package p2;

public class p2_Main {
    public static void main(String[] args) {
        String2 myString=new String2("hello World");
        myString.addPrefix("gg ");
        System.out.println(myString.mainString.toString());
         myString.addPostfix(" gg");
         System.out.println(myString.mainString.toString());
    }

}
