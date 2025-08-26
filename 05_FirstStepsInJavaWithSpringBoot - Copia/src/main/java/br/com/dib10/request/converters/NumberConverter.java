package br.com.dib10.request.converters;

import br.com.dib10.exception.UnsupportedMathOperationException;

public class NumberConverter {

    public static  Double convertToDouble(String strNumber)  throws IllegalArgumentException {
        if(strNumber ==null || strNumber.isEmpty())throw new UnsupportedMathOperationException("Please set a numeric value") ;


        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String strNumber) {
        if(strNumber ==null || strNumber.isEmpty()) return false; //verifica se é nulo ou vazio

        String number = strNumber.replace(",", ".");
        return  (number.matches("[-+]?[0-9]*\\.?[0-9]+")) ;
    }
}
