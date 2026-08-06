//Ligar o motor em exatamente uma rotação :
//Mudando o modo do motor e usando suas funções;
//Treina: Modo RUN_TO_POSITION

package org.firstinspires.ftc.teamcode.Motores.ComEncoder;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;



@TeleOp()
public class MotorEn2 extends OpMode {
    private DcMotor motorEn2;
    private double ticks = 537.7;
    private double newTarget;

    @Override
    public void init() {
        motorEn2 = hardwareMap.get(DcMotor.class, "MotorEn");
        motorEn2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorEn2.setTargetPosition(0);
        motorEn2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
}
    @Override
    public void loop() {
        if(gamepad1.a){
            motorEn2.setTargetPosition((int)ticks*2);
            motorEn2.setPower(0.5);
        }else if (gamepad1.y){
            motorEn2.setTargetPosition((int)ticks*5);
            motorEn2.setPower(0.5);
        }else if(gamepad1.b){
            motorEn2.setTargetPosition((int)ticks*10);
            motorEn2.setPower(0.5);
        }
        telemetry.addData("Target Pos", motorEn2.getTargetPosition());
        telemetry.addData("Current Pos", motorEn2.getCurrentPosition());
        telemetry.update();
    }
}