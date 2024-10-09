// 12S24044 - DIANITA LORENSIA BR GINTING
// 12S24051 - GERALDA NATALI GULTOM
import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargaBuku, totalHarga, hargaMurah, totalTransaksi;

        hargaBuku = Double.parseDouble(input.nextLine());
        totalHarga = hargaBuku;
        hargaMurah = hargaBuku;
        while (hargaBuku != 0) {
            if (hargaMurah < hargaBuku) {
                hargaMurah = hargaMurah;
            } else {
                hargaMurah = hargaBuku;
            }
            hargaBuku = Double.parseDouble(input.nextLine());
            totalHarga = totalHarga + hargaBuku;
        }
        if (totalHarga >= 100) {
            totalTransaksi = totalHarga - hargaMurah;
        } else {
            totalTransaksi = totalHarga;
        }
        System.out.println(toFixed(totalTransaksi,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
