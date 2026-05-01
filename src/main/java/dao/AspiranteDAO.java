//<!-- CAMILO ANDRES CAMARGO GOMEZ -->

package dao;

import java.util.ArrayList;
import java.util.List;
import dto.Aspirante;

public class AspiranteDAO {

    public static List<Aspirante> lista = new ArrayList<>();

    public void guardar(Aspirante a){
        lista.add(a);
    }

    public List<Aspirante> listar(){
        return lista;
    }

    // Método existe que recibe long y compara con ==
    public boolean existe(long identificacion) {
        for (Aspirante a : lista) {
            if (a.getIdentificacion() == identificacion) {
                return true;
            }
        }
        return false;
    }
}