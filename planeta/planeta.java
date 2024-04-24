package planeta;

public class planeta {
    String nombre;
    int cantidad_satelites;
    float masa;
    float volumen;
    float diametro;
    float distancia;
    String observable;


public planeta(String nombre, int cantidad_satelites, int masa, int volumen, int diametro, int distancia,
            String observable) {
        this.nombre = nombre;
        this.cantidad_satelites = cantidad_satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distancia = distancia;
        this.observable = observable;
    }

void calcular_densidad_planeta(){
    float densidad;
    densidad=masa/volumen;
    System.out.println("La densidad del planeta es de: "+densidad);
}

void imprimir(){
    System.out.println("Nombre = "+nombre);
    System.out.println("Cantidad de satelites = "+cantidad_satelites);
    System.out.println("Masa = "+masa);
    System.out.println("Volumen = "+volumen);
    System.out.println("Diametro = "+diametro);
    System.out.println("Distancia = "+distancia);
    System.out.println("Observable = "+observable);

}

public static void main(String[] args) {
    planeta P1 = new planeta("Tierra", 1, 5973624, 10832112, 12742, 150000000, "si");
    System.out.println("Los datos del del planeta 1 son los siguientes: ");
    P1.imprimir();
    P1.calcular_densidad_planeta();
    planeta P2 = new planeta("Jupiter", 1, 189927, 1431315, 139820, 750000000, "si");
    System.out.println("Los datos del del planeta 2 son los siguientes: ");
    P2.imprimir();
}



}
