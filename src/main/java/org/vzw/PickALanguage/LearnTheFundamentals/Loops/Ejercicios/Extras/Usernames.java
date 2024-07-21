package org.vzw.PickALanguage.LearnTheFundamentals.Loops.Ejercicios.Extras;

public class Usernames {

    //Metodo get para Usuario
    public static String getUsername(int index) {
        if (index >= 0 && index < USERS.length) {
            return USERS[index][0];
        } else {
            return null;
        }
    }

    //Metodo get para contraseña
    public static String getPassword(int index) {
        if (index >= 0 && index < USERS.length) {
            return USERS[index][1];
        } else {
            return null;
        }
    }

    //Metodo get para obtener tamaño del array
    public static int getSize (){
        return  USERS.length;
    }

    private static final String[][] USERS = {
            {"j0hn_d03", "P@ssw0rd123"},
            {"m4ry.j4n3", "S3cur3P@ss!"},
            {"4l1ce_w0nd3r", "W0nd3rL4nd!"},
            {"b0b_m4rl3y", "R3ggaeRul3s!"},
            {"ch4rli3_br0wn", "Peanut5@123"},
            {"d4v3_groh1", "N1rvan@R0cks"},
            {"3v3lyn_st0ne", "St0neH3art!"},
            {"fr4nk_castl3", "Pun1sh3r!234"},
            {"g1n4_l1n3tt1", "C0m3dyG0ld!"},
            {"h4rry_p0tt3r", "H0gwarts!234"},
            {"1nd1ana_j0nes", "Tr3asur3Hunt!"},
            {"j4n3_d03", "P@sswordS@f3"},
            {"k3v1n_m1tchn3ll", "S3cur3K3v1n"},
            {"l1s4_simps0n", "S@x0ph0n3L0v3"},
            {"m1k3_j0rdan", "B4sk3tb@llG0d"},
            {"n4ncy_dr3w", "Myst3ryS0lv3r"},
            {"0l1v3r_tw1st", "Pl34s3Sir123"},
            {"p4ul4_abdul", "D4nc1ngQu33n"},
            {"qu1nn_f4br4y", "Ch33rL3ad3r!"},
            {"r4ch3l_gr33n", "C0ff33L0v3r!"}
    };
}
