package com.example.system.testmvp;

public interface Contract {

    interface View {
        String getField();
        void showText(String text);
        void showToast(String message);
    }

    interface Presenter {
        void buttonClicked();
    }

    interface Model {
        String getData(String text);
    }
}
