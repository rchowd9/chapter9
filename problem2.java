class Task {
    private int hoursWorked;
    private double hourlyRate;

    public Task(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    
    public double getCost() {
        return hoursWorked * hourlyRate;
    }
}

class Project {
    public double calculateTaskCost(Task task) {
        
        return task.getCost();
    }
}
