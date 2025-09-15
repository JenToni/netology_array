import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] prices = {50, 14, 80};
        String[] product = {"Молоко", "Хлеб", "Яблоки"};

        int[] count = new int[product.length];

        for (int i = 0; i < product.length; i++){
            System.out.println(product[i] + " " + prices[i] + " руб/шт");
        }

        Scanner in = new Scanner(System.in);
        while (true){

            String answer = in.nextLine();

            if (answer.equals("end")){
                break;
            }
            String[] s = answer.split(" ");
            int position = Integer.parseInt(s[0]);
            int counts = Integer.parseInt(s[1]);
            count[position - 1] += counts;
        }

        System.out.println("Ваша корзина");
        int total = 0;
        for(int i = 0; i < product.length; i++){
            if (count[i] != 0){
                System.out.println(product[i] + " " + count[i] + "шт " + prices[i] + " руб/шт" +  count[i] * prices[i] + " руб в сумме");
                total += count[i] * prices[i];
            }
        }
        System.out.println("Итого " + total + " руб");

    }
}