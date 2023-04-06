import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /// TODO USING SCANNEROM MINI PROJECKT  ///

        Scanner scan = new Scanner(System.in);
        System.out.println("Эки адамдын маектешуусу!");
        System.out.print("Бир адамдын атын жазыныз: ");
        String firstName = scan.nextLine()+": ";
        System.out.print("Экинчи адамдын атын жазыныз: ");
        String secondName= scan.nextLine()+": ";
        String name2 = firstName;
        String name3  = secondName;

        System.out.print(firstName);
        String say1 = scan.nextLine()+": ";

        System.out.print(secondName);
        String say2 = scan.nextLine()+": ";

        System.out.print(firstName);
        String say3 = scan.nextLine()+": ";

        System.out.println(secondName);
        String say4 = scan.nextLine() + ": ";

        System.out.println(firstName);
        String say5 = scan.nextLine() + ": ";

        System.out.println(secondName);
        String say6 = scan.nextLine() + ": ";

        System.out.println(firstName);
        String say7 = scan.nextLine() + ": ";

        System.out.println(secondName);
        String say8 = scan.nextLine() + ": ";

        System.out.println(firstName);
        String say9 = scan.nextLine() + ": ";

        System.out.println(secondName);
        String asy10 = scan.nextLine() + ": ";

        System.out.println("Oksana menen Ctalbektin maekteshuusu");
        int number = scan.nextInt();
        System.out.println("""
                >>  Okcana:  menen Ctalöek:  tin  vaekteshuusu <<
                Okcana: Calam!
                Cnalbek: Calam!
                Okcana: Kak vashi dela?
                Ctalbek: horisho, u vas kak?
                Okcana:  Kak vashi dela?
                Ctalbek: Cpasibo, toje horosho.
                Okcana: Chem zanimaetes?
                Ctalbek: Dannoe vremya uchus, a ty?
                Okcana: ya  rabotayu.
                Ctakbek: Horosho""");








    }
}