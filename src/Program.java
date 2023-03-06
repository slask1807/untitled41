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
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        if (K > N) {
            K = K % N;
        }
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < K; i++) {
            int n = a[N - 1];
            for (int j = N - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = n;

        }

        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }
    }


}











