package rekursif;
import java.util.Scanner;
public class Rekursif {
    public static void cetak(int i)
    {
        if(i > 0)
        {
            System.out.println("Hai ");
            cetak(--i);
        }
    }
    public static void main(String[] args) {
        
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah teks yang ingin dicetak: ");
        int jumlah = baca.nextInt();
        
        cetak(jumlah);
    }
}
