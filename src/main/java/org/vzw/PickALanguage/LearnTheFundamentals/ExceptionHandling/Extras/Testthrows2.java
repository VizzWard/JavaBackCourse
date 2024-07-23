package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras;

import java.io.IOException;

class M{
    void method()throws IOException{ //throws es para avisar de que el metodo va o puede lanzar una excepcion.
        throw new IOException("device error"); //throw es para lanzar la excepcion
    }
}

public class Testthrows2{
    public static void main(){
        try{
            M m=new M();
            m.method();
        }catch(Exception e){System.out.println("exception handled");}

        System.out.println("normal flow...");
    }

}
