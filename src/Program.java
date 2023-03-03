import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//        int old = scanner.nextInt();
//        String town = scanner.next();
//        String job = scanner.next();
//        int a = scanner.nextInt();
//        double b = scanner.nextDouble();
//        double cc = scanner.nextDouble();
//        double ss = 2*a+0.5*b;
//        double c = scanner.nextDouble();
//        int a = scanner.nextInt();
//        int one =  a/1000;
//        int two = (a-one*1000)/100;
//        int three = (a-(a/100)*100)/10;
//        int four = a- (a/10)*10;
//        System.out.println(one+two+three+four);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        Boolean oneWord = scanner.nextBoolean();
//        Boolean secondWord = scanner.nextBoolean();
//        Boolean thirdWord = scanner.nextBoolean();
        //int num0 = scanner.nextInt();
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) { // i < n можно заменить на i < a.length
            a[i] = scanner.nextInt();
                    }

        int min = a[0];
        int minN=0;
        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
                 minN =i;
            } }
      System.out.println("мини инд"+minN);
        int max = a[0];
        int maxN =0;
        for (int i = 0; i < n; i++) {
            if (max <= a[i]) {
                max = a[i];
                maxN =i;
                        }
        }
        System.out.println("макс инд"+maxN);
//      System.out.println(max);
//                System.out.println(min);
        int sum=0;
        if (minN<maxN){
      for (int i = minN+1; i < maxN; i++) {

             sum+=a[i];

          }}
        if (minN>maxN) {
            for (int i = maxN+1; i < minN; i++) {

                sum+=a[i];

            }}
        if (minN==maxN)
        {
            for (int i = 1; i < n-1; i++) {

                sum+=a[i];

            }}
          System.out.print(sum);
        }

        }







