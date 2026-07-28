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

//        ===Desafio 3===
//
//        while(opModeIsActive()){
//            if(gamepad1.dpad_up){
//                motorNoEn.setPower(1.0);
//            } else if(gamepad1.dpad_down){
//                motorNoEn.setPower(-1.0);
//            } else {
//                motorNoEn.setPower(0.0);
//            }
//            telemetry.addData("Motor Power", motorNoEn.getPower());
//            telemetry.update();
//        }
//
//        ===Desafio 4===
//        while(opModeIsActive()){
//            if(gamepad1.right_bumper && !bumperAnterior){
//                invertido = !invertido;
//            }
//            bumperAnterior = gamepad1.right_bumper;
//
//            if (invertido) {
//                motorNoEn.setPower(-1.0);
//            } else {
//                motorNoEn.setPower(1.0);
//            }
//
//            telemetry.addData("Motor Power", motorNoEn.getPower());
//            telemetry.addData("Invertido", invertido);
//            telemetry.update();
//        }
        }
    }
