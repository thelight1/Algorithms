package org.thelight1;

public class P02_Singleton {
    private static volatile P02_Singleton instance;

    private P02_Singleton() {
    }

    public P02_Singleton getInstance() {
        if (instance == null) {
            synchronized (P02_Singleton.class) {
                if (instance == null) {
                    instance = new P02_Singleton();
                }
            }
        }
        return instance;
    }
}
