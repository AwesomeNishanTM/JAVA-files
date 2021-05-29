import java.util.Scanner;

enum Days {
    Sunday(1), Monday(2), Tuesday(3), Wednesday(4), Thursday(5), Friday(6), Saturday(7);

    int daysId;

    Days(int id) {
        this.daysId = id;
    }

    public int getDaysId() {
        return this.daysId;
    }

    static class demo1 {
        public static void main(String args[]) {
            // System.out.println(Days.valueOf("Sunday"));
            // System.out.println(Days.Sunday.getDaysId());

            // Scanner sc = new Scanner(System.in);
            // int ch;
            // System.out.println("Enter a number from (1-7)");
            // ch = sc.nextInt();
            System.out.println("Displaying all days of a week and value assign to it:-");
            for (Days days : Days.values()) {
                switch (days) {
                case Sunday:
                    System.out.print(Days.Sunday.getDaysId() + "=");
                    System.out.println(days);
                    break;
                case Monday:
                    System.out.print(Days.Monday.getDaysId() + "=");
                    System.out.println(days);
                    break;
                case Tuesday:
                    System.out.print(Days.Tuesday.getDaysId() + "=");
                    System.out.println(days);
                    break;
                case Wednesday:
                    System.out.print(Days.Wednesday.getDaysId() + "=");
                    System.out.println(days);
                    break;
                case Thursday:
                    System.out.print(Days.Thursday.getDaysId() + "=");
                    System.out.println(days);
                    break;
                case Friday:
                    System.out.print(Days.Friday.getDaysId() + "=");
                    System.out.println(days);
                    break;
                case Saturday:
                    System.out.print(Days.Saturday.getDaysId() + "=");
                    System.out.println(days);
                    break;

                    default :
                    System.out.println("Completed");

                }
            }
            // System.out.println(Days.Sunday.ordinal());
            // System.out.println(Days.Sunday.name());
        }
    }
}
