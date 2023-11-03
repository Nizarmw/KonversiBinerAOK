import java.util.*;
public  class konversi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        
            System.out.println("===============Pengubah bilangan===============");
            System.out.print("pilih jenis bilangan yang mau anda konversi: ");
            System.out.println("");
            System.out.println("1. Desimal");
            System.out.println("2. Biner");
            System.out.println("3. Hexadesimal");
            
            n = in.nextInt();
            if(n==1){
                System.out.println("Pilih bilangan yang anda inginkan: ");
                
                System.out.println("1.Biner");
                System.out.println("2.HexaDesimal");
                int x = in.nextInt();
                if(x==1){
                System.out.println("Masukkan bilangan Desimal: ");
                int b = in.nextInt();
                String DecB = Integer.toBinaryString(b);
                System.out.println("Hasil Konversi ke bilangan Biner: "+DecB);
                }
                if(x==2){
                System.out.println("Masukkan bilangan Desimal: ");
                int b = in.nextInt();
                String DecH = Integer.toHexString(b);
                System.out.println("Hasil Konversi ke bilangan Hexadesimal: "+DecH.toUpperCase());
                }
            }
            if(n==2){
                System.out.println("pilih bilangan yang mau anda ubah: ");
                System.out.println("1.Desimal");
                System.out.println("2.HexaDesimal");
                int x = in.nextInt();
                if(x==1){
                    System.out.println("Masukkan bilangan Biner : ");
                    String Bi = in.next();
                    int BinD = Integer.parseInt(Bi,2);
                    System.out.println("Hasil Konversi ke bilangan Desimal: "+BinD );
                    

                }
                if(x==2){
                    System.out.println("Masukkan bilangan Biner : ");
                    String Bi = in.next();
                    int BinD = Integer.parseInt(Bi,2);
                    String DecH = Integer.toHexString(BinD);
                    System.out.println("Hasil Konversi ke bilangan Hexadesimal: "+DecH.toUpperCase());


                }
            }
            if(n==3){
                System.out.println("pilih bilangan yang mau anda ubah: ");
                System.out.println("1.Desimal");
                System.out.println("2.Biner");
                int x = in.nextInt();
                 if(x==1){
                    System.out.println("Masukkan bilangan Hexadesimal: ");
                    String Hi = in.next();
                    int HexD = Integer.parseInt(Hi,16); 
                    System.out.println("Hasil Konversi ke bilangan Desimal: "+HexD );

                }
                if(x==2){
                    System.out.println("Masukkan bilangan Hexadesimal: ");
                    String Hi = in.next();
                    int HexD = Integer.parseInt(Hi,16);
                    String DecB = Integer.toBinaryString(HexD);
                    System.out.println("Hasil Konversi ke bilangan Biner: "+HexD );

                }
            }
        
    }
}