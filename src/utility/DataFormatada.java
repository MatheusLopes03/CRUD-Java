package utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFormatada {

    public static String ConverterDate (Date data){

         SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy hh:mm");

         return formato.format(data);
    }
}
