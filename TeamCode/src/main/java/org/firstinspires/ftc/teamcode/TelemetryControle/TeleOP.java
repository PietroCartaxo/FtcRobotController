//package org.firstinspires.ftc.teamcode;
//
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//
//@TeleOp()
//public class TeleOP extends OpMode {
//
//    @Override
//    public void init() {
//        telemetry.addData("Status: ", "Initialized");
//    }
//
//    @Override
//    public void loop() {
//        telemetry.addData("Status: ", "Running");
//
//        telemetry.addLine("===Controle 1===\n");
//
//        telemetry.addLine("===Left Joystick===");
//        telemetry.addData("X: ", gamepad1.left_stick_x);
//        telemetry.addData("Y: ", gamepad1.left_stick_y);
//
//        telemetry.addLine("\n===Right Joystick===");
//        telemetry.addData("X: ", gamepad1.right_stick_x);
//        telemetry.addData("Y: ", gamepad1.right_stick_y);
//
//        telemetry.addLine("\n==Triggers===");
//        telemetry.addData("Left: ", gamepad1.left_trigger);
//        telemetry.addData("Right: ", gamepad1.right_trigger);
//
//        telemetry.addLine("\n===Layout ABXY===");
//        telemetry.addData("A Button: ", gamepad1.a);
//        telemetry.addData("B Button: ", gamepad1.b);
//        telemetry.addData("X Button: ", gamepad1.x);
//        telemetry.addData("Y Button: ", gamepad1.y);
//
//        telemetry.addLine("\n===Bumpers===");
//        telemetry.addData("Left: ", gamepad1.left_bumper);
//        telemetry.addData("Right: ", gamepad1.right_bumper);
//
//        telemetry.addLine("\n===D-pad===\n");
//        telemetry.addData("Up: ", gamepad1.dpad_up);
//        telemetry.addData("Down: ", gamepad1.dpad_down);
//        telemetry.addData("Left: ", gamepad1.dpad_left);
//        telemetry.addData("Right: ", gamepad1.dpad_right);
//
//        telemetry.addLine("\n===Controle 2===\n");
//
//        telemetry.addLine("===Left Joystick===");
//        telemetry.addData("X: ", gamepad2.left_stick_x);
//        telemetry.addData("Y: ", gamepad2.left_stick_y);
//
//        telemetry.addLine("\n===Right Joystick===");
//        telemetry.addData("X: ", gamepad2.right_stick_x);
//        telemetry.addData("Y: ", gamepad2.right_stick_y);
//
//        telemetry.addLine("\n==Triggers===");
//        telemetry.addData("Left: ", gamepad2.left_trigger);
//        telemetry.addData("Right: ", gamepad2.right_trigger);
//
//        telemetry.addLine("\n===Layout ABXY===");
//        telemetry.addData("A Button: ", gamepad2.a);
//        telemetry.addData("B Button: ", gamepad2.b);
//        telemetry.addData("X Button: ", gamepad2.x);
//        telemetry.addData("Y Button: ", gamepad2.y);
//
//        telemetry.addLine("\n===Bumpers===");
//        telemetry.addData("Left: ", gamepad2.left_bumper);
//        telemetry.addData("Right: ", gamepad2.right_bumper);
//
//        telemetry.addLine("\n===D-pad===");
//        telemetry.addData("Up: ", gamepad2.dpad_up);
//        telemetry.addData("Down: ", gamepad2.dpad_down);
//        telemetry.addData("Left: ", gamepad2.dpad_left);
//        telemetry.addData("Right: ", gamepad2.dpad_right);
//
//        telemetry.update();
//    }
//}