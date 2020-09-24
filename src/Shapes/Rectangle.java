package Shapes;


class Rectangle extends TwoDShape {
    // Конструктор по умолчанию
    Rectangle() {
        super();
    }

    // Конструктор класса Rectangle
    Rectangle(double w, double h) {
        super(w, h, "прямоугольник");
    }

    // Создание квадрата
    Rectangle(double х) {
        super(х, "прямоугольник");
    }

    // Создание одного объекта на основе другого
    Rectangle(Rectangle ob) {
        super(ob); // передача объекта конструктору класса TwoDShape
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) return true;
        return false;
    }

    double area() {
        return getWidth() * getHeight();
    }
}


