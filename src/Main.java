import java.util.Arrays;

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
    }
}
