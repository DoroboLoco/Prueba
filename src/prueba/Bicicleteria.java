
package prueba;

import java.util.List;


public class Bicicleteria {
  List<Bicicleta>bicicletas;
  float ganancia;
  int cantidadDeVentas;
  
  Bicicleteria(){
  }
  List<Bicicleta> getBicicletas(){
  return this.bicicletas;
  }

  void setBicicletas(List<Bicicleta> bicicletas) {
  this.bicicletas = bicicletas;
  }

  float getGanancias() {
  return ganancia;
    }

  void setGanancias(float ganancias) {
  this.ganancia = ganancias;
    }

    public int getCantidadDeVentas() {
        return cantidadDeVentas;
    }

    public void setCantidadDeVentas(int cantidadDeVentas) {
        this.cantidadDeVentas = cantidadDeVentas;
    }
  
  void addBicicleta(Bicicleta nuevaBici){
  bicicletas.add(nuevaBici);
  }

void venderBicicleta(Bicicleta bicicleta){
cantidadDeVentas++;
 ganancia=ganancia+bicicleta.getPrecio();
bicicletas.remove(bicicleta);
}

Bicicleta buscarBicicleta(String nroDeSerie){
for(int i=0;i<=bicicletas.size();i++){
 if (nroDeSerie==bicicletas.get(i).nroDeSerie){
     return bicicletas.get(i);
}
} 
    return null;
    }

}
