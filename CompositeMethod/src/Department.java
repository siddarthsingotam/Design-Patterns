import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationComponent {
    private String name;
    private List<OrganizationComponent> components;

    public Department(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    @Override
    public void add(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (OrganizationComponent component : components) {
            totalSalary += component.calculateTotalSalary();
        }
        return totalSalary;
    }

    @Override
    public String generateXml() {
        StringBuilder xml = new StringBuilder();
        xml.append("<department name=\"").append(name).append("\">");
        for (OrganizationComponent component : components) {
            xml.append(component.generateXml());
        }
        xml.append("</department>");
        return xml.toString();
    }
}
