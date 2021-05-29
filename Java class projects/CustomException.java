class CustomException {
    public static void main(String args[]) {
        int a = 1;
        for (int i = 0; i <= 1; i++) {

            try {
                if (i == 0) {
                    System.out.println("he is a hero");
                }

                if (i == 1) {
                    throw new NIException();

                }
            } catch (NIException ex) {
                System.out.println(ex);
            }
        }
    }
}

class NIException extends Exception {
    public int abs() {
        return 0;
    }
}
