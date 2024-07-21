package org.vzw.PickALanguage.LearnTheFundamentals.Loops.Ejercicios.Extras;

public class Productos {
    //Metodo get para Productos
    public static String getProduct(int index) {
        if (index >= 0 && index < PRODUCTS.length) {
            return PRODUCTS[index][0];
        } else {
            return null;
        }
    }

    //Metodo get para Precio
    public static String getPrice(int index) {
        if (index >= 0 && index < PRODUCTS.length) {
            return PRODUCTS[index][1];
        } else {
            return null;
        }
    }

    //Metodo get para obtener tamaño del array
    public static int getSize (){
        return  PRODUCTS.length;
    }

    private static final String[][] PRODUCTS = {
            {"Manzana", "0.50"},
            {"Pan", "1.00"},
            {"Leche", "0.80"},
            {"Huevos", "2.50"},
            {"Tomate", "1.20"},
            {"Queso", "3.00"},
            {"Arroz", "2.00"},
            {"Pollo", "5.00"},
            {"Pasta", "1.50"},
            {"Jugo", "1.00"},
            {"Cereal", "3.50"},
            {"Azúcar", "2.20"},
            {"Sal", "0.60"},
            {"Aceite", "4.00"},
            {"Harina", "1.80"},
            {"Mantequilla", "2.70"},
            {"Yogur", "1.90"},
            {"Miel", "3.80"},
            {"Papel Higiénico", "1.70"},
            {"Galletas", "2.30"},
            {"Sopa", "1.40"},
            {"Pechuga de Pavo", "6.00"},
            {"Salsa de Tomate", "2.50"},
            {"Leche Condensada", "3.20"},
            {"Café", "4.50"},
            {"Té", "2.80"},
            {"Cereal de Maíz", "3.00"},
            {"Garbanzos", "2.10"},
            {"Sardinas", "2.90"},
            {"Manteca", "2.40"},
            {"Jugo de Naranja", "1.80"},
            {"Chocolates", "2.70"}
    };
}
