// Classe para representar um assento econômico
class AssentoEconomico implements Assento {
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