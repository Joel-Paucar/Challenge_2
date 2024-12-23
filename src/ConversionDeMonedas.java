import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ConversionDeMonedas {
    public Moneda Conversion(){
        ConversionApi api = new ConversionApi();
        ConversionGson gson = new ConversionGson();
        Scanner scanner = new Scanner(System.in);
        Moneda moneda = null;
        String monedaBase;
        String monedaObjetivo;
        try {
            System.out.println("Seleccione la moneda base: ");
            int valor1 = Integer.parseInt(scanner.nextLine());
            switch (valor1){
                case 1 ->{monedaBase = "EUR";}
                case 2 ->{monedaBase = "JPY";}
                case 3 ->{monedaBase = "MXN";}
                case 4 ->{monedaBase = "PEN";}
                case 5 ->{monedaBase = "QAR";}
                case 6 ->{monedaBase = "YER";}
                case 7 ->{monedaBase = "USD";}
                default -> {throw new NumberFormatException();}
            }
            System.out.println("Seleccione la moneda objetivo: ");
            int valor2 = Integer.parseInt(scanner.nextLine());
            switch (valor2){
                case 1 ->{monedaObjetivo = "EUR";}
                case 2 ->{monedaObjetivo = "JPY";}
                case 3 ->{monedaObjetivo = "MXN";}
                case 4 ->{monedaObjetivo = "PEN";}
                case 5 ->{monedaObjetivo = "QAR";}
                case 6 ->{monedaObjetivo = "YER";}
                case 7 ->{monedaObjetivo = "USD";}
                default -> {throw new NumberFormatException();}
            }
            System.out.println("Ingrese el monto a convertir: ");
            double monto = Double.parseDouble(scanner.nextLine());

            String json = api.LlamarApi(monedaBase, monedaObjetivo, monto);
            MonedaExchange monedaExchange = gson.LlamarGson(json);
            moneda = new Moneda(String.valueOf(monto),
                    monedaExchange.conversion_result(),
                    monedaExchange.base_code(),
                    monedaExchange.target_code(),
                    String.valueOf(LocalDateTime.now()));
        }catch (NumberFormatException e){
            System.out.println("Por favor ingrese datos validos");
            System.out.println("");
        }catch (Exception e){
            throw  new RuntimeException();
        }
        return moneda;
    }

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ArrayList<Moneda> monedas = new ArrayList<>();
        while (true){
            System.out.println("***********************************************");
            System.out.println("1) EUR");
            System.out.println("2) JPY");
            System.out.println("3) MXN");
            System.out.println("4) PEN");
            System.out.println("5) QAR");
            System.out.println("6) YER");
            System.out.println("7) USD");
            System.out.println("************************************************");
            try {
                System.out.println("Para convertir moneda -> 1");
                System.out.println("Para ver conversiones anteriores -> 2");
                System.out.println("Para salir -> 3");
                System.out.println("Elija una opcion: ");
                String opcion = lectura.nextLine();
                if (opcion.equalsIgnoreCase("3")){
                    break;
                }
                if (Integer.parseInt(opcion)<1 | Integer.parseInt(opcion)>3){
                    throw new NumberFormatException();
                }
                if (opcion.equals("1")){
                    ConversionDeMonedas c = new ConversionDeMonedas();
                    Moneda moneda = c.Conversion();
                    if (moneda!=null){
                        monedas.add(moneda);
                        System.out.println(moneda);
                    }
                    continue;
                }
                if (opcion.equals("2")){
                    for (Moneda item: monedas){
                        System.out.println(item);
                    }
                }
            }catch (NumberFormatException e){
                System.out.println("Por favor ingrese datos validos");
                System.out.println("");
            } catch (Exception e){
                throw new RuntimeException(e);
            }
        }
        System.out.println("Finalizo la ejecución del programa!");
    }
}