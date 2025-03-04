package homework_26.devices;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (04.03.2025)
 */
public class ElectronicDevicesApp {

    public static void main(String[] args) {

        System.out.println("===== Electronic Device =====");
        ElectronicDevice myDevice = new ElectronicDevice("Mega Device", "Horns and Hooves");
        System.out.println(myDevice);

        myDevice.deviceOn();
        myDevice.deviceOff();


        System.out.println("===== Smartphones =====");
        Smartphones myPhone = new Smartphones("myPhone", "Samsung");
        System.out.println(myPhone);
        myPhone.setDisplayResolution("2560 x 1440");
        myPhone.setProcessorType("Qualcomm — Snapdragon");
        myPhone.deviceOn();
        myPhone.updateOS();
        myPhone.restart();
        myPhone.makeCall();

        System.out.println("===== Vacuum Cleaner =====");
        VacuumCleaner myVC = new VacuumCleaner("myVC", "Quick and Clean");
        System.out.println(myVC);
        myVC.setType("Robotic");
        myVC.setWashing(true);
        myVC.setChargeable(true);
        myVC.deviceOn();
        myVC.work();
        myVC.cleanDustCollector();
        myVC.charge();


    }
}
