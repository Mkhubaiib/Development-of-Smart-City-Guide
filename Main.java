package com.Khubaibcompany;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"\t\tWelcome to Smart City Islamabad!\n","Welcome Message",JOptionPane.INFORMATION_MESSAGE);
        int choice_main = 0;
        do {
            try {
                String str = ("""
                        Press 1 for Admin Portal
                        Press 2 for User Portal
                        Press 3 to close the App
                        
                        Enter your choice:
                        """);
                choice_main = taking_input(str);

                switch (choice_main) {
                    case 1:
                        boolean flag;
                        do {
                            try {
                                int password = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your password: ","20212022"));
                                if (password == 20212022) {
                                    JOptionPane.showMessageDialog(null, "Welcome to Admin Portal!","Welcome Message",JOptionPane.INFORMATION_MESSAGE);
                                    administration();
                                    flag = false;
                                }
                                else {
                                    JOptionPane.showMessageDialog(null, "Incorrect Password!","Error Message",JOptionPane.ERROR_MESSAGE);
                                    flag = true;
                                }
                            }
                            catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Invalid Characters!\nEnter digits only","Error Message",JOptionPane.ERROR_MESSAGE);
                                flag = true;
                            }
                        }
                        while (flag);

                        break;

                    case 2:
                        user();
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Thanks for using the App!'\nApp Closed!","Thanks Message",JOptionPane.INFORMATION_MESSAGE);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Plz enter correct choice!","Error",JOptionPane.ERROR_MESSAGE);
                }
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Plz enter correct choice!","Error",JOptionPane.ERROR_MESSAGE);
            }

        }
        while (choice_main != 3);
    }

    //    module for taking user input
    public static int taking_input(String str) {
        boolean flag;
        int input = 0;

        do {
            try {
                input = Integer.parseInt(JOptionPane.showInputDialog(str));
                flag = false;
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid Characters!\nEnter digits only","Error Message",JOptionPane.ERROR_MESSAGE);
                flag = true;
            }
        }
        while (flag);

        return input;
    }

    //    module for the Administrator
    public static void administration() {
        int choice_administration = 0;

        do {
            try {
                System.out.println();

                String str = ("""
                        Press 1 for data entry
                        Press 2 for data deletion
                        Press 3 to close the Admin Portal
                        
                        Enter your choice:
                        """);
                choice_administration = taking_input(str);

                switch (choice_administration) {
                    case 1:
                        enterData();
                        break;
                    case 2:
                        deleteData();
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Thanks for using the Admin Portal!","Thanks Message",JOptionPane.INFORMATION_MESSAGE);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "\"Plz enter correct choice!","Error Message",JOptionPane.ERROR_MESSAGE);
                        System.out.println();
                }
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\"Plz enter correct choice!","Error Message",JOptionPane.ERROR_MESSAGE);
            }

        }
        while (choice_administration != 3);
    }

    //    module for the user
    public static void user() {
        JOptionPane.showMessageDialog(null, "Welcome to user Portal!");
        int choice_user= 0;
        do {
            try {
                System.out.println("\n");
               String str =("""
                        Press 1 for Tourism
                        Press 2 for Universities
                        Press 3 for Job
                        Press 4 for Business
                        Press 5 for Transportation
                        Press 6 for Hotels
                        Press 7 for Hospitals
                        Press 8 for Shopping
                        Press 9 for Emergency HelpLines
                        Press 0 to close the User Portal
                        
                        Enter your choice:
                        """);
                choice_user = taking_input(str);

                switch (choice_user) {
                    case 1:
                        userTourism();
                        break;
                    case 2:
                        userEducation();
                        break;
                    case 3:
                        userJob();
                        break;
                    case 4:
                        userBusiness();
                        break;
                    case 5:
                        userTransportation();
                        break;
                    case 6:
                        userHotels();
                        break;
                    case 7:
                        userHospitals();
                        break;
                    case 8:
                        userShopping();
                        break;
                    case 9:
                        userEmergencyHelpline();
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Thanks for using the User Portal!","Thanks Message",JOptionPane.INFORMATION_MESSAGE);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "\"Plz enter correct choice!","Error Message",JOptionPane.ERROR_MESSAGE);
                }
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "\"Plz enter correct choice!","Error Message",JOptionPane.ERROR_MESSAGE);
            }

        }
        while (choice_user != 0);
    }


