package Task_07.Ex_07.calculator;

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new FileLogger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
