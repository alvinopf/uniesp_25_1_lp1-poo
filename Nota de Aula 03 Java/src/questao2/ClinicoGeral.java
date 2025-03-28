package questao2;

public class ClinicoGeral extends Medico {

    private boolean atendeEmCasa;

    public boolean isAtendeEmCasa() {
        return atendeEmCasa;
    }

    public void setAtendeEmCasa(boolean atendeEmCasa) {
        this.atendeEmCasa = atendeEmCasa;
    }

    public void receitar(){}
}

