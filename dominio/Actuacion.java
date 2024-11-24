
package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Actuacion {
    private LocalDate fecha;
    private List<Persona> integrantes;

    public Actuacion(LocalDate fecha) {
        this.fecha = fecha;
        this.integrantes = new ArrayList<>();
    }
    public void setFecha(LocalDate fecha_){
        fecha=fecha_;
    }
    public LocalDate getFecha(){
        return fecha;
    }

    public void annadirParticipante(Persona integrante) {
        this.integrantes.add(integrante);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha de actuación: ").append(fecha.toString()).append("\n");
        for (Persona integrante : integrantes) {
            sb.append("Integrante: ").append(integrante).append("\n");
        }
        return sb.toString();
    }
}
