package com.test07._interface.apply;

/**
 * ClassName: USBTest
 * Package: com.test07._interface.apply
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 上午 10:51
 * @Version 1.0
 */
public class USBTest {
    public static void main(String[] args) {

        Computer computer = new Computer();

        //創建介面實現類別對象
        Printer printer = new Printer();
        computer.transferData(printer);

        //2.創建介面實現類別的匿名對象
        computer.transferData(new Camera());

        //3.創建介面匿名實現類別的對象
        USB usb = new USB(){
            @Override
            public void start() {
                System.out.println("USB.start()");
            }

            @Override
            public void stop() {
                System.out.println("USB.Stop()");
            }
        };
        computer.transferData(usb);

        //4.創建介面匿名實現類別的匿名對象
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("Anonymous.start()");
            }

            @Override
            public void stop() {
                System.out.println("Anonymous.stop()");
            }
        });
    }
}

interface USB{
    public abstract void start();
    void stop();
}

class Computer{
    public  void transferData(USB usb){
        usb.start();
        //transferData
        usb.stop();
    }
}

class Printer implements USB{
    @Override
    public void start() {
        System.out.println("Printer.Start()");
    }

    @Override
    public void stop() {
        System.out.println("Printer.stop()");
    }
}

class Camera implements USB{
    @Override
    public void start() {
        System.out.println("Camera.Start()");
    }

    @Override
    public void stop() {
        System.out.println("Camera.stop()");
    }
}