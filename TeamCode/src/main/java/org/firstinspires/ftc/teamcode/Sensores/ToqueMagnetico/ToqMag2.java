package org.firstinspires.ftc.teamcode.Sensores.ToqueMagnetico;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.TouchSensor;

public class ToqMag2 extends OpMode {

    private DcMotor motor;
    private double ticks = 537.7;
    private TouchSensor touch;

    @Override
    public void init() {
        touch = hardwareMap.get(TouchSensor.class, "touch");
        motor = hardwareMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }

    @Override
    public void loop() {
        if(!touch.isPressed()){
            motor.setTargetPosition((int) ticks);
            motor.setPower(0.5);
        } else {
            motor.setPower(0.0);
        }
        telemetry.addData("Posição: ", motor.getCurrentPosition());
        telemetry.update();
    }
}
