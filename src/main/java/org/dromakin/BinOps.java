package org.dromakin;

public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        String result;

        if (a.matches("[1|0]+") || b.matches("[1|0]+")) {

            result = Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));

        } else {
            throw new IllegalArgumentException("a || b must have 1 || 0!");
        }

        return result;
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/

        String result;

        if (a.matches("[1|0]+") || b.matches("[1|0]+")) {

            result = Integer.toBinaryString(Integer.parseInt(a, 2));

            for (int i = 1; i < Integer.parseInt(b, 2); i++) {
                result = sum(result, a);
            }

        } else {
            throw new IllegalArgumentException("a || b must have 1 || 0!");
        }

        return result;
    }
}
