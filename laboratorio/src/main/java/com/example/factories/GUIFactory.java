package com.example.factories;

import com.example.buttons.Button;
import com.example.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
