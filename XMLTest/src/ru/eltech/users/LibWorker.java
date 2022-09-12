package ru.eltech.users;

public class LibWorker extends User{
    private int workerID;
    private int[] workingHours;

    public int getWorkerID() {
        return workerID;
    }

    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }

    public int[] getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int[] workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
