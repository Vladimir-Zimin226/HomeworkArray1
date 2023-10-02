import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Task 1
        int[] avengers = new int[3];
        avengers[0] = 1;
        avengers[1] = 2;
        avengers[2] = 3;

        double[] justiceLeague = {1.57, 7.654, 9.986};

        String[] boys = new String[5];
        boys[0] = "Бутчер";
        boys[1] = "Хьюи";
        boys[2] = "Француз";
        boys[3] = "Кимико";
        boys[4] = "Старлайт";

        //Task 2
        System.out.println(Arrays.toString(avengers));
        System.out.println(Arrays.toString(justiceLeague));
        System.out.println(Arrays.toString(boys));

        //Task 3
        for (int index = 2; index > -1; index--) {
            System.out.print(avengers[index] + ", ");
        }
        System.out.println();
        for (int index = 2; index > -1; index--) {
            System.out.print(justiceLeague[index] + ", ");
        }
        System.out.println();
        for (int index = 4; index > -1; index--) {
            System.out.print(boys[index] + ", ");
        }
        System.out.println();

        //Task 4
        for (int index = 0; index < avengers.length; index++) {
            if (index % 2 != 1) {
                avengers[index]++;
            }
        }
        System.out.println(Arrays.toString(avengers));
    }
}
