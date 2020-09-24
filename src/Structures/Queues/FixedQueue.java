package Structures.Queues;

public class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    FixedQueue(int size){//конструктор очереди
        q = new char[size];
        putloc=getloc=0;
    }

    FixedQueue(FixedQueue ob){//конструктор очереди на основе уже существующего объекта
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        for(int i=getloc+1; i <= putloc; i++)
            q [ i ] = ob.q [i] ;
    }

    FixedQueue(char a[]) {//конструктор, создающий очередь на основе массива символов
        putloc = 0;
        getloc = 0;
        q = new char[a.length+1];//лина очереди должна быть на 1 больше длины массива
        for(int i = 0; i < a.length; i++) put(a[i]);
    }

    public void put(char ch){//помещение в очередь символа
        if (putloc == q.length){
            System.out.println("Очередь заполнена");
            return;
        }
        else{
            q[putloc++] = ch;
        }
    }

    public char get() {//извлечение из очереди
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }
}
