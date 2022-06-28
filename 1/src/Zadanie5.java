public class Zadanie5 {

    /*
    Write a program that reads the name of a city and checks if the name ends with "burg".
    Keep in mind, a city can have a short name.
    The program should output true or false.
     */
    public static void main(String[] args) {

        String txt = "edburg";
        String output = null;
        if(txt.length()>=4)
            output = txt.substring(txt.length()-4, txt.length());
            if(output.equals("burg")) {
                System.out.println(txt);
            }
        else if(txt.length()<4)
            System.out.println("za krotki wyraz");
        else
            System.out.println("no nie");
    }
}
