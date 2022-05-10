public class Crypto {

    private String alphabet;



    public Crypto() {
        this.alphabet = "abcdefghijklmnopqrstuvwxyz";
    }

    public void encodage(String mot, String mdp){
        String msg_chiffre = "";
        for (int i = 0; i < mot.length(); i++) {
            int index_modulo = i % mdp.length();
            char matching_letter = mdp.charAt(index_modulo);
            int decalage = alphabet.indexOf(matching_letter);
            int lettre_encodee = alphabet.indexOf(mot.charAt(i)) + decalage;
                if (lettre_encodee > 25){
                    lettre_encodee = lettre_encodee % 25;
                }
            char lettre_crypte = alphabet.charAt(lettre_encodee);

//            System.out.println("i : " + i);
//            System.out.println("lettre à encoder : " + mot.charAt(i));
//            System.out.println("lettre encodée + decalage : " + lettre_encodee);
//            System.out.println("nouvelle lettre = " + lettre_crypte);
//            System.out.println(" % : " + index_modulo);
//            System.out.println("lettre correspondante dans mdp : " + matching_letter);
//            System.out.println("décalage : " + decalage);
//            System.out.println();
//            System.out.println("-------------------------------");
//            System.out.println(lettre_crypte);
//            System.out.println("-------------------------------");
            msg_chiffre += lettre_crypte;
        }
        System.out.println("Le mot à chiffrer est : " + mot);
        System.out.println("La clé de chiffrement est : " + mdp);
        System.out.println("Le mot chiffré est : " + msg_chiffre);
    }

    public String getAlphabet(){
        return this.alphabet;
    }

}


