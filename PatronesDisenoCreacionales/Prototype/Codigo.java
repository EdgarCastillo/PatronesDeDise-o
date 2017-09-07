public abstract class Camiseta {
        private String nombre;
        private Integer talla;
        private String color;
        private String manga;
        private String estampado;
        private Object material;

        public Camiseta (String nombre,Integer talla, String color, String manga, String estampado, Object material){
                this.nombre = nombre;
                this.talla = talla;
                this.color = color;
                this.manga = manga;
                this.estampado = estampado;
                this.material = material;
        }
        public abstract Camiseta clone();
        /*
         * Todos los getter y los setter.
        */
}
public class CamisetaMCorta extends Camiseta{
        public CamisetaMCorta(Integer talla, String color, String estampado){
                this.nombre = “Prototipo”;
                this.talla = talla;
                this.color = color;
                this.manga = “Corta”;
                this.estampado = estampado;
                this.material = new Lana();
        }
        public Camiseta clone(){
                return new CamisetaMCorta(this.talla, this.color, this.estampado);
        }
}


public class CamisetaMLarga extends Camiseta{
        public CamisetaMLarga(Integer talla, String color, String estampado){
                this.nombre = “Prototipo”;
                this.talla = talla;
                this.color = color;
                this.manga = “Larga”;
                this.estampado = estampado;
                this.material = new Lana();
        }
        public Camiseta clone(){
                return new CamisetaMLarga(this.talla, this.color, this.estampado);
        }
}
public static void main(String[] args){
// Recibiremos en los argumentos los estampados de las camisetas

// Creamos los prototipos
Camiseta prototipoMCorta = new CamisetaMCorta(40, “blanco”, “Logotipo”);
Camiseta prototipoMLarga = new prototipoMLarga(40, “blanco”, “Logotipo”);

// Almacenamos las camisetas disponibles
ArrayList camisetas = new ArrayList();

for(int i = 0; i<args.length;i++){
                Camiseta cc =  prototipoMCorta.clone();
                cc.setEstampado(args[i]);
 
                for(int j = 35; j<60; j++){
                        Camiseta cc_talla = cc.clone();
                        cc_talla.setTalla(j);
                        camisetas.add(cc_talla);
                }
                
 
                Camiseta cl =  prototipoMLarga.clone();
                cl.setEstampado(args[i]);
                
                for(int j = 35; j<60; j++){
                        Camiseta cl_talla = cl.clone();
                        cl_talla.setTalla(j);
                        camisetas.add(cl_talla);
                }               
        }
}
