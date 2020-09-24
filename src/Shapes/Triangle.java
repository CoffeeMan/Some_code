package Shapes;

public class Triangle extends TwoDShape {
    private String style;

    // Конструктор по умолчанию
    Triangle() {
        super();
        style = "none";
    }

    // Конструктор класса Triangle
    Triangle(String s, double w, double h) {
        super(w, h, "треугольник");
        style = s;
    }

    // Конструктор с одним аргументом для построения треугольника
    Triangle(double х) {
        super(х, "треугольник"); // вызов конструктора суперкласса
        style = "закрашенный";
    }

    // Создание одного объекта на основе другого
    Triangle(Triangle ob) {
        super(ob); // передача объекта конструктору класса TwoDShape
        style = ob.style;
    }

    // Переопределение метода area() для класса Triangle
    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }

}
