import java.util.ArrayList;
import  java.util.List;

public class Model {
    private int[] options = new int[3];
    private boolean isSelected;

    private List<IMemento> undoList = new ArrayList<>();
    private List<IMemento> redoList = new ArrayList<>();

    public void setOption(int optionNumber, int choice) {
        System.out.println("optionNumber: " + optionNumber + " choice: " + choice);
        if (optionNumber >= 1 && optionNumber <= 3) {
            options[optionNumber - 1] = choice;
        }
    }

    public int getOption(int optionNumber) {
        if (optionNumber >= 1 && optionNumber <= 3) {
            return options[optionNumber - 1];
        }
        return -1;
    }

    public void setIsSelected(boolean isSelected) {
        System.out.println("isSelected: " + isSelected);
        this.isSelected = isSelected;
    }

    public boolean getIsSelected() {
        return isSelected;
    }

    // method to save the state of the model
    public IMemento createMemento() {
        return new Memento(options, isSelected);
    }

    // method to restore the state of the model
    public void restoreState(IMemento memento) {
        Memento selectionMemento = (Memento) memento;
        options = selectionMemento.getOptions();
        System.out.println("options: " + options[0] + " " + options[1] + " " + options[2]);
        isSelected = selectionMemento.isSelected();
        System.out.println("isSelected: " + isSelected);
        System.out.println("State restored");
    }

    public void undo() {
        if (!undoList.isEmpty()){
            IMemento lastState = undoList.remove(undoList.size() - 1);
            undoList.add(lastState);
            restoreState(lastState);
        }
    }

    public void redo() {
        if (!redoList.isEmpty()) {
            IMemento lastState = redoList.remove(redoList.size() - 1);
            redoList.add(lastState);
            restoreState(lastState);
        }
    }

    // Method to get the history of states
    public List<IMemento> getHistory() {
        return undoList;
    }
}