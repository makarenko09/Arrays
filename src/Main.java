public class Main {
    public static void main(String[] args) {

//task 1
        int[] weight = new int[3];
        float[] weightf = new float[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        weightf[0] = 1.57f;
        weightf[1] = 7.654f;
        weightf[2] = 9.986f;

        char[] chars = new char[3];
        chars[0] = '.';
        chars[1] = '!';
        chars[2] = '@';

        String[] strings = new String[3];
        strings[0] = "&&&";
        strings[1] = "!#";
        strings[2] = "%^#";

        System.out.println("int[] weight: ");
        for (int i : weight) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("float[] weightf: ");
        for (float f : weightf) {
            System.out.print(f + " ");
        }
        System.out.println();
        System.out.println("char[] chars: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("String[] strings: ");
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println();
//task 2

    }
}