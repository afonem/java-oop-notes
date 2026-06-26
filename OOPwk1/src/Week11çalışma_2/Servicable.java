package Week11çalışma_2;

public interface Servicable<T extends Vehicle> {
    void performMaintenance(T vehicle);
}