//    module for entering data into the file
    public static void enterData(){
        int choice_administration = 0;
        do {
            try {
                System.out.println();
                System.out.println();

                String str = ("""
                        Press 1 for Tourism
                        Press 2 for Universities
                        Press 3 for Job
                        Press 4 for Business
                        Press 5 for Transportation
                        Press 6 for Hotels
                        Press 7 for Hospitals
                        Press 8 for Shopping
                        Press 9 for Emergency HelpLines
                        Press 0 to close
                        
                        Enter your choice:
                        """);
                choice_administration = taking_input(str);
                int entries;
                switch (choice_administration) {

                    case 1:
                        str = "\nWelcome to Tourism\nHow many entries you want to make?";
                        entries = taking_input(str);
                        for (int i = 0; i < entries; i++){
                            adminTourism();
                        }
                        JOptionPane.showMessageDialog(null, "Tourism Exited!","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        str = "\nWelcome to Education\nHow many entries you want to make?";
                        entries = taking_input(str);
                        for (int i = 0; i < entries; i++){
                            adminEducation();
                        }
                        JOptionPane.showMessageDialog(null, "Education Exited!","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        str = "\nWelcome to Jobs\nHow many entries you want to make?";
                        entries = taking_input(str);
                        for (int i = 0; i < entries; i++){
                            adminJob();
                        }
                        JOptionPane.showMessageDialog(null, "Jobs Exited!","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 4:
                        str = "\nWelcome to Business\nHow many entries you want to make?";
                        entries = taking_input(str);
                        for (int i = 0; i < entries; i++){
                            adminBusiness();
                        }
                        JOptionPane.showMessageDialog(null, "Businesses Exited!","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 5:
                        str = "\nWelcome to Transportation\nHow many entries you want to make?";
                        entries = taking_input(str);
                        for (int i = 0; i < entries; i++) {
                            adminTransportation();
                        }
                        JOptionPane.showMessageDialog(null, "Transportations Exited!","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        str = "\nWelcome to Hotels\nHow many entries you want to make?";
                        entries = taking_input(str);
                        for (int i = 0; i < entries; i++){
                            adminHotels();
                        }
                        JOptionPane.showMessageDialog(null, "Hotels Exited!","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 7:
                        str = "\nWelcome to Hospitals\nHow many entries you want to make?";
                        entries = taking_input(str);
                        for (int i = 0; i < entries; i++){
                            adminHospitals();
                         }
                        JOptionPane.showMessageDialog(null, "Hospitals Exited!","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 8:
                        str = ("\nWelcome to Shopping\nHow many entries you want to make?");
                        entries = taking_input(str);
                        for (int i = 0; i < entries; i++) {
                            adminShopping();
                        }
                        JOptionPane.showMessageDialog(null, "Shopping Exited!","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 9:
                        str = ("\nWelcome to Emergency HelpLine\nHow many entries you want to make?");
                        entries = taking_input(str);
                        for (int i = 0; i < entries; i++) {
                            adminEmergencyHelpline();
                        }
                        JOptionPane.showMessageDialog(null, "Emergency Helplines Exited!","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Exiting from Data Entry!","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "\"Plz enter correct choice!","Error Message",JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "\"Plz enter correct choice!","Error Message",JOptionPane.ERROR_MESSAGE);
            }

        }
        while (choice_administration != 0);
    }
//    module for deleting records of a file
    public static void deleteData(){
        int choice_administration = 0;
        do {
            try {
                String str =  ("""
                        Press 1 for Tourism
                        Press 2 for Universities
                        Press 3 for Job
                        Press 4 for Business
                        Press 5 for Transportation
                        Press 6 for Hotels
                        Press 7 for Hospitals
                        Press 8 for Shopping
                        Press 9 for Emergency HelpLines
                        Press 0 to close
                        
                        Enter Your Choice:
                        """);
                choice_administration = taking_input(str);
                int entries;
                switch (choice_administration) {

                    case 1:
                        str = "\nWelcome to Tourism\nHow many entries you want to delete?";
                        entries = taking_input(str);
                        for (int i = 0; i < entries; i++){
                            String delete = JOptionPane.showInputDialog("Entre the Tourism place to delete: ");
                            deleteFile("Tourism.txt",delete);
                        }
                        JOptionPane.showMessageDialog(null, "Tourism Exited!","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        str=("\nWelcome to Education\nHow many entries you want to delete?");
                        entries = taking_input(str);
                        for (int i = 0; i < entries; i++){
                            String delete = JOptionPane.showInputDialog("Entre the Educational institute to delete: ");
                            deleteFile("Education.txt",delete);
                        }
                        JOptionPane.showMessageDialog(null, "Education Exited!","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        str = "\nWelcome to Jobs\nHow many entries you want to delete?";
                        entries = taking_input(str);
                        for (int i = 0; i < entries; i++){
                            String delete = JOptionPane.showInputDialog("Entre the Jobs to delete: ");
                            deleteFile("Jobs.txt",delete);
                        }
                        JOptionPane.showMessageDialog(null, "Jobs Exited!","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 4:
                        str = "\nWelcome to Business\nHow many entries you want to delete?";
                        entries = taking_input(str);
                        for (int i = 0; i < entries; i++){
                            String delete = JOptionPane.showInputDialog("Entre the Business to delete: ");
                            deleteFile("Business.txt",delete);

                        }
                        JOptionPane.showMessageDialog(null, "Businesses Exited!","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 5:
                        str = "\nWelcome to Transportation\nHow many entries you want to delete?";
                        entries = taking_input(str);
                        for (int i = 0; i < entries; i++){
                            String delete = JOptionPane.showInputDialog("Entre the Transport to delete: ");
                            deleteFile("Transportation.txt",delete);
                        }
                        JOptionPane.showMessageDialog(null, "Transportations Exited!","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        System.out.println();
                        System.out.println("How many entries you want to delete?");
                        str = "\nWelcome to Hotels\nHow many entries you want to delete?";
                        entries = taking_input(str);
                        for (int i = 0; i < entries; i++){
                            String delete = JOptionPane.showInputDialog("Entre the Hotels to delete: ");
                            deleteFile("Hotels.txt",delete);
                        }
                        JOptionPane.showMessageDialog(null, "Hotels Exited!","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 7:
                        str = "\nWelcome to Hospitals\nHow many entries you want to delete?";
                        entries = taking_input(str);
                        for (int i = 0; i < entries; i++){
                            String delete = JOptionPane.showInputDialog("Entre the Hospitals to delete: ");
                            deleteFile("Hospitals.txt",delete);
                        }
                        JOptionPane.showMessageDialog(null, "Hospitals Exited!","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 8:
                        str = "\nWelcome to Shopping\nHow many entries you want to delete?";
                        entries = taking_input(str);
                        for (int i = 0; i < entries; i++) {
                            String delete = JOptionPane.showInputDialog("Entre the Shopping store to delete: ");
                            deleteFile("ShoppingMalls.txt",delete);
                        }
                        JOptionPane.showMessageDialog(null, "Shopping Exited!","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 9:
                        str = "\nWelcome to Emergency HelpLine\nHow many entries you want to delete?";
                        entries = taking_input(str);
                        for (int i = 0; i < entries; i++) {
                            String delete = JOptionPane.showInputDialog("Entre the Emergency HelpLine to delete: ");
                            deleteFile("EmergencyHelpLines.txt",delete);
                        }
                        JOptionPane.showMessageDialog(null, "Emergency Helplines Exited!","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Exiting from Data Deletion!","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "\"Plz enter correct choice!","Error Message",JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "\"Plz enter correct choice!","Error Message",JOptionPane.ERROR_MESSAGE);
            }

        }
        while (choice_administration != 0);
    }


//    module for Admin to manage Tourism Information
    public static void adminTourism() throws IOException{
        writeFile("Tourism.txt");
        }
//    module for Admin to manage Education Information
    public static void adminEducation() throws IOException{
        writeFile("Education.txt");
    }
    //    module for Admin to manage Jobs Information
    public static void adminJob() throws IOException{
        writeFile("Jobs.txt");
    }
    //    module for Admin to manage Business Information
    public static void adminBusiness() throws IOException{
        writeFile("Business.txt");
    }
    //    module for Admin to manage Hospitals Information
    public static void adminHospitals() throws IOException{
        writeFile("Hospitals.txt");
    }
    //    module for Admin to manage Hotels Information
    public static void adminHotels() throws IOException{
        writeFile("Hotels.txt");
    }
    //    module for Admin to manage Transportation Information
    public static void adminTransportation() throws IOException{
        writeFile("Transportation.txt");
    }
    //    module for Admin to manage Shopping Information
    public static void adminShopping() throws IOException{
        writeFile("ShoppingMalls.txt");
    }
    //    module for Admin to manage Emergency Helplines Information
    public static void adminEmergencyHelpline() throws IOException{
        writeFile("EmergencyHelpLines.txt");
    }

    //    module for User to access Tourism Information
    public static void userTourism(){
        String str = "\nWelcome to Tourism!\n\nTourism Places are the following:\n";
        readFile("Tourism.txt",str);}
    //    module for User to access Education Information
    public static void userEducation(){
        String str = "\nWelcome to Education!\n\nEducational institutes are the following:\n";
        readFile("Education.txt",str);}
    //    module for User to access Jobs Information
    public static void userJob(){
        String str = "\nWelcome to Jobs!\n\nAvailable Jobs are the following:\n";
        readFile("Jobs.txt",str);
    }
    //    module for User to access Business Information
    public static void userBusiness(){
        String str = "\nWelcome to Businesses!\n\nBusiness are the following:\n";
        readFile("Business.txt",str);
    }
    //    module for User to access Hospitals Information
    public static void userHospitals(){
        String str = "\nWelcome to Hospitals!\n\nHospitals are the following:\n";
        readFile("Hospitals.txt",str);
    }
    //    module for User to access Hotels Information
    public static void userHotels() {
        String str ="\nWelcome to Hotels!\n\nHotels are the following:\n";

        readFile("Hotels.txt",str);
    }
    //    module for User to access Transportation Information
    public static void userTransportation() {
        String str = "\nWelcome to Transportations!\n\nTransportation are the following:\n";

        readFile("Transportation.txt",str);
    }
    //    module for User to access Shopping Information
    public static void userShopping() {
        String str = "\nWelcome to Shopping!\n\nShopping places are the following:\n";
        readFile("ShoppingMalls.txt",str);
    }
    //    module for User to access Emergency Helplines Information
    public static void userEmergencyHelpline(){
        String str = "\nWelcome to Emergency Helplines!\n\nEmergency HelpLines are the following:\n";
        readFile("EmergencyHelpLines.txt",str);
    }

//    module to write data to a File
    public static void writeFile(String fileName) throws IOException{
        File file = new File(fileName);
        FileWriter wf = new FileWriter(file, true);
//        Scanner input = new Scanner(System.in);
        String data = JOptionPane.showInputDialog("Enter the data: ");
        wf.write(data+"\n");
        wf.close();
    }
//    module to read data from a File
    public static void readFile(String fileName,String str){
        String data = "";
        try {
            File f1 = new File(fileName);
            Scanner readF = new Scanner(f1);
            while (readF.hasNext())
            {
                data+=(readF.nextLine())+"\n";
            }
            JOptionPane.showMessageDialog(null,str+"\n"+data,"Output",JOptionPane.INFORMATION_MESSAGE);
            readF.close();
        }
        catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"File not found!","Error Message",JOptionPane.ERROR_MESSAGE);
        }
    }
//    module to delete data from a File
    public static void deleteFile(String path, String delete) throws IOException {
        //Locate the file
        File file = new File(path);
        //Create a temporary file (avoid memory call)
        File temp = File.createTempFile("file", ".txt", file.getParentFile());
        //Determine the charset
        String charset = "UTF-8";
        //Open file
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        //Open the temp file for writing
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(temp), charset));
        //Read line by line (not good) generate minimum O(n)
        for (String line; (line = reader.readLine()) != null;) {
            //Determine the string from the file
            line = line.replace(delete, "\n");
            writer.write(line+"\n");
        }

        reader.close();
        writer.close();

        file.delete();
        temp.renameTo(file);
    }
}