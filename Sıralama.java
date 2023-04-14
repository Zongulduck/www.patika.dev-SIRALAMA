import java.util.Scanner;
public class Sıralama {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        float a,b,c;
        System.out.println("a sayısını giriniz");
        a=inp.nextFloat();
        System.out.println("b sayısını giriniz");
        b=inp.nextFloat();
        System.out.println("c sayısını giriniz");
        c=inp.nextFloat();
        if(a>b && a>c){
            if(b>c){
                System.out.println("Sıralama şu şekilde:");
                System.out.println("a>b>c");
            }
            else{
                System.out.println("Sıralama şu şekilde:");
                System.out.println("a>c>b");

            }
        }
        else if(b>a && b>c){
            if(a>c){
                System.out.println("Sıralama şu şekilde:");
                System.out.println("b>a>c");
            }
            else {
                System.out.println("Sıralama şu şekilde:");
                System.out.println("b>c>a");
            }

        }
        else if(c>a && c>b){
            if(a>b){
                System.out.println("Sıralama şu şekilde:");
                System.out.println("c>a>b");
            }
            else {
                System.out.println("Sıralama şu şekilde:");
                System.out.println("c>b>a");
            }

        }



    }
}
