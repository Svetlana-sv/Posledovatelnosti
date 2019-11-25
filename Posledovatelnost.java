import java.util.ArrayList;
import java.util.Scanner;

public class Posledovatelnost {
    private static int num, count;
    private static Scanner nn = new Scanner(System.in);
    public static void main(String[] args) {
        //tsk7_133();
        //tsk7_134();
        //tsk7_135();
        //tsk7_136();
        //tsk7_137();
        //tsk7_138();
        //tsk7_139();
        //tsk7_140();
        //tsk7_141();
        //tsk7_142();
        //tsk7_143();
        //tsk7_144();
        //tsk7_145();
    }

    public static void tsk7_133() {
        // Напишите программу, вводящую последовательность целых чисел, и печатающую количество ее максимальных элементов.
        System.out.println("Введите числа последовательности: ");
        count = 1;
        int first = nn.nextInt();
        System.out.println(count);
        boolean b = true;
        num = 0;
        while (true) {
            try {
                if (b) {
                    num = nn.nextInt();
                    b = false;
                } else {
                    if (num > first) {
                        count = 1;
                        System.out.println(count);
                        first = num;
                        num = nn.nextInt();
                    }
                    if (num == first) {
                        count++;
                        System.out.println(count);
                        num = nn.nextInt();
                    }
                    if (num < first) {
                        num = nn.nextInt();
                        System.out.println(count);
                    }
                }
            } catch (Exception e) {
                break;
            }
        }
        System.out.println(count);
    }

    public static void tsk7_134() {
        System.out.println("Стоп символ = любой символ");
        count = 0;
        boolean b = true;
        ArrayList<Integer> A = new ArrayList<>();
        while (true) {
            try {
                num = nn.nextInt();
            } catch (Exception e) {
                break;
            }
            if (b) {
                count++;
                A.add(num * num);
                b = false;
            } else {
                for (int i = 0; i < A.size(); i++) {
                    if (num * num == A.get(i)) {
                        break;
                    }
                    if (i == A.size() - 1) {
                        count++;
                    }
                }
                A.add(num * num);
            }
            System.out.println(count);
        }
        System.out.println(count);
    }

    public static void tsk7_135() {
        // Напишите программу, вводящую последовательность вещественных чисел, и печатающую среднее арифметическое ее элементов (для непустой последовательности).
        System.out.println("Введите числа последовательности: ");
        count = 0;
        float sum = 0, arith = 0;
        boolean b = true;
        float num1 = 0;
        while (true) {
            try {
                if (b) {
                    num1 = nn.nextFloat();
                    sum += num1;
                    count++;
                    if (count > 0) {
                        arith = sum / count;
                        System.out.println(arith);
                    }
                }
            } catch (Exception e) {
                break;
            }
        }
        System.out.println("Среднее арифметическое: " + arith);
    }

    public static void tsk7_136() {
        //Напишите программу, вводящую последовательность целых чисел, и печатающую максимальное число идущих подряд одинаковых элементов.
        System.out.println("Введите числа последовательности: ");
        count = 1;
        int count_max = 1, numfir;
        numfir = nn.nextInt();
        System.out.println(count);
        while (true) {
            try {
                num = nn.nextInt();
                if (num == numfir) {
                    count++;
                    if (count > count_max) {
                        count_max = count;
                    }
                } else {
                    if (count > count_max) {
                        count_max = count;
                    }
                    count = 1;
                    numfir = num;
                }
                System.out.println(count_max);
            } catch (Exception e) {
                break;
            }
        }
        System.out.println("Максимальное число идущих подряд элементов: " + count_max);
    }

    public static void tsk7_137() {
        int max1, max2, max;
        max = nn.nextInt();
        count = 1;
        max1 = count;
        max2 = count;
        System.out.println(max1 + " " + max2);
        while (true) {
            try {
                num = nn.nextInt();
                count++;
                if (num > max) {
                    max1 = count;
                    max2 = count;
                    max = num;
                }
                if (num == max) {
                    max2 = count;
                }
                System.out.println(max1 + " " + max2);
            } catch (Exception e) {
                break;
            }
        }
        System.out.println(max1 + " " + max2);
    }

    public static void tsk7_138() {
        System.out.println("Введите числа последовательности: ");
        int nomer = 0;
        count = 0;
        boolean b = true;
        while (true) {
            try {
                num = nn.nextInt();
                count++;
                if (num == 0 && b) {
                    nomer = count;
                    b = false;
                }
                System.out.println(nomer);
            } catch (Exception e) {
                break;
            }
        }
        System.out.println(nomer);
    }

