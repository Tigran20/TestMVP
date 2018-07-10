package com.example.system.testmvp.presenter;

import com.example.system.testmvp.Contract;
import com.example.system.testmvp.model.Model;

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
        String toast = model.getData(text);
        view.showToast(toast);
        view.showText(text);
    }
}
