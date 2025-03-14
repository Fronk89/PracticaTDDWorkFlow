
class MaquinaDeCafe {
   Cafetera cafe;
   Vaso vasosPequenos;
   Vaso vasosMedianos;
   Vaso vasosGrandes;
   Azucarero azucar;

    public MaquinaDeCafe(Cafetera cafe, Vaso vasosPequenos, Vaso vasosMedianos, Vaso vasosGrandes, Azucarero azucar) {
        this.cafe = cafe;
        this.vasosPequenos = vasosPequenos;
        this.vasosMedianos = vasosMedianos;
        this.vasosGrandes = vasosGrandes;
        this.azucar = azucar;
    }



    public Vaso getTipoVaso(String tipoDeVaso) {
        return switch (tipoDeVaso.toLowerCase()) {
            case "pequeno" -> vasosPequenos;
            case "mediano" -> vasosMedianos;
            case "grande" -> vasosGrandes;
            default -> null;
        };
    }

    public boolean getVasoDeCafe(String tipoDeVaso, int cantidadDeVasos, int cantidadDeAzucar) {
        Vaso vaso = getTipoVaso(tipoDeVaso);
        if (vaso == null || !vaso.hasVasos(cantidadDeVasos) || !azucar.hasAzucar(cantidadDeAzucar)) {
            return false;
        }

        // Determinar la cantidad de café según el tamaño del vaso
        int cafeNecesario = switch (tipoDeVaso.toLowerCase()) {
            case "pequeno" -> 10 * cantidadDeVasos;
            case "mediano" -> 20 * cantidadDeVasos;
            case "grande" -> 30 * cantidadDeVasos;
            default -> 0;
        };

        if (!cafe.hasCafe(cafeNecesario)) {
            return false;
        }
        
        vaso.giveVasos(cantidadDeVasos);
        cafe.giveCafe(cafeNecesario);
        azucar.giveAzucar(cantidadDeAzucar);

        return true;
    }
}




