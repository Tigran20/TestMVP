package com.example.system.testmvp;

public class Presenter implements Contract.Presenter {

    Contract.View view;
    Contract.Model model;

    public Presenter(Contract.View view) {
        this.view = view;
        this.model = new Model();
    }

    @Override
    public void buttonClicked() {
        String text = view.getField();
        view.showText(text);
    }
}
