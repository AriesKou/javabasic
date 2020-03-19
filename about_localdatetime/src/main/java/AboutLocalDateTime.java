import java.time.LocalDateTime;

public class AboutLocalDateTime {
    public static void main(String args[]) {
      /*  LocalDateTime today = LocalDateTime.now();
        LocalDateTime tomorrow1 = today.plusDays(1);
        LocalDateTime tomorrow2 = today.minusDays(-1);
        System.out.println(tomorrow1);*/

        myfor:for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.println("J:" + j);
                if (j == 10) {
                    // 跳出多重循环
                    break myfor;
                }
            }
        }

    }
}
