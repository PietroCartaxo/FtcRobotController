//package org.firstinspires.ftc.teamcode.Servos;
//
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.hardware.Servo;
//
//public class ServoD6 extends OpMode {
//
//    private Servo servoD6;
//
//    @Override
//    public void init() {
//        servoD6 = hardwareMap.get(Servo.class, "servod6");
//    }
//
//    @Override
//    public void loop() {
//        if(gamepad1.a){
//            servoD6.setPosition(1.0);
//        } else{
//            servoD6.setPosition(0.0);
//        }
//        telemetry.addData("Servo Position", servoD6.getPosition());
//        telemetry.update();
//    }
//}
