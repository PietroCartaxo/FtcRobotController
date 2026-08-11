package org.firstinspires.ftc.teamcode.Sensores.Cor;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Cor3 extends OpMode {

    private ColorSensor sencor;
    private DcMotor motor1;
    private DcMotor motor2;

    @Override
    public void init() {
        sencor = hardwareMap.get(ColorSensor.class, "sencor");
        motor1 = hardwareMap.get(DcMotor.class, "motor1");
        motor2 = hardwareMap.get(DcMotor.class, "motor2");
    }

    @Override
    public void loop() {
        // Vê qual cor está mais intensa
        if (sencor.blue() > sencor.red()) {
            motor1.setPower(0.5); // Liga o motor 1 se for azul
            motor2.setPower(0.0); // Desliga o motor 2
            telemetry.addData("Detectado", "Azul - Motor 1 Ligado");
        } else if (sencor.red() > sencor.blue()) {
            motor1.setPower(0.0); // Desliga o motor 1
            motor2.setPower(0.5); // Liga o motor 2 se for vermelho
            telemetry.addData("Detectado", "Vermelho - Motor 2 Ligado");
        } else {
            motor1.setPower(0.0);
            motor2.setPower(0.0);
            telemetry.addData("Detectado", "Nenhuma cor predominante");
        }

        telemetry.update();
    }
}