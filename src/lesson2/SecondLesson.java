package lesson2;

import org.w3c.dom.ls.LSOutput;

public class SecondLesson {
    public static void main(String[] args) {
// логические операторы &&
//        &&  вернёт true  если оба true, в остальных случаях  false
    int x = 50, y = 100, z = 191;
    boolean res = (x % 2 == 0) && (y% 2 == 0) && (z % 2 == 0);
//                    true && true && false
//                        true && false ;
//                        res = false
       System.out.println(res); //false
        boolean res1 = (x < y) && (y < z);
        System.out.println(res1); // true


        // || Оператор или
        //  вернет true  если один операнд true или оба true.  Если оба  false, тогда  false
        int code = 3333, age = 36;
        res = (code == 2222) || (code == 3333 ) || (code ==4444);
                // false || true || false
        //          true || false
        //          true
        System.out.println(res); // true

        res = ( code != 3333) || (age < 18);
        System.out.println(res); //false
        int test =10;
        System.out.println(test);

        // ! - оператор НЕ. Он меняет значение на противоположное
        System.out.println(!res);



        boolean isActive = false, isConnected = true;
        boolean res2 = !isActive || !isConnected; // true
        System.out.println(res2); // true

        res = !((code != 3333) || (age <18));
//                false || false
//                        !false
//                          true
        System.out.println(res); // true


    }
}
