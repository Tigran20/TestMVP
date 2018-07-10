package com.example.system.testmvp;

public interface Contract {

    interface View {
        String getField();
        void showText(String text);
    }

    interface Presenter {
        void buttonClicked();
    }

    interface Model {
    }
}
