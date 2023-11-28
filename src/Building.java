class Building {
    private Elevator elevator;
    private Floor[] floors;

    public Building(int numberOfFloors) {
        elevator = new Elevator();
        floors = new Floor[numberOfFloors];
        for (int i = 0; i < numberOfFloors; i++) {
            floors[i] = new Floor(i + 1);
        }
    }

    public Elevator getElevator() {
        return elevator;
    }

    public Floor getFloor(int number) {
        return floors[number - 1];
    }
}