    public static void tsk7_139() {
        System.out.println("Введите числа последовательности: ");
        int num1, count2 = 1;
        count = 1;
        num1 = nn.nextInt();
        System.out.println(count2);
        while (true) {
            try {
                num = nn.nextInt();
                if (num > num1) {
                    num1 = num;
                    count++;
                    if (count > count2) {
                        count2 = count;

                    }
                    System.out.println(count2);
                } else {
                    num1 = num;
                    if (count > count2) {
                        count2 = count;
                    }
                    count = 1;
                    System.out.println(count2);
                }
            } catch (Exception e) {
                break;
            }
        }
        System.out.println(count2);
    }

    public static void tsk7_140() {
        System.out.println("Введите числа последовательности: ");
        int max, max_2 = 0;
        max = nn.nextInt();
        System.out.println("No");
        boolean b = false;
        while (true) {
            try {
                num = nn.nextInt();
                if (num > max) {
                    max_2 = max;
                    max = num;
                    System.out.println(max_2);
                    b = true;
                } else if (num == max) {
                    if (b) {
                        System.out.println(max_2);
                    } else {
                        System.out.println("No");
                    }
                }
                if (num < max) {
                    if (num > max_2) {
                        max_2 = num;
                        System.out.println(max_2);
                    } else {
                        System.out.println(max_2);
                    }
                }
            } catch (Exception e) {
                break;
            }
        }
        System.out.println(max_2);
    }

    public static void tsk7_141() {
        ArrayList<Integer> A = new ArrayList<>();
        System.out.println("Стоп симлов = любая буква");
        int x;
        boolean b = true;
        while (true) {
            try {
                x = nn.nextInt();
                A.add(x);
            } catch (Exception e) {
                break;
            }
            for (int i = 0; i < A.size(); i++) {
                for (int i1 = 0; i1 < A.size(); i1++) {
                    for (int i2 = 0; i2 < A.size(); i2++) {
                        if (A.get(i) * A.get(i1) == A.get(i2)) {
                            System.out.println(A.get(i) + " " + A.get(i1) + " " + A.get(i2));
                            b = false;
                        }

                    }
                }
            }
            if (b) {
                System.out.println("No");
            }
        }
    }

    public static void tsk7_142() {
        System.out.println("Стоп симлов = любая буква");
        int max_counter1 = 1, max_counter2 = 1, counter1 = 1, counter2 = 1, x;
        num = nn.nextInt();
        while (true) {

            try {
                x = nn.nextInt();

            } catch (Exception e) {
                break;
            }
            if (x > num) {
                counter1++;
                if (counter2 > max_counter2) {
                    max_counter2 = counter2;
                }
                counter2 = 1;
                num = x;
            } else {
                if (x < num) {
                    counter2++;
                }
                if (counter1 > max_counter1) {
                    max_counter1 = counter1;
                }
                counter1 = 1;
                num = x;
            }
            if (counter1 > max_counter1) {
                max_counter1 = counter1;
            }
            if (counter2 > max_counter2) {
                max_counter2 = counter2;
            }
            if (counter1 > max_counter1) {
                max_counter1 = counter1;
            }
            if (max_counter1 > max_counter2) {
                System.out.println(max_counter1);
            } else {
                System.out.println(max_counter2);
            }
        }
    }

    public static void tsk7_143() {
        System.out.println("Стоп симлов = любая буква");
        int x, counter_1 = 0, counter_group = 0;
        num = nn.nextInt();
        while (true) {
            try {
                x = nn.nextInt();

            } catch (Exception e) {
                break;
            }
            if (x == 1) {
                counter_1++;
            } else {
                if (counter_1 > 1) {
                    counter_group++;
                }
            }
            System.out.println(counter_group);
        }
    }

    public static void tsk7_144() {
        System.out.println("Введите числа последовательности: ");
        int count_vhod = 0;
        count = 1;
        while (true) {
            try {
                num = nn.nextInt();
                if (num == count) {
                    if (count == 6) {
                        count = 1;
                        count_vhod++;
                    }
                    count++;
                }
                System.out.println(count_vhod);
            } catch (Exception e) {
                break;
            }
        }
        System.out.println(count_vhod);
    }

    public static void tsk7_145() {
        System.out.println("Введите числа последовательности: ");
        int x;
        count = 0;
        while (true) {
            try {
                x = nn.nextInt();
                if (x == 1) {
                    System.out.println(count);
                    x = nn.nextInt();
                    if (x == 2) {
                        System.out.println(count);
                        x = nn.nextInt();

                        if (x == 1) {
                            System.out.println(count);
                            x = nn.nextInt();

                            if (x == 2) {
                                System.out.println(count);
                                x = nn.nextInt();
                                if (x == 1) {
                                    System.out.println(count);
                                    x = nn.nextInt();
                                    if (x == 2) {
                                        count++;
                                    }
                                }
                            }
                        }
                    }
                }
                System.out.println(count);
            } catch (Exception e) {
                break;
            }
        }
        System.out.println(count);
    }
}
