package co.edu.sena.ejemplopoo.anidadas.noestaticasacoplamiento;

public class Clase1 implements InterfaceClase1 {

    public InterfaceClase2 getClase2(){
        return new Clase2();
    }


    private class Clase2 implements InterfaceClase2{

        public InterfaceClase3 getClase3(){
            return new Clase3();
        }

        private class Clase3 implements InterfaceClase3{

            public InterfaceClase4 getClase4() {
                return new Clase4();
            }

            private class Clase4 implements InterfaceClase4{


            }

        }



    }

}
