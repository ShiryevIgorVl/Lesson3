import java.util.Random;
import java.util.Scanner;

public class Main {
        static Random rand = new Random();
        static Scanner sc = new Scanner(System.in);



        public static void main (String[] args) {
            int a;
            do {
                int answerCor = answerCorrect();
                System.out.println("Угадайте число с трех попыток \n" + "Введите пожалуйста ваш ответ");
                for (int i = 0; i < 3; i++) {
                int answer = sc.nextInt();
                if (answer == answerCor) {
                    System.out.println("Вы угадали");
                    break;
                }
                if (answer != answerCor && numberGreater(answer, answerCor)) {
                    System.out.println("Вы ошиблись. Введите большее число. \n У Вас осталось " + (2 - i) + " попыток. \n Попробуйте еще раз");

                }
                if (answer != answerCor && numberLes(answer, answerCor)) {
                    System.out.println("Вы ошиблись. Введите меньшее число. \n У Вас осталось " + (2 - i) + " попыток. \n Попробуйте еще раз");
                }

            }
                System.out.println("Повторить игру еще раз? \n Если ДА тогда введите число 1 \n Если НЕТ введите число 0");
                a = sc.nextInt();
            } while (a == 1);
        }

    public static int answerCorrect () {
          return rand.nextInt(10);
    }

    public static boolean numberGreater (int answer, int answerCor) {
        return answerCor > answer;
    }

    public static boolean numberLes (int answer, int answerCor) {
        return answerCor < answer;
    }




}
