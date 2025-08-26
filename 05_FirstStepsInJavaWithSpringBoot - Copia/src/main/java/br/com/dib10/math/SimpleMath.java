package br.com.dib10.math;

import br.com.dib10.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class SimpleMath {


    public Double sum(Double numberOne,Double numberTwo)  {

        return  numberOne + numberTwo;
    }
    public Double subtraction (Double numberOne,Double numberTwo)  {

        return  numberOne - numberTwo;
    }
    public Double multiplication (Double numberOne,Double numberTwo)  {

        return  numberOne * numberTwo;
    }
    public Double division (Double numberOne,Double numberTwo)  {

        return  numberOne / numberTwo;
    }
    public Double squareroot (Double numberOne)  {

        return Math.sqrt(numberOne);
    }


}
