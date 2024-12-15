public class Main {
    public static void main(String[] args) {
        String[] chainesDeTest = {
                "cdcbc", "bcdcbcb", "cbcdcbcdcbc", "ccdcdbcdcbcdbcr", "cdcbbb", "cdcb", ""
        };

        for (String chaine : chainesDeTest) {
            Parseur parseur = new Parseur(chaine);
            boolean resultat = parseur.analyser();
            System.out.println("la chaine : " + chaine + " est " + (resultat ? "Valide" : "Invalide"));
        }
    }
}
