class Elevator {
    private int currentFloor;

    public Elevator() {
        currentFloor = 0; // assuming ground floor is 0
    }

    public void moveUp() {
        currentFloor++;
        System.out.println("Elevator is now at floor: " + currentFloor);
    }

    public void moveDown() {
        if (currentFloor > 0) {
            currentFloor--;
            System.out.println("Elevator is now at floor: " + currentFloor);
        }
    }

    public void openDoor() {
        System.out.println("Opening door at floor: " + currentFloor);
    }

    public void closeDoor(){
        System.out.println("Closing door at floor: " + currentFloor);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}