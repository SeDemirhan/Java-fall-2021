package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1=LocalTime.now();
        System.out.println(time1);//19:16:57.906029200

        Thread.sleep(3000);

        time1=LocalTime.now();
        System.out.println(time1);//19:19:21.364289700

        System.out.println(time1.getSecond());//13
        System.out.println(time1.plusSeconds(10000));//22:19:53.721199200

        System.out.println(time1.minusMinutes(200));//16:15:31.679125400


    }
}
