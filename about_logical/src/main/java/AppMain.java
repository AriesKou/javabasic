public class AppMain {
    public static void main(String args[]) {
        int students = 150;
        int rooms = 0;
        /*In regarding to the logical operation,
        *  & : system will execute both side of &
        *  && : if left side was false, it won't execute right side continuesly
        *
        *  thus. in below case, when we use & in the if condition, it will thorw ArithmeticException: / by Zero,
        *  while if we use &&, if won't throw any exception
        * */
        if(rooms > 0 & students/rooms > 30)
            System.out.println("Crowded!!");

        System.out.println();
        System.out.println("** end program");
    }
}

