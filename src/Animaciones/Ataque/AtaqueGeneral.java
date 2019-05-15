package Animaciones.Ataque;

public abstract class AtaqueGeneral {
    private String animacionAtaque;

    public AtaqueGeneral(String animacion){
        animacionAtaque = animacion;
    }

    public String getAnimacionAtaque() {
        return animacionAtaque;
    }
}
