//package org.firstinspires.ftc.teamcode.Servos;
//
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.hardware.Servo;
//
//public class ServoD2 extends OpMode {
//
//    private boolean estadoAnt = false;
//    private Servo servoD2;
//
//    @Override
//    public void init() {
//        servoD2 = hardwareMap.get(Servo.class, "servod2");
//    }
//
//    @Override
//    public void loop() {
//
//        boolean apenasPress = gamepad1.a && !estadoAnt;
//        if (apenasPress) {
//            if (servoD2.getPosition() == 0.0) {
//                servoD2.setPosition(1.0);
//            } else {
//                servoD2.setPosition(0.0);
//            }
//        }
//
//        estadoAnt = gamepad1.a;
//        telemetry.addData("Servo Position", servoD2.getPosition());
//        telemetry.update();
//    }
//}