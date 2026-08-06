//package org.firstinspires.ftc.teamcode.Servos;
//
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.hardware.Servo;
//
//public class ServoD3 extends OpMode {
//
//    private Servo servoD3;
//
//    @Override
//    public void init() {
//        servoD3 = hardwareMap.get(Servo.class, "servod3");
//    }
//
//    @Override
//    public void loop() {
//        if (gamepad1.b) {
//            servoD3.setPosition(0.2);
//        } else if (gamepad1.x) {
//            servoD3.setPosition(0.5);
//        } else if (gamepad1.y) {
//            servoD3.setPosition(1.0);
//        }
//
//        telemetry.addData("Servo Position", servoD3.getPosition());
//        telemetry.update();
//    }
//}