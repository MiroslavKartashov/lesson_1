package com.geekbrains;
// ДЗ  выполненно    следующим образом
//  "// - Задание"
//  "/* */ - тело выполнеия задания "

public class Main {
    public static void main(String[] args) {
       // 2.Создать переменные всех пройденных типов данных, и инициализировать их значения;
/*        byte new_byte = 2;
        int b = 20;
        short new_short = 23;
        long new_long = 34;
        float d = 2.34f;
        double new_double = b/new_long;
        char f = 3403;
        boolean j = true;
        String tell = "Hi";

            System.out.println("byte = "+ new_byte);
            System.out.println("int = "+ b);
            System.out.println("short = " + new_short);
            System.out.println("long = " + new_long);
            System.out.println("float = " + d);
            System.out.println("double = " + new_double);
            System.out.println("char = " + f);
            System.out.println("boolean = " + j);
            System.out.println("String " + tell);

    }
}

 */

/*
// 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат
//  ,где a, b, c, d – входные параметры этого метода;

     public static float task3(float a, float b,float c, float d){
        return (a * (b + (c / d)));
     }
}
*/


//4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
//   в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
/*
      public static boolean task4(int a, int b){
        if ((a + b) >= 10 && (a + b) <= 20){
             return true;
          }
             return false;
        }
    }

*/

// 5. Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль положительное ли число передали, или отрицательное;
// Замечание: ноль считаем положительным числом
/*        public static int task5(int a) {
            if (a >= 0) {
               System.out.println("Число " + a + " положительное");
          } else {
               System.out.println("Число " + a + " отрицательное");
            }
        }
}
*/

/*
// 6 Написать метод, которому в качестве параметра передается целое число,
// метод должен вернуть true, если число отрицательное;

          public static boolean task6(int a) {
            if (a < 0) {
            return  true;
            }
    }
}
*/
/*
// 7. Написать метод, которому в качестве параметра передается строка,
// обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

     public static String task7(String name){
        System.out.println("Привет, "+ name + " !");
    }
}
*/

/*
//8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
//     Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

        public static int task8 ( int year){
          if ((year % 4 == 0) || ((year % 400 == 0) && (year % 100 == 0))) {
                System.out.println(year + " Высокосный год");}
          else {
                System.out.println(year + " Не высокосный год");}
        }
}

 */
