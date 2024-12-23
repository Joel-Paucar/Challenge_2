import java.util.Date;

public record Moneda(String valorInicial,
                     String valorFinal,
                     String monedaBase,
                     String monedaObjetivo,
                     Date date) {

    public String toString(){
        return "(" + this.date + ") Se convirtio " + this.valorInicial + " de la moneda '" + this.monedaBase
                + "' a " + this.valorFinal + " de la moneda '" + this.monedaObjetivo + "'.";
    }
}
