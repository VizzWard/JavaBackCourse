package org.vzw.PickALanguage.LearnTheFundamentals.ExceptionHandling.Extras;

import java.io.IOException;

class N{
    void method()throws IOException {
        System.out.println("device operation performed");
    }
}
public class Testthrows3{
    public static void main()throws IOException{//declare exception
        N n = new N();
        n.method();

        System.out.println("normal flow...");
    }
}
