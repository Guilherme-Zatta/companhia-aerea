// Classe para representar um assento de primeira classe
class AssentoPrimeiraClasse implements Assento {
    private boolean ocupado;

    public boolean reservar() {
        if (!ocupado) {
            ocupado = true;
            return true;
        } else {
            return false;
        }
    }
}