package com.example.system.testmvp.model;

import com.example.system.testmvp.Contract;

public class Model implements Contract.Model {

    @Override
    public String getData(String data) {
        return "Saved!";
    }
}
