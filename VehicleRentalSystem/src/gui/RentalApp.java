package gui;
import javax.swing.*;
import model.Vehicle;
import model.InsuredVehicle;
import service.VehicleService;
import java.awt.event.*;

/**
 * RentalApp is the GUI for the Vehicle Rental System
 */


public class RentalApp extends JFrame { 
    private JPanel panel; 
    private JButton rentalButton; 
    private final int WINDOW_WIDTH = 400; 
    private final int WINDOW_HEIGHT = 300; 
    private JComboBox<String> typeDropdown; 
    private JSpinner daysSpinner; 
    private JCheckBox insuranceCheckbox;
    private VehicleService vehicleService = new VehicleService();

    /**
     Constructor for the RentalApp class that sets up the components
    */
    public RentalApp() {
        
        setTitle("Vehicle Rental System");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        add(panel);
        setVisible(true);
    }

    /**
    buildPanel is a method that creates the GUI components and adds them to the panel
    */
    private void buildPanel() {
        
        panel = new JPanel();

        JLabel typeLabel  = new JLabel("Vehicle Type:");
        typeDropdown = new JComboBox<>(new String[] { "Car", "Bike", "Truck" });

        JLabel daysLabel  = new JLabel("Rental Days:");
        daysSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 365, 1));

        rentalButton = new JButton("Calculate Rental Cost");
        rentalButton.addActionListener(new RentalButtonListener());

        insuranceCheckbox = new JCheckBox("Add Insurance (+15%)"); // Checkbox for insurance option, I wanted it optional
        panel.add(insuranceCheckbox);

        // lays out the components in the panel
        panel.add(typeLabel);
        panel.add(typeDropdown);
        panel.add(daysLabel);
        panel.add(daysSpinner); // You can just select how many days instead of typing it in, I thought this would be better
        panel.add(rentalButton);
        
    }

    /**
     rentalButtonListener handles the button click events
    */
    private class RentalButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            String selectedType = (String) typeDropdown.getSelectedItem();
            
            int numDays = (int) daysSpinner.getValue();

            boolean addInsurance = insuranceCheckbox.isSelected();

            Vehicle vehicle = vehicleService.getVehicleByType(selectedType);
            
            // Calculates the cost
            double totalCost;
                if (addInsurance) {
                    InsuredVehicle insuredVehicle = new InsuredVehicle(vehicle);
                    totalCost = insuredVehicle.calculateInsuredCost(numDays);
                } else {
                    totalCost = vehicle.getPrice() * numDays;
                }
            
            // Displays everything in a box
            JOptionPane.showMessageDialog(
                RentalApp.this,
                "Renting a " + selectedType + " for " + numDays + " days costs $" + String.format("%.2f", totalCost),"Rental Cost",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}


