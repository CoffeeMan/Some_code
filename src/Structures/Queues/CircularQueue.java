package Structures.Queues;

public class CircularQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    CircularQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    public void put(char ch) {
    // Очередь считается полной, если индекс putloc на единицу
    // меньше индекса getloc или если индекс putloc указывает
    // на конец массива, а индекс getloc - на его начало
        if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        q[putloc++] = ch;
        if (putloc == q.length) putloc = 0; // перейти в начало массива
    }

    // Извлечение символа из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        char ch = q[getloc++];
        if (getloc == q.length) getloc = 0; // вернуться в начало очереди
        return q[getloc];
        }
    }



