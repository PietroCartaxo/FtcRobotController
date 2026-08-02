//Reverse e Forward com botões :
//Pressionar um botão que o ligue para frente (set power positivo) e outro que o ligue para trás(set power negativo);
//Treina: Set power

package org.firstinspires.ftc.teamcode.Motores.SemEncoder;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp()
public class MotorNoEn3 extends LinearOpMode {
    private DcMotor motorNoEn3;

    @Override
    public void runOpMode() throws InterruptedException {
        motorNoEn3 = hardwareMap.get(DcMotor.class, "MotorEn");

        waitForStart();

        while(opModeIsActive()){
            if(gamepad1.dpad_up){
                motorNoEn3.setPower(1.0);
            } else if(gamepad1.dpad_down){
                motorNoEn3.setPower(-1.0);
            } else {
                motorNoEn3.setPower(0.0);
            }
            telemetry.addData("Motor Power", motorNoEn3.getPower());
            telemetry.update();
        }
    }
}
