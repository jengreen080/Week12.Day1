public class Calculator {

    private double firstNumber;
    private double secondNumber;

    public Calculator(double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double addIntegers(){
        return this.firstNumber + this.secondNumber;
    }

    public double subtractIntegers(){
        return this.firstNumber - this.secondNumber;
    }

    public double multiplyIntegers(){
        return this.firstNumber * this.secondNumber;
    }

    public double divideNumbers(){
        return this.firstNumber / this.secondNumber;
    }

}
