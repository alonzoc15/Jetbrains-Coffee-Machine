class Car {

    int yearModel;
    String make;
    int speed;

    void accelerate() {
        setSpeed(this.speed + 5);
    }
    void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    int brake() {
        if (speed >= 5){
            speed -= 5;
        } else {
            speed = 0;
        }

        return speed;
    }
}