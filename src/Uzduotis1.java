import java.util.Arrays;
import java.util.Scanner;
/*
Užduotis 1:
1. Susikurkite Java projektą, susikurkite Programa.java failą (class), tame faile susikurkite main funkciją.
2. Susikurti papildomą funkciją, kuri patikrina ar skaičius yra pirminis (prime). Skaičius yra pirminis, tik tada jeigu jis dalinasi TIK iš savęs ir iš vieneto. Keletas pirminių skaičių pavyzdžių: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113
Pastaba: galima eiti nuo 0 iki x ir skaičiuoti iš kelių skaičių, x dalinasi be liekanos. Jeigu tik iš vieneto ir pačio savęs, tai tada x yra pirminis. Jeigu iš daugiau - tai tada ne pirminis.
3. Susikurkite papildomą funkciją, kuri suskaičiuoja kiek yra pirminių skaičių masyve.
 */
public class Uzduotis1 {
    public static void main(String[] args) {
        int[] tikrinamiSkaiciai = masyvoNuskaitymas();
        System.out.println("tikrinamiSkaiciai = " + Arrays.toString(tikrinamiSkaiciai));

        System.out.println("Masyve pirminių skaičių yra: " + kiekPirminiu(tikrinamiSkaiciai));
    }

    /**
     * Patikrina ar skaičius yra pirminiss
     * @param skaicius tikrinamas skaičius
     * @return true, jeigu pirminis, false jeigu ne
     */
    public static boolean arPirminis(int skaicius) {
        for (int i = 2; i < skaicius / 2; i++) {
            if (skaicius % i == 0) {
                return false;
            }
        }
        return true;
    }
    /**
     * Nuskaito skaičių massyvą iš konsolės
     * @return skaičių masyvą
     */
    public static int[] masyvoNuskaitymas() {
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite kiek massyve bus skaičių: ");
        int n = skaitytuvas.nextInt();
        int[] skaiciai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Įveskite " + i + "-ąjį skaičių: ");
            skaiciai[i] = skaitytuvas.nextInt();
        }
        return skaiciai;
    }

    /**
     * Suskaičiuoja kiek pirminių skaičių yra masyve
     * @param masyvas tikrinamas skaičių masyvas
     * @return sveikas skaičius - kiek pirminių sk. yra masyve
     */
    public static int kiekPirminiu(int[] masyvas) {
        int kiekis = 0;
        for (int elementas : masyvas) {
            if (arPirminis(elementas)) {
                kiekis++;
            }
        }
        return kiekis;
    }
}