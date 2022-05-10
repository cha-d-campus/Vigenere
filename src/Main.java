public class Main {
    public static void main(String[] args) {
        Crypto encoder = new Crypto();
        String mdp = "deg";
        String message = "toto";

        System.out.println("\n---------- VERIFICATION DE NOTRE FONCTION -----------");
        System.out.println("Mot à chiffrer : " + message);
        System.out.println("Clé de chiffrement : " + mdp);
        System.out.println("\n--------------------- INDEX MOT ----------------------");
        System.out.println("Index de la lettre \"T\" dans l'alphabet : " + encoder.getAlphabet().indexOf("t"));
        System.out.println("Index de la lettre \"O\" dans l'alphabet : " + encoder.getAlphabet().indexOf("o"));
        System.out.println("--------------------- INDEX MDP ----------------------");
        System.out.println("Index de la lettre \"D\" dans l'alphabet : " + encoder.getAlphabet().indexOf("d"));
        System.out.println("Index de la lettre \"E\" dans l'alphabet : " + encoder.getAlphabet().indexOf("e"));
        System.out.println("Index de la lettre \"G\" dans l'alphabet : " + encoder.getAlphabet().indexOf("g"));
        System.out.println("----------------- INDEX MOT ENCODE ------------------");
        int calc1 = encoder.getAlphabet().indexOf("t") + encoder.getAlphabet().indexOf("d");
        int calc2 = encoder.getAlphabet().indexOf("o") + encoder.getAlphabet().indexOf("e");
        int calc3 = encoder.getAlphabet().indexOf("t") + encoder.getAlphabet().indexOf("g");
        int calc4 = encoder.getAlphabet().indexOf("o") + encoder.getAlphabet().indexOf("d");
        System.out.println(encoder.getAlphabet().indexOf("t") + " + " + encoder.getAlphabet().indexOf("d") + " = " + calc1);
        System.out.println(encoder.getAlphabet().indexOf("o") + " + " + encoder.getAlphabet().indexOf("e") + " = " + calc2);
        System.out.println(encoder.getAlphabet().indexOf("t") + " + " + encoder.getAlphabet().indexOf("g") + " = " + calc3);
        System.out.println(encoder.getAlphabet().indexOf("o") + " + " + encoder.getAlphabet().indexOf("d") + " = " + calc4);
        System.out.println("-> Mot chiffré : " + encoder.getAlphabet().charAt(22) + encoder.getAlphabet().charAt(18) + encoder.getAlphabet().charAt(25) + encoder.getAlphabet().charAt(17));

        System.out.println("\n--------------- APPEL DE NOTRE FONCTION --------------");
        encoder.encodage(message, mdp);
    }


}