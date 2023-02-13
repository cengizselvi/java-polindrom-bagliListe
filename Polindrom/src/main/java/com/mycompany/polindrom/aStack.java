
package com.mycompany.polindrom;



public class aStack {

    Eleman top;
    
    public aStack() {
        top=null;
    }
     public boolean isEmpty() {
        return top == null;//yığıt boş mu değil mi değerini döndürür
    }
     
     void push(Eleman yeni) {
   
       yeni.ileri=top;
       top=yeni;
         
  
     }
     public  String pop() {

          Eleman tmp = top;//yığıtta en üstteki değeri yığıttan siler ve geriye döndürür
          if (!isEmpty()) 
            top = top.ileri;
           return tmp.icerik;
      
    }
    
    public String peek() {
       // System.out.println(top.icerik);
        return top.icerik;//Yığıtın en üstteki değerini döndürür
        
    }
}