import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner girdi=new Scanner(System.in);
        System.out.println("1.Sayı tahmin oyunu"+"\n2.Taş kağıt makas");

        System.out.print("Lütfen oynayacağınız oyun modunu seçiniz(baştaki sayıyı yazınız):");

        String tercih= girdi.next();

        if ( tercih.equals("1")){

            Random rnd = new Random();
            System.out.print("Sayı tahmin oyununa hoşgeldiniz.Tek oyunculu mu oynamak istersiniz çift oyunculu mu:(tek/çift)");
            String oyuncu = girdi.next();
            System.out.println("");
            int sayi1=rnd.nextInt(10000);
            int i=1;
            if (oyuncu.toLowerCase().equals("tek")) {
                System.out.print("Başlamadan önce kuralları okumanızı öneririz kuralları okumak ister misiniz?: (evet/hayır)");
                String onay1 = girdi.next();
                if (onay1.toLowerCase().equals("evet")) {
                    System.out.println("");
                    System.out.println("Bu oyunda 0 ile 10000 arasında herhangi bir sayı belirlenir ve siz doğru sayıyı bulmaya çalışırsınız." +
                            "\n Oyunda toplam 15 hakkınız bulunmaktadır.Eğer hakkınız biterse oyunu kaybedersiniz." +
                            "\n Eğer hakkınız bitmeden sayıyı bulabilirseniz oyunu kazanırsınız.İyi oyunlar.");
                    System.out.println("");
                } else if (onay1.toLowerCase().equals("hayır")) {
                    System.out.println("");

                } else {
                    System.out.println("Lütfen parantez içinde belirtilenlerden birini yazınız.");
                    return;
                }
                System.out.print("Lütfen kullanıcı adınızı giriniz:");
                String ad= girdi.next();
                System.out.println("");
                System.out.println("Sayı tahmin oyunana hoşgeldiniz.");
                System.out.println("");
                System.out.print(ad+" lütfen 10000 e kadar herhangi bir sayı giriniz:");
                int tahmin= girdi.nextInt();
                System.out.println("");
                if (tahmin < 0 || tahmin > 10000) {

                    System.out.print(ad + " girdiğiniz değer hatalı lütfen 0 ile 10000 arasında bir sayı giriniz (0 ve 10000 dahil)");

                    i++;

                    tahmin = girdi.nextInt();
                    System.out.println("");

                } else if (tahmin > sayi1) {

                    System.out.print(ad + " lütfen daha küçük bir sayı giriniz:");
                    i++;

                    tahmin = girdi.nextInt();
                    System.out.println("");

                } else if (tahmin < sayi1) {
                    System.out.print(ad+ " lütfen daha büyük bir sayı giriniz:");
                    i++;

                    tahmin = girdi.nextInt();
                    System.out.println("");

                } else {
                    System.out.println(ad + " " + i + " defa deneyerek doğru bildiniz tbrikler.Oyunu yeniden oynamak\n"+
                            "için uygulamayı tekrar başlatın");
                    return;
                }
                while(tahmin != sayi1){
                    if(i<=15) {
                        if (tahmin < 0 || tahmin > 10000) {

                            System.out.print(ad + " girdiğiniz değer hatalı lütfen 0 ile 10000 arasında bir sayı giriniz (0 ve 10000 dahil)." +
                                    "\nSıra sizde" + ad + ":");
                            i++;

                            tahmin = girdi.nextInt();
                            System.out.println("");

                        } else if (tahmin > sayi1) {

                            System.out.print(ad + " lütfen daha küçük bir sayı giriniz:");
                            i++;

                            tahmin = girdi.nextInt();
                            System.out.println("");

                        } else if (tahmin < sayi1) {
                            System.out.print(ad + " lütfen daha büyük bir sayı giriniz:");
                            i++;

                            tahmin = girdi.nextInt();
                            System.out.println("");

                        }
                    }else {
                        System.out.println(ad+" hakkınız maalesef doldu.Oyunu kaybettiniz.");
                        System.out.println("Eğer tekrar denemek isterseniz programı yeniden çalıştırınız.");
                        return;
                    }


                }System.out.println(ad + " " + i + " defa deneyerek doğru bildiniz tebrikler.Oyunu yeniden oynamak\n"+
                        "için lütfen uygulamayı tekrar çalıştırınız");

                return;



            } else if (oyuncu.toLowerCase().equals("çift")) {

                System.out.print("Başlamadan önce kuralları okumanızı öneririz kuralları okumak ister misiniz (evet/hayır)");
                String onay2 = girdi.next();
                System.out.println("");
                if (onay2.toLowerCase().equals("evet")) {
                    System.out.println("Bu oyunda 0 ile 10000 arasında herhangi bir sayı belirlenir ve siz doğru sayıyı bulmaya çalışırsınız." +
                            "\n Bu modda sıra önce 1.oyuncuyla başlar eğer 1.oyuncu cevabı doğru bulamassa sıra 2.oyuncuya geçer." +
                            "\n Oyunda her oyuncunun 15 hakkı vardır hakkınız dolduğunda oyunu kaybedersiniz.Eğer 2 oyuncununda hakkı biterse oyun berabere olur kimseye puan verilmez." +
                            "\n Eğer herhangi bir oyuncu cevabı doru bulduysa ona 1 puan eklenir.Önce hangi oyuncunun 2 puanı olursa o kazanır." +"\n" +
                            "\n"+
                            "Puanlar eşit ise berabere sayılırlar"+
                            "\n Her set sonunda önceki seti bilen oyuncunun  oynama önceliği vardır.İyi oyunlar.");
                }
                else if (onay2.toLowerCase().equals("hayır")) {
                }
                else {
                    System.out.println("Lütfen parantez içinde belirtilenlerden birini yazınız.");
                    return;
                }
                System.out.print("Kaç tekrar oynamak istersiniz?:");
                int tekrar= girdi.nextInt();

                System.out.print("1.oyuncu adını giriniz:");
                String oyuncu1 = girdi.next();
                System.out.println("");

                System.out.print("2.oyuncu adını giriniz:");
                String oyuncu2 = girdi.next();
                System.out.println("");

                int sayi = rnd.nextInt(10000);

                int tahmin2 = -1;
                int i1 = 1;
                int i2 = 0;
                int puan1 = 0;
                int puan2 = 0;
                String sira = oyuncu1;

                System.out.print(oyuncu1 + " lütfen 10000 e kadar bir değer giriniz:");
                int tahmin1 = girdi.nextInt();
                System.out.println("");
                if (tahmin1 < 0 || tahmin1 > 10000) {

                    System.out.print(oyuncu1 + " girdiğiniz değer hatalı lütfen 0 ile 10000 arasında bir sayı giriniz (0 ve 10000 dahil)." +
                            "\nSıra sizde" + oyuncu2 + ":");
                    i1++;
                    sira = oyuncu2;
                    tahmin2 = girdi.nextInt();
                    System.out.println("");

                } else if (tahmin1 > sayi) {

                    System.out.print(oyuncu2 + " lütfen daha küçük bir sayı giriniz:");
                    i1++;
                    sira = oyuncu2;
                    tahmin2 = girdi.nextInt();
                    System.out.println("");

                } else if (tahmin1 < sayi) {
                    System.out.print(oyuncu2 + " lütfen daha büyük bir sayı giriniz:");
                    i1++;
                    sira = oyuncu2;
                    tahmin2 = girdi.nextInt();
                    System.out.println("");

                } else {
                    System.out.println(oyuncu1 + " " + i1 + " defa deneyerek doğru bildi ve bir puanı kaptı tebrikler.");
                    puan1++;
                    System.out.println("Skor tablosu "+oyuncu1+":"+puan1+" "+oyuncu2+":"+puan2);
                    if (puan1<2) {
                        System.out.print(oyuncu1 + " lütfen bir değer giriniz:");
                        tahmin1 = girdi.nextInt();
                        System.out.println("");
                    }
                }
                for (int i3=0;i<=tekrar;i++){

                    while (sayi != tahmin1 || sayi != tahmin2) {

                        if (sira.equals(oyuncu2)) {
                            if (i1 == 15 && i2 < 15) {

                                if (tahmin2 < 0 || tahmin2 > 10000 || tahmin2 < sayi || tahmin2 > sayi) {
                                    System.out.println("Durum berabere.");
                                    System.out.println("Skor tablosu "+oyuncu1+":"+puan1+" "+oyuncu2+":"+puan2);
                                    break;
                                } else {
                                    System.out.println(oyuncu2 + " " + i2 + " defa deneyerek doğru bildi ve bir puanı kaptı tebrikler.");
                                    puan2++;
                                    System.out.println("Skor tablosu "+oyuncu2+":"+puan2+" "+oyuncu1+":"+puan1);
                                    break;
                                }

                            } else if (i2 < 15) {
                                if (tahmin2 < 0 || tahmin2 > 10000) {

                                    System.out.print(oyuncu2 + " girdiğiniz değer hatalı lütfen 0 ile 10000 arasında bir sayı giriniz (0 ve 10000 dahil)." +
                                            "\nSıra sizde " + oyuncu1 + ":");
                                    i2++;
                                    sira = oyuncu1;
                                    tahmin1 = girdi.nextInt();
                                    System.out.println("");

                                } else if (tahmin2 > sayi) {
                                    System.out.print(oyuncu1 + " lütfen daha küçük bir sayı giriniz:");
                                    i2++;
                                    sira = oyuncu1;
                                    tahmin1 = girdi.nextInt();
                                    System.out.println("");

                                } else if (tahmin2 < sayi) {
                                    System.out.print(oyuncu1 + " lütfen daha büyük bir sayı giriniz:");
                                    i2++;
                                    sira = oyuncu1;
                                    tahmin1 = girdi.nextInt();
                                    System.out.println("");

                                } else {
                                    System.out.println(oyuncu2 + " " + i2 + " defa deneyerek doğru bildi ve bir puanı kaptı tebrikler.");
                                    puan2++;
                                    System.out.println("Skor tablosu "+oyuncu2+":"+puan2+" "+oyuncu1+":"+puan1);
                                    System.out.println("");
                                    break;
                                }
                            } else {
                                System.out.println(oyuncu2 + " hakkın doldu.");
                                sira = oyuncu1;
                                System.out.println("");
                                break;
                            }
                        } else {
                            if (i1 < 15) {
                                if (tahmin1 < 0 || tahmin1 > 10000) {

                                    System.out.print(oyuncu1 + " girdiğiniz değer hatalı lütfen 0 ile 10000 arasında bir sayı giriniz (0 ve 10000 dahil)." +
                                            "\nSıra sizde " + oyuncu2 + ":");
                                    i1++;
                                    sira = oyuncu2;
                                    tahmin2 = girdi.nextInt();
                                    System.out.println("");

                                } else if (tahmin1 > sayi) {
                                    System.out.print(oyuncu2 + " lütfen daha küçük bir sayı giriniz:");
                                    i1++;
                                    sira = oyuncu2;
                                    tahmin2 = girdi.nextInt();
                                    System.out.println("");

                                } else if (tahmin1 < sayi) {
                                    System.out.print(oyuncu2 + " lütfen daha büyük bir sayı giriniz:");
                                    i1++;
                                    sira = oyuncu2;
                                    tahmin2 = girdi.nextInt();
                                    System.out.println("");

                                } else {
                                    System.out.println(oyuncu1 + " " + i1 + " defa deneyerek doğru bildi ve bir puanı kaptı tebrikler.");
                                    puan1++;
                                    System.out.println("Skor tablosu "+oyuncu1+":"+puan1+" "+oyuncu2+":"+puan2);
                                    System.out.println("");
                                    break;
                                }

                            } else {
                                System.out.println(oyuncu1 + " hakkın doldu.");
                                sira = oyuncu2;
                                System.out.println("");

                            }
                        }


                    }i1=0;
                    i2=0;
                    if (tahmin1==sayi && puan1<2 && i3+1<tekrar){
                        sira = oyuncu2;
                        System.out.print(oyuncu2+" lütfen 10000 e kadar bir değer giriniz:");
                        tahmin2= girdi.nextInt();
                    }else if(tahmin2==sayi && puan2<2 && i3+1<tekrar){
                        sira = oyuncu1;
                        System.out.print(oyuncu1+" lütfen 10000 e kadar bir değer giriniz:");
                        tahmin1= girdi.nextInt();
                    }


                    if (puan1==2){

                       System.out.println(oyuncu1+" oyunu kazandı tebrikler "+oyuncu1);
                       System.out.println("Skor tablosu: "+oyuncu1+": "+puan1+" "+oyuncu2+": "+ puan2);
                       break;

                   } else if (puan2==2) {

                       System.out.println(oyuncu2+" oyunu kazandı tebrikler "+oyuncu2);
                       System.out.println("Skor tablosu: "+oyuncu2+": "+puan2+" "+oyuncu1+": "+puan1);
                       break;

                   }else{
                       System.out.println(" ");
                   }
                    sayi=rnd.nextInt(10000);
                }if (puan1>puan2){
                    System.out.println(oyuncu1+" kazandı tebrikler "+oyuncu1);
                    System.out.println("Skor tablosu "+oyuncu1+":"+puan1+" "+oyuncu2+":"+puan2);
                } else if (puan2>puan1) {

                    System.out.println(oyuncu2+" kazandı tebrikler "+oyuncu2);
                    System.out.println("Skor tablosu "+oyuncu2+":"+puan2+" "+oyuncu1+":"+puan1);

                }else{
                    System.out.println("Durum berabere ikinizide tebrik ederiz.");
                    System.out.println("Skor tablosu "+oyuncu1+":"+puan1+" "+oyuncu2+":"+puan2);
                }

            }


        } else if (tercih.equals("2")) {

            System.out.println("Taş,kağıt,makas oyununa hoşgeldiniz.");
            System.out.println("Bu oyunda bilgisayara karşı oynicaksınız bilgisayar bu 3 ünden birini seçecek ve sizde onu yenen şeyi bulmaya çalışacaksınız.");
            System.out.println("Bildiğimiz taş kağıt makas ama sanal taş makası,makas kağıdı ve kağıt ise taşı yener.");


            System.out.println("Kaç tekrar yapmak istersiniz:");
            int tekrar= girdi.nextInt();

            int puanPc=0;
            int puanO=0;
            System.out.print("Lütfen kullanıcı adınızı giriniz:");
            String kullanici=girdi.next();


            for (int i=0;i<tekrar;i++) {



                int pcsecim = (int) (Math.random() * 3);
                System.out.println(kullanici+" lütfen yapmak istediğinizi girin(taş,kağıt,makas):");
                String secim = girdi.next();
                // taş=0,kağıt=1,makas=2
                if (pcsecim==0){
                    if (secim.toLowerCase().equals("makas")){
                        System.out.println(kullanici+" bu turu kaybettiniz"+"\nBilgisayarın cevabı taş sizin cevabınız makas.");
                        puanPc++;
                    } else if (secim.toLowerCase().equals("kağıt")) {

                        System.out.println(kullanici+" bu turu kazandınız"+"\nBilgisayarın cevabı taş sizin cevabınız kağıt.");
                        puanO++;

                    }else if(secim.toLowerCase().equals("taş")) {
                        System.out.println(kullanici+" bu tur berabere");
                    }else {
                        System.out.println( (kullanici+" lütfen geçerli bir değer giriniz:"));
                        i--;
                    }

                } else if (pcsecim==1) {

                    if (secim.toLowerCase().equals("makas")){
                        System.out.println(kullanici+" bu turu kazandınız"+"\n\nBilgisayarın cevabı kağıt sizin cevabınız makas.");
                        puanO++;
                    } else if (secim.toLowerCase().equals("taş")) {

                        System.out.println(kullanici+" bu turu kaybettiniz"+"\n\nBilgisayarın cevabı kağıt sizin cevabınız taş.");
                        puanPc++;

                    }else if(secim.toLowerCase().equals("kağıt")){
                        System.out.println("\n"+kullanici+ " bu tur berabere");
                    }
                    else {
                        System.out.println("\n"+kullanici+"lütfen geçerli bir değer giriniz:");
                        i--;
                    }
                }else {

                    if (secim.toLowerCase().equals("kağıt")){
                        System.out.println(kullanici+" bu turu kaybettiniz"+"\n\nBilgisayarın cevabı makas sizin cevabınız kağıt.");
                        puanPc++;
                    } else if (secim.toLowerCase().equals("taş")) {

                        System.out.println(kullanici+" bu turu kazandınız"+"\n\nBilgisayarın cevabı makas sizin cevabınız taş.");
                        puanO++;

                    }else if(secim.toLowerCase().equals("makas")) {
                        System.out.println("\n"+kullanici+" bu tur berabere");
                    }else {
                        System.out.println("\n"+kullanici+" lütfen geçerli bir değer giriniz:");
                        i--;
                    }
                }
                System.out.println("\nOyun skoru="+"Bilgisayar:"+puanPc+" "+kullanici+":"+puanO);
                if (puanPc>puanO && i+1==tekrar){
                    System.out.println(kullanici+" maalesef bilgisayar kazandı.");
                } else if (puanO>puanPc && i+1==tekrar) {
                    System.out.println("Tebrikler "+kullanici+" oyunu kazandınız.");
                }else if (puanO==puanPc && i+1==tekrar) {
                    System.out.println("Berabere kaldınız tebrikler.");
                }else{

                }
            }
        }
    }
}