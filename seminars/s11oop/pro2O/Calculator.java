package org.example.seminars.s11oop.pro2O;

import java.security.InvalidParameterException;

public class Calculator {
    public void cailculate(CalculatorOperation operation){
        if (operation == null){
            throw new InvalidParameterException("Can not perform operation");
        }
        if(operation instanceof Addition){
            Addition addition = (Addition) operation;
            addition.setResult(addition.getLeft() + addition.getRight());
        } else if (operation instanceof Subtraction){
            Subtraction subtraction = (Subtraction) operation;
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
        }
    }
    public void cailculateCorrect(CalculatorOperation operation){

        if(operation instanceof Addition){
            Addition addition = (Addition) operation;
            addition.setResult(addition.getLeft() + addition.getRight());
        } else if (operation instanceof Subtraction){
            Subtraction subtraction = (Subtraction) operation;
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
        } else throw new InvalidParameterException("Can not perform operation");
    }
    public void cailculateSwitch(CalculatorOperation operation){
        switch (operation.getClass().getSimpleName().toString()){
            case "Addition":
                Addition addition = (Addition) operation;
                addition.setResult(addition.getLeft() + addition.getRight());
                break;
            case "Subtraction":
                Subtraction subtraction = (Subtraction) operation;
                subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
                break;
            default: throw new InvalidParameterException("Can not perform operation");

        }

    }
}
