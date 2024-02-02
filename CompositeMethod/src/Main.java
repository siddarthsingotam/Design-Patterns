public class Main {
    public static void main(String[] args) {
        OrganizationComponent organization = new Organization("MegaCorp");
        OrganizationComponent department1 = new Department("Sales");
        OrganizationComponent department2 = new Department("Engineering");
        OrganizationComponent employee1 = new Employee("John Snow", 50000);
        OrganizationComponent employee2 = new Employee("Sponge Bob", 60000);
        OrganizationComponent employee3 = new Employee("Tom Holland", 70000);

        organization.add(department1);
        organization.add(department2);

        department1.add(employee1);
        department2.add(employee2);
        department2.add(employee3);

    System.out.println("Total salary: " + organization.calculateTotalSalary());
    System.out.println(organization.generateXml());}
}