// Abstract Product: Button
abstract class Button {
    abstract void display();
    abstract void setText(String text);
}

// Concrete Product: ButtonA
class ButtonA extends Button {
    private String text;

    @Override
    void display() {
        System.out.println("ButtonA: " + text);
    }

    @Override
    void setText(String text) {
        this.text = text;
    }
}

// Concrete Product: ButtonB
class ButtonB extends Button {
    private String text;

    @Override
    void display() {
        System.out.println("[ButtonB] " + text);
    }

    @Override
    void setText(String text) {
        this.text = text;
    }
}

// Abstract Product: TextField
abstract class TextField {
    abstract void display();
    abstract void setText(String text);
}

// Concrete Product: TextFieldA
class TextFieldA extends TextField {
    private String text;

    @Override
    void display() {
        System.out.println("TextFieldA: " + text);
    }

    @Override
    void setText(String text) {
        this.text = text;
    }
}

// Concrete Product: TextFieldB
class TextFieldB extends TextField {
    private String text;

    @Override
    void display() {
        System.out.println("[TextFieldB] " + text);
    }

    @Override
    void setText(String text) {
        this.text = text;
    }
}

// Abstract Product: Checkbox
abstract class Checkbox {
    abstract void display();
    abstract void setText(String text);
}

// Concrete Product: CheckboxA
class CheckboxA extends Checkbox {
    private String text;

    @Override
    void display() {
        System.out.println("CheckboxA: " + text);
    }

    @Override
    void setText(String text) {
        this.text = text;
    }
}

// Concrete Product: CheckboxB
class CheckboxB extends Checkbox {
    private String text;

    @Override
    void display() {
        System.out.println("[CheckboxB] " + text);
    }

    @Override
    void setText(String text) {
        this.text = text;
    }
}

// Abstract Factory: UIFactory
abstract class UIFactory {
    abstract Button createButton(String text);
    abstract TextField createTextField(String text);
    abstract Checkbox createCheckbox(String text);
}

// Concrete Factory: AFactory
class AFactory extends UIFactory {
    @Override
    Button createButton(String text) {
        return new ButtonA();
    }

    @Override
    TextField createTextField(String text) {
        return new TextFieldA();
    }

    @Override
    Checkbox createCheckbox(String text) {
        return new CheckboxA();
    }
}

// Concrete Factory: BFactory
class BFactory extends UIFactory {
    @Override
    Button createButton(String text) {
        return new ButtonB();
    }

    @Override
    TextField createTextField(String text) {
        return new TextFieldB();
    }

    @Override
    Checkbox createCheckbox(String text) {
        return new CheckboxB();
    }
}

// Client Code
public class Main {
    public static void main(String[] args) {
        // Choose the desired factory (A or B)
        UIFactory factory = new AFactory();

        // Create UI elements
        Button button = factory.createButton("Click me");
        TextField textField = factory.createTextField("Enter text");
        Checkbox checkbox = factory.createCheckbox("Check me");

        // Display UI elements
        button.display();
        textField.display();
        checkbox.display();

        // Change and display updated text
        button.setText("New text");
        button.display();
    }
}

