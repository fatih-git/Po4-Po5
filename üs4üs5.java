import java.util.Scanner;

public class üs4üs5 {

    public static void main(String[] args) {

        int limit;
        Scanner input=new Scanner(System.in);

        System.out.print("Bir sınır sayısı girin: ");
        limit=input.nextInt();

        System.out.println("2'nin kuvvetleri:");
        for(int i=1; i<limit; i*=4){
            System.out.print(i+" ");
        }

        System.out.println("\n5'nin kuvvetleri:");
        for(int i=1; i<limit; i*=5){
            System.out.print(i+" ");
        }

    }

}
