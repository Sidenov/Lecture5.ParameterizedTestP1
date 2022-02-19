package ru.netology.sqr;

public class SQRService {
    public long sqrCalculate(long lower, long upper) {
        int amount = 0;
        for (long i = 10; i <= 99; i++)
            if (i * i >= lower & i * i <= upper) {
                amount++;
            }
        return amount;
    }
}
