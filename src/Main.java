public class Main {

    public static void main(String[] args){

        int[] newnumbers = {16, 222, 51, 1, 13, 18, 12, 467, 393, 18, 777, 44, 760, 1000, 4125, 1600, 197, 3108, 29, 2};
        int sum = 0;

    for (int i = 0; i < newnumbers.length; i++)
            System.out.println(newnumbers[i]);

            for (int i = 0; i < newnumbers.length; i++)
                sum += newnumbers[i];

            System.out.println(sum);

        if (sum % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }

    }}



