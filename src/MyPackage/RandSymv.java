package MyPackage;

import java.util.Random;

public class RandSymv {
    public static void randChar(char mas[]){//функция для рандома символов и добавления в массив
        int rand;
        Random r = new Random();
        for (int i = 0; i < mas.length; i++) mas[i] = (char)(r.nextInt(127) + 1);
    }
}
