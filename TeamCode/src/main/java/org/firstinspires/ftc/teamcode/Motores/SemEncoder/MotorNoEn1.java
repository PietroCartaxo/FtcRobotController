//Ligar e desligar motor com botões :
//Pressionar A (botão booleano) para ligar, e B para desligar;
//Treina: Set pow

package org.firstinspires.ftc.teamcode.Motores.SemEncoder;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp()
public class MotorNoEn1 extends LinearOpMode {
    private DcMotor motorNoEn1;

    boolean invertido = false;
    boolean bumperAnterior = false;

    @Override
    public void runOpMode() {
        motorNoEn1 = hardwareMap.get(DcMotor.class, "MotorEn");

        waitForStart();

        while (opModeIsActive()) {
            if (gamepad1.a) {
                motorNoEn1.setPower(1.0);
            } else if(gamepad1.b){
                motorNoEn1.setPower(0.0);
            }
            telemetry.addData("Motor Power", motorNoEn1.getPower());
            telemetry.update();
        }
    }
}
