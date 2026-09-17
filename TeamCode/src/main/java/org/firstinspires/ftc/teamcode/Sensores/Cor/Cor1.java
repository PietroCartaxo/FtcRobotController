//package org.firstinspires.ftc.teamcode.Sensores.Cor;
//
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.ColorSensor;
//
//@TeleOp
//public class Cor1 extends OpMode {
//
//    private ColorSensor sencor;
//
//    @Override
//    public void init() {
//        sencor = hardwareMap.get(ColorSensor.class, "sencor");
//    }
//
//    @Override
//    public void loop() {
//
//        int r = (sencor.red() * 255) / 550;
//        int g = (sencor.green() * 255) / 550;
//        int b = (sencor.blue() * 255) / 550;
//
//        telemetry.addData("Red normalizado", r);
//        telemetry.addData("Green normalizado", g);
//        telemetry.addData("Blue normalizado", b);
//
//        if (b > 200 && (r >= 40 && r <= 120) && (g >= 120 && g <= 200)) {
//            telemetry.addData("Status da Cor", "cor 4EA1FF Azul identificada");
//        } else {
//            telemetry.addData("Status da Cor", "Nenhuma cor alvo identificada");
//        }
//
//        telemetry.update();
//    }
//}
