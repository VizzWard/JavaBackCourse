package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras;

import java.io.IOException;

class O{
    void method()throws IOException {
        throw new IOException("device error");
    }
}
public class Testthrows4{
    public static void main()throws IOException{//declare exception
        O o=new O();
        o.method();

        System.out.println("normal flow...");
    }
}