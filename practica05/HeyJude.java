public class HeyJude {

    public static void main (String [] args) {
            //Declarar la letra
        String hey = "Hey Jude ";
        String dont = "don't ";

        String make_bad = "make it bad ";
        String be = "be afraid ";
        String let = "let me down ";

        String take = "Take a sad song and make it better ";
        String you_were = "You were made to go out and get her ";
        String you_have = "You have found her, now go and get her ";

        String rem = "Remember ";

        String into = "to let her into you heart ";
        String under = "to let her under your skin ";

        String then = "Then you ";

        String can = "can start ";
        String begin = "begin ";

        String to_make = "to make it better ";

        String better = "better ";
        String naa = "Na ";
        String na = "na ";

            //Declaramos los parrafos
          int parr1 = 0;
          int parrNa = 0;
          int parrBe = 0;

            //Construimos la letra
          while (parr1 < 7) {
            if (parr1 == 1 || parr1 == 6 || parr1 == 2 || parr1 == 4) {
              System.out.print(hey);
              }
            if (parr1 == 1 || parr1 == 6 || parr1 == 2 || parr1 == 4) {
              System.out.print(dont);
              }
            if (parr1 == 1 || parr1 == 6) {
              System.out.println(make_bad);
              System.out.println(take);
              }
            if (parr1 == 2) {
              System.out.println(be);
              System.out.println(you_were);
              }
            if (parr1 == 4) {
              System.out.println(let);
              System.out.println(you_have);
              }
            if (parr1 == 1 || parr1 == 2 || parr1 == 4 || parr1 == 6) {
              System.out.print(rem);
              }
            if (parr1 == 1 || parr1 == 4) {
              System.out.println(into);
              }
            if (parr1 == 2 || parr1 == 6) {
              System.out.println(under);
              }
            if (parr1 == 1 || parr1 == 2 || parr1 == 4 || parr1 == 6) {
              System.out.print(then);
              }
            if (parr1 == 1 || parr1 == 4) {
              System.out.print(can);
              }
            if (parr1 == 2 || parr1 == 6) {
              System.out.print(begin);
              }
            if (parr1 == 1 || parr1 == 2 || parr1 == 4) {
              System.out.println(to_make);
              }
            if (parr1 == 6) {
              System.out.print(to_make);
              }
            if (parr1 == 1 || parr1 == 2 || parr1 == 4 || parr1 == 6) {
              System.out.println(" ");
              }
            if (parr1 == 6) {
              while (parrBe < 5) {
                System.out.print(better);
                parrBe++;
                  }
                System.out.print(", oh ");
                System.out.println(" ");
                System.out.println(" ");
                }
            if (parr1 == 3) {
                System.out.print(naa);
              while (parrNa < 9) {
                System.out.print(na);
                parrNa++;
                }
                System.out.println(" ");
                System.out.println(" ");
              }
            if (parr1 == 5) {
                System.out.print(naa);
                parrNa = 0;
              while (parrNa < 9) {
                  System.out.print(na);
                  parrNa++;
                }
                System.out.println(" ");
                System.out.println(" ");
              }
          parr1++;
          }

          if (parr1 == 7) {
              System.out.print(naa);
              parrNa = 0;
            while (parrNa < 9) {
                System.out.print(na);
                parrNa++;
              }
              System.out.println(" ");
              System.out.print(hey);
          }
  }
}
