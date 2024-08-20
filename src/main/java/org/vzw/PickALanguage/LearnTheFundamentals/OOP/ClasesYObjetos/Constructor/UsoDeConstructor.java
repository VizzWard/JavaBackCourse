package org.vzw.PickALanguage.LearnTheFundamentals.OOP.ClasesYObjetos.Constructor;

/** 1. Constructor sin parámetros (Constructor por defecto) */
class ClaseConstructor1 {
    int x;

    // Constructor por defecto
    public ClaseConstructor1() {
        this.x = 0; // Inicializa x con 0
    }

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        ClaseConstructor1 obj = new ClaseConstructor1(); // Llama al constructor por defecto
        System.out.println("Valor de x: " + obj.getX()); // Salida: Valor de x: 0
    }
}

/*
 * Un constructor por defecto es útil cuando deseas inicializar tus objetos
 * con valores predeterminados. Sin este constructor, no podrías crear una instancia
 * de la clase sin pasar parámetros si no se define otro constructor.
 */


/** 2. Constructor parametrizado */
class ClaseConstructor2 {
    int x;

    // Constructor parametrizado
    public ClaseConstructor2(int valor) {
        this.x = valor; // Inicializa x con el valor pasado
    }

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        ClaseConstructor2 obj = new ClaseConstructor2(5); // Llama al constructor parametrizado
        System.out.println("Valor de x: " + obj.getX()); // Salida: Valor de x: 5
    }
}

/*
 * Un constructor parametrizado es útil cuando deseas inicializar un objeto
 * con valores específicos en el momento de su creación. Sin un constructor parametrizado,
 * tendrías que crear un objeto con el constructor por defecto y luego establecer los valores manualmente.
 */


/** 3. Sobrecarga de constructores */
class ClaseConstructor3 {
    int x;
    int y;

    // Constructor por defecto
    public ClaseConstructor3() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor parametrizado para un solo parámetro
    public ClaseConstructor3(int x) {
        this.x = x;
        this.y = 0;
    }

    // Constructor parametrizado para dos parámetros
    public ClaseConstructor3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void mostrarValores() {
        System.out.println("x: " + x + ", y: " + y);
    }

    public static void main(String[] args) {
        ClaseConstructor3 obj1 = new ClaseConstructor3(); // Llama al constructor por defecto
        ClaseConstructor3 obj2 = new ClaseConstructor3(5); // Llama al constructor con un parámetro
        ClaseConstructor3 obj3 = new ClaseConstructor3(3, 7); // Llama al constructor con dos parámetros

        obj1.mostrarValores(); // Salida: x: 0, y: 0
        obj2.mostrarValores(); // Salida: x: 5, y: 0
        obj3.mostrarValores(); // Salida: x: 3, y: 7
    }
}

/*
 * La sobrecarga de constructores permite crear múltiples versiones de un constructor
 * con diferentes listas de parámetros. Esto proporciona flexibilidad para crear objetos
 * en diferentes estados iniciales. Sin sobrecarga, estarías limitado a un solo tipo de inicialización.
 */


/** 4. Constructor copy */
class ClaseConstructor4 {
    int x;
    int y;

    // Constructor parametrizado
    public ClaseConstructor4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Constructor copia
    public ClaseConstructor4(ClaseConstructor4 otro) {
        this.x = otro.x;
        this.y = otro.y;
    }

    public void mostrarValores() {
        System.out.println("x: " + x + ", y: " + y);
    }

    public static void main(String[] args) {
        ClaseConstructor4 obj1 = new ClaseConstructor4(5, 10); // Crea un objeto con el constructor parametrizado
        ClaseConstructor4 obj2 = new ClaseConstructor4(obj1); // Crea un nuevo objeto usando el constructor copia

        obj1.mostrarValores(); // Salida: x: 5, y: 10
        obj2.mostrarValores(); // Salida: x: 5, y: 10
    }
}

/*
 * Un constructor copia crea un nuevo objeto duplicando los valores de otro objeto de la misma clase.
 * Sin un constructor copia, podrías copiar manualmente los valores campo por campo, pero esto sería
 * propenso a errores y no tan limpio como usar un constructor copia.
 */

/** 5. Copia sin constructor copy */
class ClaseConstructor5 {
    int x;
    int y;

    // Constructor parametrizado
    public ClaseConstructor5(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ClaseConstructor5 copiar() {
        // Copia manualmente sin usar un constructor copia
        ClaseConstructor5 copia = new ClaseConstructor5(this.x, this.y);
        return copia;
    }

    public void mostrarValores() {
        System.out.println("x: " + x + ", y: " + y);
    }

    public static void main(String[] args) {
        ClaseConstructor5 obj1 = new ClaseConstructor5(5, 10); // Crea un objeto con el constructor parametrizado
        ClaseConstructor5 obj2 = obj1.copiar(); // Crea una copia manualmente

        obj1.mostrarValores(); // Salida: x: 5, y: 10
        obj2.mostrarValores(); // Salida: x: 5, y: 10
    }
}

/*
 * Sin un constructor copia, puedes crear un método que copie manualmente cada campo.
 * Sin embargo, un constructor copia suele ser una solución más elegante y menos propensa
 * a errores, ya que encapsula toda la lógica de copia en un solo lugar.
 */
