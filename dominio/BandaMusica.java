package dominio;

import java.util.ArrayList;
import java.util.List;

public class BandaMusica {
    private String nombreBanda;
    private List<Actuacion> actuaciones;

    public BandaMusica(String nombreBanda) {
        this.nombreBanda = nombreBanda;
        this.actuaciones = new ArrayList<>();
    }
    public void SetNombreBanda(String nombreBanda_){
        nombreBanda=nombreBanda_;
    }
    public String getNombreBanda(){
        return nombreBanda;
    }
    public void annadirActuacion(Actuacion actuacion) {
        this.actuaciones.add(actuacion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombreBanda).append("\n");
        for (Actuacion actuacion : actuaciones) {
            sb.append("Actacion: ").append(actuacion).append("\n");
        }
        return sb.toString();
    }
}
