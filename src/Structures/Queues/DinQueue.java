package Structures.Queues;

public class DinQueue implements ICharQ{
    private char q[];
    private int putloc, getloc;

    DinQueue(int size){
        q = new char[size + 1];
        putloc=getloc=0;
    }

    public void put(char ch){
        if (putloc == q.length){
            char t[] = new char[q.length * 2];
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];
            q = t;
        }
        q[putloc++] = ch;
    }

    public char get(){
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }
}
