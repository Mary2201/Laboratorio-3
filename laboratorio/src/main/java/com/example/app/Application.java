package com.example.app;

import com.example.buttons.Button;
import com.example.checkboxes.Checkbox;
import com.example.factories.GUIFactory; 

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
