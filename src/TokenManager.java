public class TokenManager {
    String chaine;
    int index;


    public TokenManager(String chaine) {
        this.chaine = chaine;
        this.index = 0;
    }


    public boolean consommer(char caractere) {
        if (index < chaine.length() && chaine.charAt(index) == caractere) {
            index++;
            return true;
        }
        return false;
    }


    public boolean isFin() {
        return index == chaine.length();
    }


    public int getIndex() {
        return index;
    }

    public void reinitialiserIndex(int nouvelIndex) {
        this.index = nouvelIndex;
    }
}
