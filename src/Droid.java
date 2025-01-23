public class Droid {
    int batteryLevel;
    String name;

    public static void main(String[] args) {
        Droid droid_1 = new Droid("Codey");
        Droid droid_2 = new Droid("Andrew");

        System.out.println(droid_1);
        System.out.println(droid_2);

        droid_1.performTask("dancing");
        droid_1.energyReport();
        droid_1.performTask("cooking");
        droid_1.energyReport();

        droid_2.energyTransfer(droid_1, 20);
    }

    public Droid(String droidName) {
        batteryLevel = 100;
        name = droidName;
    }

    public String toString() {
        return "Hello I'm the droid: " + name;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    public void energyReport() {
        System.out.println(name + " has energy level: " + batteryLevel);
    }

    public void energyTransfer(Droid droid, int amount) {
        if (amount <= 0) {
            System.out.println("Wrong energy level to transfer!");
        }

        if (droid.batteryLevel + amount > 100) {
            droid.batteryLevel = 100;
        }

        droid.batteryLevel += amount;
        batteryLevel -= amount;

        System.out.println("Droid " + name + " has transfered " + amount + " energy to droid " + droid.name);
        droid.energyReport();
        energyReport();
    }
}
