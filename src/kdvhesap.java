import java.util.Scanner;

public class kdvhesap {
    public static void main(String[] args) {
        double tutar , kdvoran = 0.18, kdvtutar, kdvlitutar;

        Scanner input = new Scanner(System.in);
        System.out.print("ücret tutarını giriniz:");
        tutar = input.nextDouble();



        kdvtutar = tutar * kdvoran ;
        kdvlitutar= kdvtutar + tutar;


        System.out.println(kdvtutar);
        System.out.println("kdv2siz tutar:" + tutar);
        System.out.println("kdvoran:" + kdvoran);
        System.out.println("kdvli tutar:" + kdvlitutar);



    }
}
