public class Employee implements OrganizationComponent {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(OrganizationComponent component) {
        // Leaf node, so no implementation needed
    }

    @Override
    public void remove(OrganizationComponent component) {
        // Leaf node, so no implementation needed
    }

    @Override
    public double calculateTotalSalary() {
        return salary;
    }

    @Override
    public String generateXml() {
        return "<employee name=\"" + name + "\" salary=\"" + salary + "\"/>";
    }
}
