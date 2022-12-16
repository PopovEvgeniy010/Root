package ru.netology.javaQA;

public
class SqrtService {
    public
    int calcSqrt(int x, int y) {
        int rezult = 0;
        for (int i = 0; i <= 99; i++) {
            if ((i * i >= x) & (i * i <= y)) {
                rezult = rezult + 1 ;
                //System.out.println(i);
            }
        }
        return rezult ;
    }
}