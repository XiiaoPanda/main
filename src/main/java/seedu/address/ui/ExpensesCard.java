package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import seedu.address.model.expenses.Expenses;

/**
 * An UI component that displays information of a {@code Expenses}.
 */
public class ExpensesCard extends UiPart<Region> {

    private static final String FXML = "ExpensesListCard.fxml";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */

    public final Expenses expenses;

    @FXML
    private Label id;
    @FXML
    private Label employeeId;
    @FXML
    private Label expensesAmount;
    @FXML
    private Label travelExpenses;
    @FXML
    private Label medicalExpenses;
    @FXML
    private Label miscellaneousExpenses;

    public ExpensesCard(Expenses expenses, int displayedIndex) {
        super(FXML);
        this.expenses = expenses;
        id.setText(displayedIndex + ". ");
        employeeId.setText(expenses.getEmployeeId().value);
        expensesAmount.setText(expenses.getExpensesAmount().expensesAmount);
        System.out.println("pass2");
        System.out.println(expenses.getTravelExpenses().travelExpenses);
        travelExpenses.setText(expenses.getTravelExpenses().travelExpenses);
        medicalExpenses.setText(expenses.getMedicalExpenses().medicalExpenses);
        miscellaneousExpenses.setText(expenses.getMiscellaneousExpenses().miscellaneousExpenses);
    }

    @Override
    public boolean equals(Object other) {
        // short circuit if same object
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof ExpensesCard)) {
            return false;
        }

        // state check
        ExpensesCard card = (ExpensesCard) other;
        return id.getText().equals(card.id.getText())
                && expenses.equals(card.expenses);
    }
}
