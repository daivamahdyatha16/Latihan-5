package bukutamu;
public class BukuTamu {
private static int Tamu = 0;
private final String Telepon;
private final String Nama;
private final String Alamat;

public BukuTamu(String a, String b, String c){
    Nama = a;
    Telepon = b;
    Alamat = c;
    Tamu++;
}
public static int getTamu(){
    return Tamu;
}
public void tampilan(){
    System.out.println("Nama Tamu           : " +Nama);
    System.out.println("Alamat : " +Alamat);
    System.out.println("No. Telepon/HP : " +Telepon);
}
    
}