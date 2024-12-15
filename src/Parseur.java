public class Parseur {
    private TokenManager tokenManager;

    public Parseur(String chaine) {
        this.tokenManager = new TokenManager(chaine);
    }

    public boolean analyser() {
        return s() && tokenManager.isFin();
    }


    private boolean s() {
        int indexInitial = tokenManager.getIndex();

        if (tokenManager.consommer('b')) {
            if (s() && tokenManager.consommer('b')) {
                return true;
            }
            tokenManager.reinitialiserIndex(indexInitial);
        }

        if (tokenManager.consommer('c')) {
            if (a() && tokenManager.consommer('c')) {
                return true;
            }
            tokenManager.reinitialiserIndex(indexInitial);
        }

        return false;
    }

    private boolean a() {
        int indexInitial = tokenManager.getIndex();


        if (tokenManager.consommer('b')) {
            if (a() && a()) {
                return true;
            }
            tokenManager.reinitialiserIndex(indexInitial);
        }


        if (tokenManager.consommer('c')) {
            if (a() && s() && a() && tokenManager.consommer('b')) {
                return true;
            }
            tokenManager.reinitialiserIndex(indexInitial);
        }


        if (tokenManager.consommer('d') &&
                tokenManager.consommer('c') &&
                tokenManager.consommer('b')) {
            return true;
        }

        return false;
    }
}
