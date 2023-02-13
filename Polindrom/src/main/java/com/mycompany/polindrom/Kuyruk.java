
package com.mycompany.polindrom;


public class Kuyruk {
Eleman bas;
Eleman son;

public Kuyruk() {
    bas=null;
    son=null;
}
boolean kuyrukBos(){
            if (bas==null) 
                return true;
            else return false;
}
void kuyrugaEkle(Eleman yeni) {
    if (!kuyrukBos()) 
        son.ileri=yeni;
    else
        bas=yeni;
    son=yeni;
   
}
    Eleman kuyrukSil() {
        Eleman sonuc=bas;
       
        if (!kuyrukBos()) {
            bas=bas.ileri;
            if (bas==null) {
                son=null;
            }
        }
        return sonuc;
    }
    
     public String kuyrukBasi() {
       
        return bas.icerik;
    }

}
