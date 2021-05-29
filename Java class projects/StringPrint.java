
class StringSort {
    public static void main(String args[]) {

        String namelist[] = { "kamal", "Indra", "tek", "Prashat", "Pramod", "Praveen" };
        for (int i = 0; i < namelist.length; i++) {
            for (int j = i + 1; j < namelist.length; j++) {
                if (namelist[i].compareToIgnoreCase(namelist[j]) > 0) {
                    String temp = namelist[i];
                    namelist[i] = namelist[j];
                    namelist[j] = temp;
                }
            }

        }
        for (String g : namelist) {
            System.out.println(g);
        }
    }
}