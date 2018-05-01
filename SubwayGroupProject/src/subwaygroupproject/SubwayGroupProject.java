
// Program:     SubwayGroupProject
// Date:        4/30/2018
// Developers:  Chase Dickerson and Austyn Mougey
// Purpose:     Displays a summary of an order selected by user

package subwaygroupproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class SubwayGroupProject extends Application
{
    // Declaring private variables
    int error = 0;
    private TextArea textArea = new TextArea();
    private Button btnShow = new Button("Display Summary ");
    private Button btnClear = new Button("Clear");
    private String display = "";
    //Bread Size Radio Buttons
    private RadioButton rbSizeSix = new RadioButton();
    private RadioButton rbSizeTwelve = new RadioButton();
    
    //Bread Type Radio Buttons
    private RadioButton rbWhite = new RadioButton();
    private RadioButton rbWheat = new RadioButton();
    private RadioButton rbItalian = new RadioButton();
    
    //Meat Type Check Boxes and none choice Radio Button
    private CheckBox cbHam = new CheckBox();
    private CheckBox cbTurkey = new CheckBox();
    private CheckBox cbPepperoni = new CheckBox();
    private RadioButton rbNoMeat = new RadioButton();
    
    //Cheese Type Radio Buttons and none choice Radio Button
    private RadioButton rbAmerican = new RadioButton();
    private RadioButton rbSwiss = new RadioButton();
    private RadioButton rbPepperJack = new RadioButton();
    private RadioButton rbNoCheese = new RadioButton();
    
    //Veggie Type Check Boxes and none choice Radio Button
    private CheckBox cbLettuce = new CheckBox();
    private CheckBox cbTomatoes = new CheckBox();
    private CheckBox cbOlives = new CheckBox();
    private RadioButton rbNoVeggie = new RadioButton();
    
    //Sauce Type Check Boxes and none choice Radio Button
    private CheckBox cbRanch = new CheckBox();
    private CheckBox cbMayo = new CheckBox();
    private CheckBox cbChipotle = new CheckBox();
    private RadioButton rbNoSauce = new RadioButton();
    
    //Salt&Pepper Radio Buttons and none choice Radio Button
    private CheckBox cbSalt = new CheckBox();
    private CheckBox cbPepper = new CheckBox();
    private RadioButton rbNoSaltAndPepper = new RadioButton();
    

    @Override
    public void start(Stage primaryStage)
    {   
        //Create UI
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        
        //Create Bread size radio buttons
        gridPane.add(new Label("\tChoose the size of Bread: "), 0, 0);
        ToggleGroup tgBreadSize = new ToggleGroup();
        rbSizeSix.setToggleGroup(tgBreadSize);
        rbSizeTwelve.setToggleGroup(tgBreadSize);
        gridPane.add(new Label("\t6 in."), 3, 0);
        gridPane.add(rbSizeSix, 4, 0);
        gridPane.add(new Label("\t12 in."), 6, 0);
        gridPane.add(rbSizeTwelve, 7, 0);
        
        //Create Bread type radio buttons
        gridPane.add(new Label("\tChoose type of Bread:"), 0, 1);
        ToggleGroup tgBreadType = new ToggleGroup();
        rbWhite.setToggleGroup(tgBreadType);
        rbWheat.setToggleGroup(tgBreadType);
        rbItalian.setToggleGroup(tgBreadType);
        gridPane.add(new Label("\tWhite"), 3, 1);
        gridPane.add(rbWhite, 4, 1);
        gridPane.add(new Label("\tWheat"), 6, 1);
        gridPane.add(rbWheat, 7, 1);
        gridPane.add(new Label("\tItalian"), 9, 1);
        gridPane.add(rbItalian, 10, 1);
        
        //Create Meat type check boxes
        ToggleGroup tgNoMeat = new ToggleGroup();
        rbNoMeat.setToggleGroup(tgNoMeat);
        gridPane.add(new Label("\tPick your Meats: "), 0, 2);
        gridPane.add(new Label("\tHam"), 3, 2);
        gridPane.add(cbHam, 4, 2);
        gridPane.add(new Label("\tTurkey"), 6, 2);
        gridPane.add(cbTurkey, 7, 2);
        gridPane.add(new Label("\tPepperoni"), 9, 2);
        gridPane.add(cbPepperoni, 10, 2);
        gridPane.add(new Label("\tNo Meat"), 12, 2);
        gridPane.add(rbNoMeat, 13, 2);
        
        //Create Cheese type radio buttons
        gridPane.add(new Label("\tPick your Cheese: "), 0, 3);
        ToggleGroup tgCheese = new ToggleGroup();
        rbAmerican.setToggleGroup(tgCheese);
        rbSwiss.setToggleGroup(tgCheese);
        rbPepperJack.setToggleGroup(tgCheese);
        rbNoCheese.setToggleGroup(tgCheese);
        gridPane.add(new Label("\tAmerican"), 3, 3);
        gridPane.add(rbAmerican, 4, 3);
        gridPane.add(new Label("\tSwiss"), 6, 3);
        gridPane.add(rbSwiss, 7, 3);
        gridPane.add(new Label("\tPepperJack"), 9, 3);
        gridPane.add(rbPepperJack, 10, 3);
        gridPane.add(new Label("\tNo Cheese"), 12, 3);
        gridPane.add(rbNoCheese, 13, 3);
        
        //Create Veggie type check boxes
        ToggleGroup tgNoVeggies = new ToggleGroup();
        rbNoVeggie.setToggleGroup(tgNoVeggies);
        gridPane.add(new Label("\tPick your Veggies: "), 0, 4);
        gridPane.add(new Label("\tLettuce"), 3, 4);
        gridPane.add(cbLettuce, 4, 4);
        gridPane.add(new Label("\tTomatoes"), 6, 4);
        gridPane.add(cbTomatoes, 7, 4);
        gridPane.add(new Label("\tOlives"), 9, 4);
        gridPane.add(cbOlives, 10, 4);
        gridPane.add(new Label("\tNo Veggies"), 12, 4);
        gridPane.add(rbNoVeggie, 13, 4);
        
        //Create Sauce type check boxes
        ToggleGroup tgNoSauce = new ToggleGroup();
        rbNoSauce.setToggleGroup(tgNoSauce);
        gridPane.add(new Label("\tPick your Sauces: "), 0, 5);
        gridPane.add(new Label("\tRanch"), 3, 5);
        gridPane.add(cbRanch, 4, 5);
        gridPane.add(new Label("\tMayo"), 6, 5);
        gridPane.add(cbMayo, 7, 5);
        gridPane.add(new Label("\tChipotle"), 9, 5);
        gridPane.add(cbChipotle, 10, 5);
        gridPane.add(new Label("\tNo Sauce"), 12, 5);
        gridPane.add(rbNoSauce, 13, 5);
        
        //Create Salt and Pepper radio buttons
        gridPane.add(new Label("\tDo you want salt or pepper: "), 0, 6);
        gridPane.add(new Label("\tSalt"), 3, 6);
        gridPane.add(cbSalt, 4, 6);
        gridPane.add(new Label("\tPepper"), 6, 6);
        gridPane.add(cbPepper, 7, 6);
        gridPane.add(new Label("\tNo Salt or Pepper"), 9, 6);
        gridPane.add(rbNoSaltAndPepper, 10, 6);
        
        // Adding buttons and text area
        gridPane.add(btnShow, 0, 12);
        gridPane.add(btnClear, 0, 13);        
        gridPane.add(textArea, 15, 15);
        
        textArea.setEditable(false);
        
        //Create a scene and place it on the stage
        Scene scene = new Scene(gridPane, 1200, 400);
        primaryStage.setTitle("Order System");
        primaryStage.setScene(scene);
        primaryStage.show();  
        
        /*
        Action handlers
        */
        btnShow.setOnAction(event -> {
            processOutput();
        });
        
        rbNoMeat.setOnAction(event ->{
            cbHam.setSelected(false);
            cbTurkey.setSelected(false);
            cbPepperoni.setSelected(false);
        });
        
        rbNoCheese.setOnAction(event ->{
            rbAmerican.setSelected(false);
            rbSwiss.setSelected(false);
            rbPepperJack.setSelected(false);
        });
        
        rbNoVeggie.setOnAction(event ->{
            cbLettuce.setSelected(false);
            cbTomatoes.setSelected(false);
            cbOlives.setSelected(false);
        });
        
        rbNoSauce.setOnAction(event ->{
            cbRanch.setSelected(false);
            cbMayo.setSelected(false);
            cbChipotle.setSelected(false);
        });
        
        rbNoSaltAndPepper.setOnAction(event ->{
            cbSalt.setSelected(false);
            cbPepper.setSelected(false);
        });
        
        btnClear.setOnAction(event -> {
            clear();
        });
    }
    
    // Method is used to display output
    public void processOutput()
    {       
        // A method is used for each selection type
        String breadSize = checkBreadSize();
        String breadType = checkBreadType();
        String meat = checkMeat();
        String cheese = checkCheeseType();
        String veggies  = checkVeggies();
        String sauce  = checkSauce();
        String sp = checkSaltAndPepper();
        
        // Creating the display used from the previous methods
        display = breadSize + breadType + meat + "\n" + cheese + "\n" + veggies + "\n" + sauce + "\n" + "Salt and Pepper: " + sp;
        textArea.setText(display);
    }
    
    public String checkBreadSize()
    {
        if (rbSizeSix.isSelected())
        {
            return "Bread size: 6 inches\n";
        }
        else if (rbSizeTwelve.isSelected())
        {
            return "Bread size: 12 inches\n";
        }
        else
        {
            return "Please select a bread size.\n";
        }
    }
    
    public String checkBreadType()
    {
        if (rbWhite.isSelected())
        {
            return "Bread type: White\n";
        }
        if (rbWheat.isSelected())
        {
            return "Bread type: Wheat\n";
        }
        if (rbItalian.isSelected())
        {
            return "Bread type: Italian\n";
        }
        else
        {
            return "Please select a bread type.\n";
        }
    }
    
    public String checkMeat()
    {
        display = "Meats: ";
        if(cbHam.isSelected())
        {
            display += "Ham ";
        }
        if (cbTurkey.isSelected())
        {
            display += "Turkey ";
        }
        if (cbPepperoni.isSelected())
        {
            display += "Pepporoni ";
        }
        if (rbNoMeat.isSelected() || (!cbHam.isSelected() && !cbTurkey.isSelected() && !cbPepperoni.isSelected()))
        {
            return "Meats: No Meat";
        }
        
        return display;
    }
    
    public String checkCheeseType()
    {        
        if (rbAmerican.isSelected())
        {
            return "Cheese type: Amercian";
        }
        if (rbSwiss.isSelected())
        {
            return "Cheese type: Swiss";
        }
        if (rbPepperJack.isSelected())
        {
            return "Cheese type: Pepper Jack";
        }
        if (rbNoCheese.isSelected() || (!rbAmerican.isSelected() && !rbSwiss.isSelected() && !rbPepperJack.isSelected()))
        {
            return "Cheese: No Cheese";
        }
        else
        {
            return "";
        }   
    }
    
    public String checkVeggies()
    {        
        display = "Veggies: ";
        if(cbLettuce.isSelected())
        {
            display += "Lettuce ";
        }
        if (cbTomatoes.isSelected())
        {
            display += "Tomatoes ";
        }
        if (cbOlives.isSelected())
        {
            display += "Olives ";
        }
        if (rbNoVeggie.isSelected() || (!cbLettuce.isSelected() && !cbTomatoes.isSelected() && !cbOlives.isSelected()))
        {
            display += "No Veggies";
        }
        
        return display;
    }
    
    public String checkSauce()
    {
        int numOfSauce = 0;
        display = "Sauces: ";
        if(cbRanch.isSelected())
        {
            display += "Ranch ";
            numOfSauce++;
        }
        if (cbMayo.isSelected())
        {
            display += "Mayo ";
            numOfSauce++;
        }
        if (cbChipotle.isSelected())
        {
            display += "Chipolte ";
            numOfSauce++;
        }
        if (rbNoSauce.isSelected() || (!cbRanch.isSelected() && !cbMayo.isSelected() && !cbChipotle.isSelected()))
        {
            display += "No Sauce ";
        }
        
        if (numOfSauce == 3)
        {
            display = "Error: Can only have  two sauces.";
        }
        
        return display;
    }
    
    public String checkSaltAndPepper()
    {
        if (rbNoSaltAndPepper.isSelected() || (!cbSalt.isSelected() && !cbPepper.isSelected()))
        {
            return "None";
        }
        if (cbSalt.isSelected() && cbPepper.isSelected())
        {
            return "Both";
        }
        if (cbSalt.isSelected())
        {
            return "Just Salt";
        }
        if (cbPepper.isSelected())
        {
            return "Just Pepper";
        }
        else 
        {
           return "None";
        }
    }
    
    // Clears the form
    public void clear()
    {
        rbSizeSix.setSelected(false);
        rbSizeTwelve.setSelected(false);
        rbWhite.setSelected(false);
        rbWheat.setSelected(false);
        rbItalian.setSelected(false);
        cbHam.setSelected(false);
        cbTurkey.setSelected(false);
        cbPepperoni.setSelected(false);
        rbNoMeat.setSelected(false);
        rbAmerican.setSelected(false);
        rbSwiss.setSelected(false);
        rbPepperJack.setSelected(false);
        rbNoCheese.setSelected(false);       
        cbLettuce.setSelected(false);
        cbTomatoes.setSelected(false);
        cbOlives.setSelected(false);
        rbNoVeggie.setSelected(false);
        cbRanch.setSelected(false);
        cbMayo.setSelected(false);
        cbChipotle.setSelected(false);
        rbNoSauce.setSelected(false);
        cbSalt.setSelected(false);
        cbPepper.setSelected(false);
        rbNoSaltAndPepper.setSelected(false);
        
        display = "";
        textArea.setText(display);
    }
    
    
    
    public static void main(String[] args) 
    {
        Application.launch(args);
    }
    
}
