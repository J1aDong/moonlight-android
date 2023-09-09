package com.limelight.ui;

import com.limelight.binding.input.ControllerHandler;
import com.limelight.binding.input.GameInputDevice;

public interface GameGestures {
    void toggleKeyboard();

    void showGameMenu(ControllerHandler.InputDeviceContext device);
}
