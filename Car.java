public class Car implements LandVehicle {
    private int speed;
    private int direction;

    @Override
    public void start() {
        System.out.println("Авто запущено. Начинаем движение.");
    }

    @Override
    public void stop() {
        System.out.println("Авто остановлен.");
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int calculateDistance(int speed, int time) {
        return speed * time;
    }

    @Override
    public void steer(int direction) {
        this.direction = direction;
        System.out.println("Изменение направления на " + direction + " градусов.");
    }

    @Override
    public int calculateNewDirection(int currentDirection, int turnAngle) {
        return (currentDirection + turnAngle + 360) % 360; // Обеспечиваем положительное значение
    }

    public void accelerate(int speed, int increase) {
        speed += increase;
        System.out.println("Увеличена скорость на " + increase + " км/ч. Текущая скорость: " + speed + " км/ч.");
    }
}
