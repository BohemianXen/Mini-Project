/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_creator;


//import java.util.Scanner;
import java.util.HashMap;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

/**
 *
 * @author blaze
 */

/*
<applet code = "Car_Creator" width = "600" height = "600"> 
</applet>
*/

public class Car_Creator {
    
    JList<String> chassisList, tyresList, suspensionList, engineList;
    JLabel costLabel;
    JScrollPane scrollPane;
    String chassisArray[], tyresArray[], suspensionArray[], engineArray[];
    JTextField carName; 
    JButton makeCar;

    Car_Creator(){
            
        Chassis chassis3 = new Chassis(30000, 250);
        Chassis chassis2 = new Chassis(20000, 500);
        Chassis chassis1 = new Chassis(10000, 800);
        chassisArray = new String[3];
        chassisArray[0] = "Street";
        chassisArray[1] = "Sport";
        chassisArray[2] = "Performance";
        
       
        Tyres tyres3 = new Tyres(20000, 60, 1);
        Tyres tyres2 = new Tyres(12000, 70, 3);
        Tyres tyres1 = new Tyres(8000, 80, 5);
        tyresArray = new String[3];
        tyresArray[0] = "Street";
        tyresArray[1] = "Sport";
        tyresArray[2] = "Performance";
        
        Suspension suspension3 = new Suspension(20000, 15, 20);
        Suspension suspension2 = new Suspension(15000, 20, 30);
        Suspension suspension1 = new Suspension(10000, 25, 50);
        suspensionArray = new String[3];
        suspensionArray[0] = "Street";
        suspensionArray[1] = "Sport";
        suspensionArray[2] = "Performance";
        
        Engine engine3 = new Engine(50000, 500, 800);
        Engine engine2 = new Engine(35000, 300, 600);
        Engine engine1 = new Engine(15000, 250, 500);
        engineArray = new String[3];
        engineArray[0] = "Street";
        engineArray[1] = "Sport";
        engineArray[2] = "Performance";

        Car car1 = new Car("default", chassis1, tyres1, suspension1, engine1);
        /*Car car2 = new Car(car1);
        car2.setName("default1");
        Car car3 = new Car(car1);
        car3.setName("default2");

        HashMap<String, Car> Cars = new HashMap<>();
        Cars.put(car1.getName(), car1);
        Cars.put(car2.getName(), car2);
        Cars.put(car3.getName(), car3);*/
     
//-------------------------------------- GUI INITS ---------------------------------------------------
          
        JFrame frame = new JFrame("Car Creator");
        frame.setSize(500, 400);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.getContentPane().setBackground(Color.decode("#00b359"));
        
        JPanel cPanel = new JPanel();
        JPanel tPanel = new JPanel();
        JPanel sPanel = new JPanel();
        JPanel ePanel = new JPanel();
        
        frame.add(cPanel);
        frame.add(tPanel);
        frame.add(sPanel);
        frame.add(ePanel);
        
        TitledBorder cBorder = new TitledBorder("Chassis");
        cBorder.setTitleJustification(TitledBorder.CENTER);
        TitledBorder tBorder = new TitledBorder("Tyres");
        tBorder.setTitleJustification(TitledBorder.CENTER);
        TitledBorder sBorder = new TitledBorder("Suspension");
        sBorder.setTitleJustification(TitledBorder.CENTER);
        TitledBorder eBorder = new TitledBorder("Engine");
        eBorder.setTitleJustification(TitledBorder.CENTER);
        
        cPanel.setBorder(cBorder);
        tPanel.setBorder(tBorder);
        sPanel.setBorder(sBorder);
        ePanel.setBorder(eBorder);
        
        costLabel = new JLabel("Default");
        //costLabel.setText(Integer.toString(car1.totalCost));
        
        chassisList = new JList(chassisArray);
        tyresList = new JList(tyresArray);
        suspensionList = new JList(suspensionArray);
        engineList = new JList(engineArray);
        
        chassisList.setBackground(frame.getBackground());
        tyresList.setBackground(frame.getBackground());
        suspensionList.setBackground(frame.getBackground());
        engineList.setBackground(frame.getBackground());
      
        
        carName = new JTextField("Name Your Car", 15);
        carName.setActionCommand("cName");
        
        makeCar = new JButton("makeCar");
        
        chassisList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        chassisList.setSelectedIndex(0);
        tyresList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tyresList.setSelectedIndex(0);
        suspensionList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        suspensionList.setSelectedIndex(0);
        engineList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        engineList.setSelectedIndex(0);
        
        chassisList.addListSelectionListener(ae -> {
            int index = chassisList.getSelectedIndex();
            switch (index)
            {
                case 0: car1.setChassis(chassis1);
                break;
                case 1: car1.setChassis(chassis2);
                break;
                case 2: car1.setChassis(chassis3);
                break;
                default: System.out.println("An error has occured");  
            }
            costLabel.setText(Integer.toString(car1.totalCost));

        });
        
        tyresList.addListSelectionListener(ae -> {
            int index = tyresList.getSelectedIndex();
            switch (index)
            {
                case 0: car1.setTyres(tyres1);
                break;
                case 1: car1.setTyres(tyres2);
                break;
                case 2: car1.setTyres(tyres3);
                break;
                default: System.out.println("An error has occured");
            }
            costLabel.setText(Integer.toString(car1.totalCost));

        });
     
         
        suspensionList.addListSelectionListener(ae -> {
            int index = suspensionList.getSelectedIndex();
            switch (index)
            {
                case 0: car1.setSuspension(suspension1);
                break;
                case 1: car1.setSuspension(suspension2);
                break;
                case 2: car1.setSuspension(suspension3);
                break;
                default: System.out.println("An error has occured");
            }
            costLabel.setText(Integer.toString(car1.totalCost));

        });
     
        engineList.addListSelectionListener(ae -> {
            int index = engineList.getSelectedIndex();
            switch (index)
            {
                case 0: car1.setEngine(engine1);
                break;
                case 1: car1.setEngine(engine2);
                break;
                case 2: car1.setEngine(engine3);
                break;
                default: System.out.println("An error has occured");
            }
            costLabel.setText(Integer.toString(car1.totalCost));

        });
        
        carName.addActionListener(ae -> {
            
            car1.setName((carName.getText()));
            costLabel.setText("Your car, " + car1.getName() +
                    ", costs " + car1.totalCost);
            });
              
        carName.addMouseListener(new MouseListener(){
            
            public void mouseEntered(MouseEvent me){
                carName.setCursor(new Cursor(Cursor.TEXT_CURSOR));
            }

            public void mouseExited(MouseEvent me){
                carName.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); 
            }
            
            public void mouseReleased(MouseEvent me){
               
            }
            
            public void mousePressed(MouseEvent me){
                carName.setText("");
            }
            
            public void mouseClicked(MouseEvent me){
                carName.setText("");
            }
            
            
        });
        
