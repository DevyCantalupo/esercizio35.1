public class Factory {
    public static Shape

    getShape(Enum1 enum1) {
        switch (enum1){
            case CERCHIO : return new Cerchio("cerchio", 0);
            case QUADRATO : return new Quadrato("quadrato", 4);
            case TRIANGOLO : return new Triangulo("triangulo", 3);

            default :
                throw new IllegalArgumentException("Error");
        }
    }
}
