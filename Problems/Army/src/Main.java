class Army {

    public static void createArmy() {
        // Implement this method
        Unit unit1 = new Unit("squad 1");
        Unit unit2 = new Unit("squad 2");
        Unit unit3 = new Unit("squad 3");
        Unit unit4 = new Unit("squad 4");
        Unit unit5 = new Unit("squad 5");
        Knight knight1 = new Knight("The Mountain");
        Knight knight2 = new Knight("The Hound");
        Knight knight3 = new Knight("Brienne");
        General General1 = new General("General Price");
        Doctor Doctor1 = new Doctor("Doctor Doom");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}