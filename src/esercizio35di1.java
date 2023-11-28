public class esercizio35di1 {
        public static void main(String[] args) {
            Shape cerchio = Factory.getShape(Enum1.CERCHIO);
            cerchio.draw();
            Shape quadrato = Factory.getShape(Enum1.QUADRATO);
            quadrato.draw();
            Shape triangolo = Factory.getShape(Enum1.TRIANGOLO);
            triangolo.draw();
        }
    }


