import java.security.SecureRandom;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static SecureRandom rand = new SecureRandom();
    public static DecimalFormat dec = new DecimalFormat("#0.00");
    public static int amo_answer = 0, answer, answer_1, diff_1;
    public static float percent_right, neg_item = 0, pos_item = 0;
    public static double answer_2;
    public static int answer_3;
    public static int rand_int1;
    public static int rand_int2;
    public static int rand_int3;
    public static int rand_int4;
    public static int rand_int5 = rand.nextInt(3);


    public static void main(String[] args) {

        fun_1();
    }

    public static void fun_1() {
        fun_2();
        if (answer_1 == 1)
        {
            fun_3();
        }
        if (answer_1 == 2)
        {
            fun_4();
        }
        if (answer_1 == 3)
        {
            fun_5();
        }
        if (answer_1 == 4)
        {
            fun_6();
        }
        if(answer_1 == 5)
        {
            switch(rand_int5)
            {
                case(0):
                    fun_3();
                    break;
                case (1):
                    fun_4();
                    break;
                case(2):
                    fun_5();
                    break;
                case(3):
                    fun_6();
                    break;
            }
        }
    }
    public static int fun_2()
    {
        System.out.println("1.Addition\n2.Multiplication\n3.Subtraction\n4.Division\n5.Random\nEnter which type of Problem you would like to Solve: ");
        answer_1 = scan.nextInt();
        return answer_1;
    }
    public static void fun_3() {
        System.out.println("Enter the level of difficulty (1-4): ");
        diff_1 = scan.nextInt();
        for (int i = 0; i <= 9; ++i) {
            switch (diff_1) {
                case 1:
                    rand_int1 = rand.nextInt(9);
                    rand_int2 = rand.nextInt(9);
                    System.out.println("How much is " + rand_int1 + " + " + rand_int2);
                    answer = scan.nextInt();
                    break;

                case 2:
                    rand_int1 = rand.nextInt(99);
                    rand_int2 = rand.nextInt(99);
                    System.out.println("How much is " + rand_int1 + " + " + rand_int2);
                    answer = scan.nextInt();
                    break;

                case 3:
                    rand_int1 = rand.nextInt(999);
                    rand_int2= rand.nextInt(999);
                    System.out.println("How much is " + rand_int1 + " + " + rand_int2);
                    answer = scan.nextInt();
                    break;
                case 4:
                    rand_int1 = rand.nextInt(9999);
                    rand_int2= rand.nextInt(9999);
                    System.out.println("How much is " + rand_int1 + " + " + rand_int2);
                    answer = scan.nextInt();
                    break;

            }
            if (answer == (rand_int1 + rand_int2)) {
                switch (rand_int3) {
                    case 0:
                        System.out.println("Very Good!");
                        pos_item++;
                        amo_answer++;
                        break;
                    case 1:
                        System.out.println("Excellent!");
                        pos_item++;
                        amo_answer++;
                        break;
                    case 2:
                        System.out.println("Nice work!");
                        pos_item++;
                        amo_answer++;
                        break;
                    case 3:
                        System.out.println("Keep up the good work!");
                        pos_item++;
                        amo_answer++;
                        break;
                }
            }
            if (answer != (rand_int1 + rand_int2)) {
                switch (rand_int4) {
                    case 0:
                        System.out.println("No. Please try again.");
                        amo_answer++;
                        neg_item++;
                        break;
                    case 1:
                        System.out.println("Wrong. Try once more.");
                        amo_answer++;
                        neg_item++;
                        break;
                    case 2:
                        System.out.println("Don’t give up!");
                        amo_answer++;
                        neg_item++;
                        break;
                    case 3:
                        System.out.println("No. Keep trying.");
                        amo_answer++;
                        neg_item++;
                        break;
                }
            }
        }
        System.out.println("You received " + pos_item + " correct and " + neg_item +" wrong.");

        percent_right = (pos_item/neg_item) * (100);

        System.out.println(percent_right);

        if (percent_right < 75)
        {
            System.out.println("Please ask your teacher for extra help.");
        }
        else
        {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        System.out.println("Would you like to Start again?\nPress 1 to restart\nPress 2 to Exit");
        answer_3 = scan.nextInt();

        if(answer_3 == 1){fun_1();}

        else{System.out.println("Goodbye");}
    }
    public static void fun_4()
    {
        System.out.println("Enter the level of difficulty (1-4): ");
        diff_1 = scan.nextInt();
        for (int i = 0; i <= 9; ++i) {
            switch (diff_1) {
                case 1:
                    rand_int1 = rand.nextInt(9);
                    rand_int2 = rand.nextInt(9);
                    System.out.println("How much is " + rand_int1 + " * " + rand_int2);
                    answer = scan.nextInt();
                    System.out.println(rand_int1 + rand_int2);
                    break;

                case 2:
                    rand_int1 = rand.nextInt(99);
                    rand_int2 = rand.nextInt(99);
                    System.out.println("How much is " + rand_int1 + " * " + rand_int2);
                    answer = scan.nextInt();
                    break;

                case 3:
                    rand_int1 = rand.nextInt(999);
                    rand_int2= rand.nextInt(999);
                    System.out.println("How much is " + rand_int1 + " * " + rand_int2);
                    answer = scan.nextInt();
                    break;
                case 4:
                    rand_int1 = rand.nextInt(9999);
                    rand_int2= rand.nextInt(9999);
                    System.out.println("How much is " + rand_int1 + " * " + rand_int2);
                    answer = scan.nextInt();
                    break;

            }
            if (answer == (rand_int1 * rand_int2)) {
                switch (rand_int3) {
                    case 0:
                        System.out.println("Very Good!");
                        pos_item++;
                        amo_answer++;
                        break;
                    case 1:
                        System.out.println("Excellent!");
                        pos_item++;
                        amo_answer++;
                        break;
                    case 2:
                        System.out.println("Nice work!");
                        pos_item++;
                        amo_answer++;
                        break;
                    case 3:
                        System.out.println("Keep up the good work!");
                        pos_item++;
                        amo_answer++;
                        break;
                }
            }
            if (answer != (rand_int1 * rand_int2)) {
                switch (rand_int4) {
                    case 0:
                        System.out.println("No. Please try again.");
                        amo_answer++;
                        neg_item++;
                        break;
                    case 1:
                        System.out.println("Wrong. Try once more.");
                        amo_answer++;
                        neg_item++;
                        break;
                    case 2:
                        System.out.println("Don’t give up!");
                        amo_answer++;
                        neg_item++;
                        break;
                    case 3:
                        System.out.println("No. Keep trying.");
                        amo_answer++;
                        neg_item++;
                        break;
                }
            }
        }
        System.out.println("You received " + pos_item + " correct and " + neg_item +" wrong.");

        percent_right = (pos_item/neg_item) * (100);

        System.out.println(percent_right);

        if (percent_right < 75)
        {
            System.out.println("Please ask your teacher for extra help.");
        }
        else
        {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }

    }
    public static void fun_5()
    {
        System.out.println("Enter the level of difficulty (1-4): ");
        diff_1 = scan.nextInt();
        for (int i = 0; i <= 9; ++i) {
            switch (diff_1) {
                case 1:
                    rand_int1 = rand.nextInt(9);
                    rand_int2 = rand.nextInt(9);
                    System.out.println("How much is " + rand_int1 + " - " + rand_int2);
                    answer = scan.nextInt();
                    System.out.println(rand_int1 + rand_int2);
                    break;

                case 2:
                    rand_int1 = rand.nextInt(99);
                    rand_int2 = rand.nextInt(99);
                    System.out.println("How much is " + rand_int1 + " - " + rand_int2);
                    answer = scan.nextInt();
                    break;

                case 3:
                    rand_int1 = rand.nextInt(999);
                    rand_int2= rand.nextInt(999);
                    System.out.println("How much is " + rand_int1 + " - " + rand_int2);
                    answer = scan.nextInt();
                    break;
                case 4:
                    rand_int1 = rand.nextInt(9999);
                    rand_int2= rand.nextInt(9999);
                    System.out.println("How much is " + rand_int1 + " - " + rand_int2);
                    answer = scan.nextInt();
                    break;

            }
            if (answer == (rand_int1 - rand_int2)) {
                switch (rand_int3) {
                    case 0:
                        System.out.println("Very Good!");
                        pos_item++;
                        amo_answer++;
                        break;
                    case 1:
                        System.out.println("Excellent!");
                        pos_item++;
                        amo_answer++;
                        break;
                    case 2:
                        System.out.println("Nice work!");
                        pos_item++;
                        amo_answer++;
                        break;
                    case 3:
                        System.out.println("Keep up the good work!");
                        pos_item++;
                        amo_answer++;
                        break;
                }
            }
            if (answer != (rand_int1 - rand_int2)) {
                switch (rand_int4) {
                    case 0:
                        System.out.println("No. Please try again.");
                        amo_answer++;
                        neg_item++;
                        break;
                    case 1:
                        System.out.println("Wrong. Try once more.");
                        amo_answer++;
                        neg_item++;
                        break;
                    case 2:
                        System.out.println("Don’t give up!");
                        amo_answer++;
                        neg_item++;
                        break;
                    case 3:
                        System.out.println("No. Keep trying.");
                        amo_answer++;
                        neg_item++;
                        break;
                }
            }
        }
        System.out.println("You received " + pos_item + " correct and " + neg_item +" wrong.");

        percent_right = (pos_item/neg_item) * (100);

        System.out.println(percent_right);

        if (percent_right < 75)
        {
            System.out.println("Please ask your teacher for extra help.");
        }
        else
        {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }

    }
    public static void fun_6()
    {
        double rand_int1 = 0.00;
        double rand_int2 = 0.00;
        System.out.println("Enter the level of difficulty (1-4): ");
        diff_1 = scan.nextInt();
        for (int i = 0; i <= 9; ++i) {
            switch (diff_1) {
                case 1:
                    rand_int1 = rand.nextInt(9);
                    rand_int2 = rand.nextInt(9);
                    System.out.println("How much is " + rand_int1 + " / " + rand_int2);
                    System.out.println(rand_int1 / rand_int2);
                    answer_2 = scan.nextDouble();
                    break;

                case 2:
                    rand_int1 = rand.nextInt(99);
                    rand_int2 = rand.nextInt(99);
                    System.out.println("How much is " + rand_int1 + " / " + rand_int2);
                    System.out.println(rand_int1 / rand_int2);
                    answer_2 = scan.nextInt();
                    break;

                case 3:
                    rand_int1 = rand.nextInt(999);
                    rand_int2 = rand.nextInt(999);
                    System.out.println("How much is " + rand_int1 + " / " + rand_int2);
                    System.out.println(rand_int1 / rand_int2);
                    answer_2 = scan.nextInt();
                    break;
                case 4:
                    rand_int1 = rand.nextInt(9999);
                    rand_int2 = rand.nextInt(9999);
                    System.out.println("How much is " + rand_int1 + " / " + rand_int2);
                    System.out.println(rand_int1 / rand_int2);
                    answer_2 = scan.nextInt();
                    break;

            }
            if (answer_2 == (rand_int1 / rand_int2)) {
                switch (rand_int3) {
                    case 0:
                        System.out.println("Very Good!");
                        pos_item++;
                        amo_answer++;
                        break;
                    case 1:
                        System.out.println("Excellent!");
                        pos_item++;
                        amo_answer++;
                        break;
                    case 2:
                        System.out.println("Nice work!");
                        pos_item++;
                        amo_answer++;
                        break;
                    case 3:
                        System.out.println("Keep up the good work!");
                        pos_item++;
                        amo_answer++;
                        break;
                }
            }
            dec.format(rand_int1);
            dec.format(rand_int2);
            if (answer_2 != (rand_int1 / rand_int2)) {
                switch (rand_int4) {
                    case 0:
                        System.out.println("No. Please try again.");
                        amo_answer++;
                        neg_item++;
                        break;
                    case 1:
                        System.out.println("Wrong. Try once more.");
                        amo_answer++;
                        neg_item++;
                        break;
                    case 2:
                        System.out.println("Don’t give up!");
                        amo_answer++;
                        neg_item++;
                        break;
                    case 3:
                        System.out.println("No. Keep trying.");
                        amo_answer++;
                        neg_item++;
                        break;
                }
            }
        }
        System.out.println("You received " + pos_item + " correct and " + neg_item +" wrong.");

        percent_right = (pos_item/neg_item) * (100);

        System.out.println(percent_right);

        if (percent_right < 75)
        {
            System.out.println("Please ask your teacher for extra help.");
        }
        else
        {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }

    }
}