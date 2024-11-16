import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//task 1
        int[] weight = new int[3];

        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        float[] weightf = new float[3];
        weightf[0] = 1.57f;
        weightf[1] = 7.654f;
        weightf[2] = 9.986f;

        float[] weightfTwo = {1.57f, 7.654f, 9.986f};

        char[] chars = new char[3];
        chars[0] = '.';
        chars[1] = '!';
        chars[2] = '@';

        String[] strings = new String[3];
        strings[0] = "&&&";
        strings[1] = "!#";
        strings[2] = "%^#";
//task 2
        System.out.println("//task 2\nint[] weight: ");

        for (int i : weight) {
            if (i == 3) {
                System.out.print(i + " ");
            } else {
                System.out.print(i + ", ");
            }
        }

        System.out.println();

        System.out.println("float[] weightf: ");

        for (float f : weightf) {
            if (f == 9.986f) {
                System.out.print(f + " ");
            } else {
                System.out.print(f + ", ");
            }
        }

        System.out.println();

        System.out.println("float[] weightfTwo: ");

        for (float f : weightfTwo) {
            if (f == 9.986f) {
                System.out.print(f + " ");
            } else {
                System.out.print(f + ", ");
            }
        }

        System.out.println();

        System.out.println("char[] chars: ");

        for (char c : chars) {
            if (c == '@') {
                System.out.print(c + " ");
            } else {
                System.out.print(c + ", ");
            }
        }

        System.out.println();

        System.out.println("String[] strings: ");
        for (String s : strings) {
            if (s.equals("%^#")) {
                System.out.print(s + " ");
            } else {
                System.out.print(s + ", ");
            }
        }

        System.out.println();
//variant 2
        System.out.println("//variant 2\nchar[] chars: ");

        int lengthChars = chars.length;

        for (int i = 0; i < lengthChars; i++) {
            char c = chars[i];
            System.out.print(c + (i < lengthChars - 1 ? ", " : " "));
        }

        System.out.println("\n//task 3");
//task 3
        System.out.println("char[] chars: ");
        for (int i = lengthChars - 1; i >= 0; i--) {
            char c = chars[i];
            System.out.print(c);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("int[] weight: ");

        int lengthWeight = weight.length;

        for (int i = lengthWeight - 1; i >= 0; i--) {
            int w = weight[i];
            System.out.print(w);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

int lengthWeightf = weightf.length;

        System.out.println("float[] weightf: ");
        for (int i =  lengthWeightf - 1; i >= 0; i--) {
            float f = weightf[i];
            System.out.print(f);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println("//variant 2");
//variant 2
        int x = lengthChars - 1;

        do {
            char q = chars[x];
            System.out.print(q);
            x--;
            if (x >= 0) {
                System.out.print(", ");
            }
        } while (x >= 0);

        System.out.println("\n//task 4");
//task 4
        for (int i = 0; i < lengthWeight; i++) {
            if (weight[i] % 2 != 0) {
                weight[i] += 1;
            }
        }

        System.out.println("int[] weight: ");

        for (int w : weight) {
            int c = weight[lengthWeight - 1];
            if (w == c) {
                System.out.print(w + " ");
            } else {
                System.out.print(w + ", ");

            }
        }
        System.out.println("\nvariant 2");
//variant 2
        for (int i = 0; i < 2; i++) {
            if (weight[i] % 2 != 0) {
                weight[i] += 1;
                System.out.println(weight[i]);
            }

        }

        System.out.println(Arrays.toString(weight));
//task 1 lesson 2
        int[] notes = new int[5];
        notes[0] = 1;
        notes[1] = 2;
        notes[2] = 3;
        notes[3] = 4;
        notes[4] = 5;

        int notesTwo[] = {3, 5, 7, 12, 15};

        int sum = Arrays.stream(notesTwo).sum();
        System.out.println("//task 1 lesson 2\nСумма трат за предыдущий месяц составила " + sum + " рублей."); // Выводит "Сумма: <some-thing>"

        sum = Arrays.stream(notes).sum();
        System.out.println("Сумма трат за этот месяц составила " + sum + " рублей."); // Выводит "Сумма: <some-thing>"
//task 2 lesson 2
        int[] costOnWeek = {1, 15, 1681, 618, 6847};

        int max = Arrays.stream(costOnWeek).max().getAsInt();
        int min = Arrays.stream(costOnWeek).min().getAsInt();
        System.out.println("//task 1 lesson 2\nМаксимальная сумма трат за неделю составила " + max + " рублей.\nМинимальная сумма трат за неделю составила " + min + " рублей.");
//task 3 lesson 2
        int[] costOnWeekFirst = new int[5];
        int[] costOnWeekSecond = new int[5];
        int[] costOnWeekThird = new int[5];
        int[] costOnWeekFourth = new int[5];
        Random random = new Random();
        int lengthCost = 5;
        for (int i = 0; i < lengthCost; i++) {
            costOnWeekFirst[i] = random.nextInt(100); // Random int value between 0 and 99
            costOnWeekSecond[i] = random.nextInt(100); // Random int value between 0 and 99
            costOnWeekThird[i] = random.nextInt(100); // Random int value between 0 and 99
            costOnWeekFourth[i] = random.nextInt(100); // Random int value between 0 and 99
        }
        System.out.println(String.format("Week 1: %s\nWeek 2: %s\nWeek 3: %s\nWeek 4: %s",
                Arrays.toString(costOnWeekFirst), Arrays.toString(costOnWeekSecond), Arrays.toString(costOnWeekThird), Arrays.toString(costOnWeekFourth)));

        int sumOfDaysOnWeeks = Arrays.stream(costOnWeekFirst).sum() + Arrays.stream(costOnWeekSecond).sum() + Arrays.stream(costOnWeekThird).sum() + Arrays.stream(costOnWeekFourth).sum();
        double average = (double) sumOfDaysOnWeeks / 4;
        System.out.println("Средняя сумма трад за месяц составила " + average + " рублей.");
//task 4 lesson 2
        char[] namePerson = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(Arrays.toString(namePerson));
        StringBuilder sb = new StringBuilder();
        for (char c : namePerson) {
            sb.append(c);
        }
        String name = sb.toString();
        String reversedName = new StringBuilder(name).reverse().toString();
// Преобразуем строку в массив символов
        char[] reversedCharArray = reversedName.toCharArray();

// Выводим массив символов как элементы массива
        System.out.println("Массив символов:");
        System.out.println(Arrays.toString(reversedCharArray));
    }
}
