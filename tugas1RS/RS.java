import java.text.DecimalFormat;
import java.util.Scanner;
public class RS 
{
    public static void main(String[] args)
    {
        //deklarasi variabel dan library
        DecimalFormat df1 = new DecimalFormat("#,,###,##0.00");
        Scanner input=new Scanner(System.in);
        String nama;
        String kode_pasien;
        String nama_kamar;
        int kode_kamar;
        int hrg_infus=100000;
        int hrg_dokter=200000;
        int hrg_kamar=400000;
        int jml_infus;
        int inap;
        double bayar;

        //Proses Input
        System.out.print("Kode Pasien : " );
        kode_pasien=input.nextLine();
        System.out.print("Nama Pasien : " );
        nama=input.nextLine();
        System.out.print("Nama Kamar  : " );
        nama_kamar=input.nextLine();
        System.out.print("Kode Kamar  : ");
        kode_kamar=input.nextInt();
        System.out.print("Total Infus : ");
        jml_infus=input.nextInt();
        System.out.print("Lama Inap   : " );
        inap=input.nextInt();

        //Rumus Bayar
        bayar=(hrg_kamar*inap)+(hrg_dokter*inap)+(hrg_infus*jml_infus);

        //Tampilan Output
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("       Tagihan RS Ndang Mari        ");
        System.out.println("====================================");
        System.out.println("Nama Pasien \t\t: "+nama);
        System.out.println("Kode Pasien \t\t: "+kode_pasien);
        System.out.println("Kode Kamar \t\t: "+kode_kamar);
        System.out.println("Nama Kamar \t\t: "+nama_kamar);
        System.out.println("Harga Kamar@ \t\t: "+hrg_kamar);
        System.out.println("Harga Dokter@ \t\t: "+hrg_dokter);
        System.out.println("Harga Infus@ \t\t: "+hrg_infus);
        System.out.println("Total Infus \t\t: "+jml_infus+" Kantong");
        System.out.println("Lama Inap \t\t: "+inap+" Hari");
        df1 = new DecimalFormat("#,###,##0.00");
        String xbayar = "Rp. "+df1.format(bayar);
        System.out.println("Total Bayar \t\t: "+xbayar);
    }
}

