
public class Main {
    public static void main(String[] args) {
        Building building = new Building(5); // a building with 5 floors

        // Simulate elevator movement
        Elevator elevator = building.getElevator();
        elevator.moveUp(); // move to 1st floor
        elevator.moveUp(); // move to 2nd floor
        elevator.openDoor(); // open door at 2nd floor
        elevator.closeDoor();//close door
        elevator.moveDown();//move to 1st floor

        // Display information about a floor
        Floor thirdFloor = building.getFloor(3);
        thirdFloor.displayFloorNumber();
    }
}


//  TODO = ADD GUI AND TRY TO BUILD THAT INTERACTIVELY