        frame.addMouseListener(new MouseListener() {
            
            public void mouseEntered(MouseEvent me){
                //carName.setCursor(new Cursor(Cursor.TEXT_CURSOR));
            }

            public void mouseExited(MouseEvent me){
                //carName.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); 
            }
            
            public void mouseReleased(MouseEvent me){
               
            }
            
            public void mousePressed(MouseEvent me){
               if (!(car1.getName().equals("default")))
                    carName.setText(car1.getName());
                else carName.setText("Name Your Car");
               
               carName.getCaret().setVisible(false);
               
            }
            
            public void mouseClicked(MouseEvent me){
                if (!(car1.getName().equals("default")))
                    carName.setText(car1.getName());
                else carName.setText("Name Your Car");
                carName.getCaret().setVisible(false);
            }
        });
        

        //makeCar.addActionListener(ae -> costLabel.setText("Pressed"));
        
        //costLabel = new JLabel(car1.getName() + "costs" + car1.totalCost);
        
        //chassisList.setFixedCellHeight(50);
       // chassisList.setFixedCellWidth(50);
        //scrollPane = new JScrollPane(chassisList);
        //scrollPane.setMinimumSize(new Dimension(200, 100));
        cPanel.add(chassisList);
        //frame.add(scrollPane);
        tPanel.add(tyresList);
        sPanel.add(suspensionList);
        ePanel.add(engineList);
        frame.add(carName);
        frame.add(costLabel);
        //frame.add(makeCar);
        //frame.pack();
        frame.setVisible(true);
    }
        
        
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new Car_Creator());
   
       // });

    /*double power_weight_ratio = ((car1.getEngine().bhp) * 745.7)
    //        / car1.totalWeight;

    //double top_speed = power_weight_ratio * 0.29;

    System.out.println("Its top speed is: " + top_speed + "MPH");

    //System.out.println(Cars.keySet());*/
    }
}

     
            
       
        








/*System.out.println("Name your car and press enter");
        String name = scan.nextLine();
        Car Car1 = new Car(name, chassis_choice, tyres_choice, 
                suspension_choice, engie
        );
        System.out.println("Pick your chassis (1 for sports, 2 for sedan "
                + "and 3 for pickup truck)");
        int chassis_choice = scan1.nextInt();
        
        switch (chassis_choice){
            case 1: Car1.setChassis(chassis1);
            break;
            case 2: Car1.setChassis(chassis2);
            break;
            case 3: Car1.setChassis(chassis3);
            break;
            default: System.out.println("An error has occured");
        }
        
        System.out.println("Pick your tyres (1 for Pirelli, 2 for Michellin "
                + "and 3 for generic)");
        
        int tyres_choice = scan1.nextInt();
        
        switch (tyres_choice){
            case 1: Car1.setTyres(tyres1);
            break;
            case 2: Car1.setTyres(tyres2);
            break;
            case 3: Car1.setTyres(tyres3);
            break;
            default: System.out.println("An error has occured");
        }
        
        System.out.println("Pick your suspension height (1 for low riding "
                + "2 for mid height and 3 for high riding)");
        int suspension_choice = scan1.nextInt();
        
        switch (suspension_choice){
            case 1: Car1.setSuspension(suspension1);
            break;
            case 2: Car1.setSuspension(suspension2);
            break;
            case 3: Car1.setSuspension(suspension3);
            break;
            default: System.out.println("An error has occured");
        }
        
        System.out.println("Pick your engine (1 for 4L V12, 2 for twin cylinder"
                + " V8 and 3 for standard V6)");
        int engine_choice = scan1.nextInt();
        
        switch (engine_choice){
            case 1: Car1.setEngine(engine1);
            break;
            case 2: Car1.setEngine(engine2);
            break;
            case 3: Car1.setEngine(engine3);
            break;
            default: System.out.println("An error has occured");
        }*/
