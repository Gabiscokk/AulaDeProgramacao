package aula3.exemploDecimalF0rmat;

import java.text.DecimalFormat;

public class ExemploDecimalFormat {
    public static void main (String[] args) {
        double numeroUM = 21324324.4567;
        double numeroDOIS = 234.44;
        double numeroTRES = (float) 1/2;
        // # -> numero opcional
        // , -> separados de milhar
        // 0 -> número obrigatório
        // . -> separados decimal
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        System.out.println(df.format(numeroUM));
        System.out.println(df.format(numeroDOIS));
        System.out.println(df.format(numeroTRES));

    }
}
