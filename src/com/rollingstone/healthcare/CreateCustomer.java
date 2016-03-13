package com.rollingstone.healthcare;

import com.rollingstone.common.Address;

public class CreateCustomer {

  public static void main(String[] args) {
    Address indvAddress1 = new Address("Main Street", "297", "Palatine", "IL", "USA", "60496");
    Address indvAddress2 = new Address("Camac Street", "1297", "Schaumburg", "IL", "USA", "60496");

    Address orgnAddress1 = new Address("Gary Avenue", "297", "Palatine", "IL", "USA", "60496");
    Address orgnAddress2 = new Address("Valco Pkwy", "1300", "Cupertino", "CA", "USA", "90453");
    Address orgnAddress3 =
        new Address("Washington Street", "3297", "Baltimore", "MD", "USA", "30496");
    Address orgnAddress4 = new Address("Ring Road", "5497", "Madison", "WI", "USA", "50496");
    Address orgnAddress5 =
        new Address("Hawthorne Ave", "1297", "West Des Moines", "IA", "USA", "50496");



    IndividualCustomer indvCustomer1 = new IndividualCustomer("0001", indvAddress1, false, true,
        "MT00001", "GT0001", "David", "A", "Smith", "david.smith@someemailprovider.com", true);

    IndividualCustomer indvCustomer2 = new IndividualCustomer("0002", indvAddress1, false, true,
        "MT00002", "GT0001", "Anjella", "", "Smith", "anjellad.smith@someemailprovider.com", false);

    indvCustomer2.setPrimaryCustomerID("0001");

    IndividualCustomer indvCustomer3 = new IndividualCustomer("0003", indvAddress1, false, true,
        "MT00003", "GT0001", "Sam", "A", "Smith", "sam.smith@someemailprovider.com", false);

    indvCustomer2.setPrimaryCustomerID("0001");

    IndividualCustomer indvCustomer4 =
        new IndividualCustomer("0004", indvAddress2, false, true, "MT00004", "GT0001", "Stephen",
            "J", "Sanders", "stephen.sanders@someemailprovider.com", true);

    IndividualCustomer indvCustomer5 =
        new IndividualCustomer("0005", indvAddress2, false, true, "MT00005", "GT0001", "Cameron",
            "", "Sanders", "cameron.sanders@someemailprovider.com", false);

    indvCustomer2.setPrimaryCustomerID("0004");

    IndividualCustomer indvCustomer6 =
        new IndividualCustomer("0006", indvAddress2, false, true, "MT00006", "GT0001", "Elizabeth",
            "", "Sanders", "liz.sanders@someemailprovider.com", false);

    indvCustomer2.setPrimaryCustomerID("0004");

    OrganizationCustomer bigBankHQ =
        new OrganizationCustomer("0007", "Acme Bank Inc", orgnAddress1, true, false, true);

    OrganizationCustomer cupertinoCABranch =
        new OrganizationCustomer("0008", "Acme Cupertino branch ", orgnAddress2, true, false, true);

    OrganizationCustomer schaumburgILcaBranch = new OrganizationCustomer("0009",
        "Acme Schaumburg branch ", orgnAddress3, true, false, true);

    OrganizationCustomer palatineILBranch =
        new OrganizationCustomer("0008", "Acme Palatine branch ", orgnAddress3, true, false, true);

    OrganizationCustomer madisonWIBranch =
        new OrganizationCustomer("0010", "Acme Madison branch ", orgnAddress4, true, false, true);

    OrganizationCustomer desmoinesIABranch = new OrganizationCustomer("0011",
        "Acme West Des Moines   branch ", orgnAddress5, true, false, true);

    bigBankHQ.subsidiaries.add(cupertinoCABranch);
    bigBankHQ.subsidiaries.add(schaumburgILcaBranch);
    bigBankHQ.subsidiaries.add(palatineILBranch);
    bigBankHQ.subsidiaries.add(madisonWIBranch);
    bigBankHQ.subsidiaries.add(desmoinesIABranch);


    createEmployeesForHQ(bigBankHQ);
    createEmployeesForCupertino(cupertinoCABranch);
    createEmployeesForSchaumburg(schaumburgILcaBranch);
    createEmployeesForPalatine(palatineILBranch);
    createEmployeesForMadison(madisonWIBranch);
    createEmployeesForDesMoines(desmoinesIABranch);

    System.out.println("The total number member in :" + bigBankHQ.getName() + " is :"
        + bigBankHQ.getTotalNumberOfMembers());

  }

  private static void createEmployeesForHQ(OrganizationCustomer bigBankHQ) {
    // Creating Employees for HQ

    // Creating Employees for HQ

    Address empAddress1 = new Address("Main Street", "1297", "Palatine", "IL", "USA", "60496");
    Address empAddress2 = new Address("Main Street", "2297", "Palatine", "IL", "USA", "60496");
    Address empAddress3 = new Address("Main Street", "3297", "Palatine", "IL", "USA", "60496");
    Address empAddress4 = new Address("Main Street", "4297", "Palatine", "IL", "USA", "60496");
    Address empAddress5 = new Address("Main Street", "5297", "Palatine", "IL", "USA", "60496");
    Address empAddress6 = new Address("Main Street", "6297", "Palatine", "IL", "USA", "60496");
    Address empAddress7 = new Address("Main Street", "7297", "Palatine", "IL", "USA", "60496");
    Address empAddress8 = new Address("Main Street", "8297", "Palatine", "IL", "USA", "60496");
    Address empAddress9 = new Address("Main Street", "9297", "Palatine", "IL", "USA", "60496");
    Address empAddress10 = new Address("Main Street", "10297", "Palatine", "IL", "USA", "60496");

    IndividualCustomer empCustomer1 = new IndividualCustomer("0012", empAddress1, false, true,
        "MT00003", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer2 = new IndividualCustomer("0013", empAddress2, false, true,
        "MT00004", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer3 = new IndividualCustomer("0014", empAddress3, false, true,
        "MT00005", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer4 = new IndividualCustomer("0015", empAddress4, false, true,
        "MT00006", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer5 = new IndividualCustomer("0016", empAddress5, false, true,
        "MT00007", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer6 = new IndividualCustomer("0017", empAddress6, false, true,
        "MT00008", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer7 = new IndividualCustomer("0018", empAddress7, false, true,
        "MT00009", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer8 = new IndividualCustomer("0019", empAddress8, false, true,
        "MT000010", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer9 = new IndividualCustomer("0020", empAddress9, false, true,
        "MT000011", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer10 = new IndividualCustomer("0021", empAddress10, false, true,
        "MT000012", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);

    bigBankHQ.employees.add(empCustomer1);
    bigBankHQ.employees.add(empCustomer2);
    bigBankHQ.employees.add(empCustomer3);
    bigBankHQ.employees.add(empCustomer4);
    bigBankHQ.employees.add(empCustomer5);
    bigBankHQ.employees.add(empCustomer6);
    bigBankHQ.employees.add(empCustomer7);
    bigBankHQ.employees.add(empCustomer8);
    bigBankHQ.employees.add(empCustomer9);
    bigBankHQ.employees.add(empCustomer10);



  }

  private static void createEmployeesForCupertino(OrganizationCustomer cupertinoCABranch) {

    Address empAddress1 = new Address("Valco Pkwy", "1301", "Cupertino", "CA", "USA", "90453");
    Address empAddress2 = new Address("Valco Pkwy", "1302", "Cupertino", "CA", "USA", "90453");
    Address empAddress3 = new Address("Valco Pkwy", "1303", "Cupertino", "CA", "USA", "90453");
    Address empAddress4 = new Address("Valco Pkwy", "1304", "Cupertino", "CA", "USA", "90453");
    Address empAddress5 = new Address("Valco Pkwy", "1305", "Cupertino", "CA", "USA", "90453");
    Address empAddress6 = new Address("Valco Pkwy", "1306", "Cupertino", "CA", "USA", "90453");
    Address empAddress7 = new Address("Valco Pkwy", "1307", "Cupertino", "CA", "USA", "90453");
    Address empAddress8 = new Address("Valco Pkwy", "1308", "Cupertino", "CA", "USA", "90453");
    Address empAddress9 = new Address("Valco Pkwy", "1309", "Cupertino", "CA", "USA", "90453");
    Address empAddress10 = new Address("Valco Pkwy", "1310", "Cupertino", "CA", "USA", "90453");


    IndividualCustomer empCustomer1 = new IndividualCustomer("0022", empAddress1, false, true,
        "MT00013", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer2 = new IndividualCustomer("0023", empAddress2, false, true,
        "MT00014", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer3 = new IndividualCustomer("0024", empAddress3, false, true,
        "MT00015", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer4 = new IndividualCustomer("0025", empAddress4, false, true,
        "MT00016", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer5 = new IndividualCustomer("0026", empAddress5, false, true,
        "MT00017", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer6 = new IndividualCustomer("0027", empAddress6, false, true,
        "MT00018", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer7 = new IndividualCustomer("0028", empAddress7, false, true,
        "MT00019", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer8 = new IndividualCustomer("0029", empAddress8, false, true,
        "MT000020", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer9 = new IndividualCustomer("0030", empAddress9, false, true,
        "MT000021", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer10 = new IndividualCustomer("0031", empAddress10, false, true,
        "MT0000122", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);

    cupertinoCABranch.employees.add(empCustomer1);
    cupertinoCABranch.employees.add(empCustomer2);
    cupertinoCABranch.employees.add(empCustomer3);
    cupertinoCABranch.employees.add(empCustomer4);
    cupertinoCABranch.employees.add(empCustomer5);
    cupertinoCABranch.employees.add(empCustomer6);
    cupertinoCABranch.employees.add(empCustomer7);
    cupertinoCABranch.employees.add(empCustomer8);
    cupertinoCABranch.employees.add(empCustomer9);
    cupertinoCABranch.employees.add(empCustomer10);



  }

  private static void createEmployeesForSchaumburg(OrganizationCustomer schaumburgILBranch) {
    // Creating Employees for HQ

    Address empAddress1 = new Address("Camac Street", "1297", "Schaumburg", "IL", "USA", "60496");
    Address empAddress2 = new Address("Camac Street", "1297", "Schaumburg", "IL", "USA", "60496");
    Address empAddress3 = new Address("Camac Street", "1297", "Schaumburg", "IL", "USA", "60496");
    Address empAddress4 = new Address("Camac Street", "1297", "Schaumburg", "IL", "USA", "60496");
    Address empAddress5 = new Address("Camac Street", "1297", "Schaumburg", "IL", "USA", "60496");
    Address empAddress6 = new Address("Camac Street", "1297", "Schaumburg", "IL", "USA", "60496");
    Address empAddress7 = new Address("Camac Street", "1297", "Schaumburg", "IL", "USA", "60496");
    Address empAddress8 = new Address("Camac Street", "1297", "Schaumburg", "IL", "USA", "60496");
    Address empAddress9 = new Address("Camac Street", "1297", "Schaumburg", "IL", "USA", "60496");
    Address empAddress10 = new Address("Camac Street", "1297", "Schaumburg", "IL", "USA", "60496");

    IndividualCustomer empCustomer1 = new IndividualCustomer("0012", empAddress1, false, true,
        "MT00003", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer2 = new IndividualCustomer("0013", empAddress2, false, true,
        "MT00004", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer3 = new IndividualCustomer("0014", empAddress3, false, true,
        "MT00005", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer4 = new IndividualCustomer("0015", empAddress4, false, true,
        "MT00006", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer5 = new IndividualCustomer("0016", empAddress5, false, true,
        "MT00007", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer6 = new IndividualCustomer("0017", empAddress6, false, true,
        "MT00008", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer7 = new IndividualCustomer("0018", empAddress7, false, true,
        "MT00009", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer8 = new IndividualCustomer("0019", empAddress8, false, true,
        "MT000010", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer9 = new IndividualCustomer("0020", empAddress9, false, true,
        "MT000011", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer10 = new IndividualCustomer("0021", empAddress10, false, true,
        "MT000012", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);

    schaumburgILBranch.employees.add(empCustomer1);
    schaumburgILBranch.employees.add(empCustomer2);
    schaumburgILBranch.employees.add(empCustomer3);
    schaumburgILBranch.employees.add(empCustomer4);
    schaumburgILBranch.employees.add(empCustomer5);
    schaumburgILBranch.employees.add(empCustomer6);
    schaumburgILBranch.employees.add(empCustomer7);
    schaumburgILBranch.employees.add(empCustomer8);
    schaumburgILBranch.employees.add(empCustomer9);
    schaumburgILBranch.employees.add(empCustomer10);


  }

  private static void createEmployeesForPalatine(OrganizationCustomer palatineILBranch) {
    // Creating Employees for HQ

    Address empAddress1 = new Address("Main Street", "1297", "Palatine", "IL", "USA", "60496");
    Address empAddress2 = new Address("Main Street", "2297", "Palatine", "IL", "USA", "60496");
    Address empAddress3 = new Address("Main Street", "3297", "Palatine", "IL", "USA", "60496");
    Address empAddress4 = new Address("Main Street", "4297", "Palatine", "IL", "USA", "60496");
    Address empAddress5 = new Address("Main Street", "5297", "Palatine", "IL", "USA", "60496");
    Address empAddress6 = new Address("Main Street", "6297", "Palatine", "IL", "USA", "60496");
    Address empAddress7 = new Address("Main Street", "7297", "Palatine", "IL", "USA", "60496");
    Address empAddress8 = new Address("Main Street", "8297", "Palatine", "IL", "USA", "60496");
    Address empAddress9 = new Address("Main Street", "9297", "Palatine", "IL", "USA", "60496");
    Address empAddress10 = new Address("Main Street", "10297", "Palatine", "IL", "USA", "60496");

    IndividualCustomer empCustomer1 = new IndividualCustomer("0012", empAddress1, false, true,
        "MT00003", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer2 = new IndividualCustomer("0013", empAddress2, false, true,
        "MT00004", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer3 = new IndividualCustomer("0014", empAddress3, false, true,
        "MT00005", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer4 = new IndividualCustomer("0015", empAddress4, false, true,
        "MT00006", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer5 = new IndividualCustomer("0016", empAddress5, false, true,
        "MT00007", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer6 = new IndividualCustomer("0017", empAddress6, false, true,
        "MT00008", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer7 = new IndividualCustomer("0018", empAddress7, false, true,
        "MT00009", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer8 = new IndividualCustomer("0019", empAddress8, false, true,
        "MT000010", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer9 = new IndividualCustomer("0020", empAddress9, false, true,
        "MT000011", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer10 = new IndividualCustomer("0021", empAddress10, false, true,
        "MT000012", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);

    palatineILBranch.employees.add(empCustomer1);
    palatineILBranch.employees.add(empCustomer2);
    palatineILBranch.employees.add(empCustomer3);
    palatineILBranch.employees.add(empCustomer4);
    palatineILBranch.employees.add(empCustomer5);
    palatineILBranch.employees.add(empCustomer6);
    palatineILBranch.employees.add(empCustomer7);
    palatineILBranch.employees.add(empCustomer8);
    palatineILBranch.employees.add(empCustomer9);
    palatineILBranch.employees.add(empCustomer10);


  }

  private static void createEmployeesForMadison(OrganizationCustomer madisonWIBranch) {
    // Creating Employees for HQ

    Address empAddress1 = new Address("Main Street", "1297", "Palatine", "IL", "USA", "60496");
    Address empAddress2 = new Address("Main Street", "2297", "Palatine", "IL", "USA", "60496");
    Address empAddress3 = new Address("Main Street", "3297", "Palatine", "IL", "USA", "60496");
    Address empAddress4 = new Address("Main Street", "4297", "Palatine", "IL", "USA", "60496");
    Address empAddress5 = new Address("Main Street", "5297", "Palatine", "IL", "USA", "60496");
    Address empAddress6 = new Address("Main Street", "6297", "Palatine", "IL", "USA", "60496");
    Address empAddress7 = new Address("Main Street", "7297", "Palatine", "IL", "USA", "60496");
    Address empAddress8 = new Address("Main Street", "8297", "Palatine", "IL", "USA", "60496");
    Address empAddress9 = new Address("Main Street", "9297", "Palatine", "IL", "USA", "60496");
    Address empAddress10 = new Address("Main Street", "10297", "Palatine", "IL", "USA", "60496");

    IndividualCustomer empCustomer1 = new IndividualCustomer("0012", empAddress1, false, true,
        "MT00003", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer2 = new IndividualCustomer("0013", empAddress2, false, true,
        "MT00004", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer3 = new IndividualCustomer("0014", empAddress3, false, true,
        "MT00005", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer4 = new IndividualCustomer("0015", empAddress4, false, true,
        "MT00006", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer5 = new IndividualCustomer("0016", empAddress5, false, true,
        "MT00007", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer6 = new IndividualCustomer("0017", empAddress6, false, true,
        "MT00008", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer7 = new IndividualCustomer("0018", empAddress7, false, true,
        "MT00009", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer8 = new IndividualCustomer("0019", empAddress8, false, true,
        "MT000010", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer9 = new IndividualCustomer("0020", empAddress9, false, true,
        "MT000011", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer10 = new IndividualCustomer("0021", empAddress10, false, true,
        "MT000012", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);

    madisonWIBranch.employees.add(empCustomer1);
    madisonWIBranch.employees.add(empCustomer2);
    madisonWIBranch.employees.add(empCustomer3);
    madisonWIBranch.employees.add(empCustomer4);
    madisonWIBranch.employees.add(empCustomer5);
    madisonWIBranch.employees.add(empCustomer6);
    madisonWIBranch.employees.add(empCustomer7);
    madisonWIBranch.employees.add(empCustomer8);
    madisonWIBranch.employees.add(empCustomer9);
    madisonWIBranch.employees.add(empCustomer10);


  }

  private static void createEmployeesForDesMoines(OrganizationCustomer desmoinesIABranch) {
    // Creating Employees for HQ

    Address empAddress1 = new Address("Main Street", "1297", "Palatine", "IL", "USA", "60496");
    Address empAddress2 = new Address("Main Street", "2297", "Palatine", "IL", "USA", "60496");
    Address empAddress3 = new Address("Main Street", "3297", "Palatine", "IL", "USA", "60496");
    Address empAddress4 = new Address("Main Street", "4297", "Palatine", "IL", "USA", "60496");
    Address empAddress5 = new Address("Main Street", "5297", "Palatine", "IL", "USA", "60496");
    Address empAddress6 = new Address("Main Street", "6297", "Palatine", "IL", "USA", "60496");
    Address empAddress7 = new Address("Main Street", "7297", "Palatine", "IL", "USA", "60496");
    Address empAddress8 = new Address("Main Street", "8297", "Palatine", "IL", "USA", "60496");
    Address empAddress9 = new Address("Main Street", "9297", "Palatine", "IL", "USA", "60496");
    Address empAddress10 = new Address("Main Street", "10297", "Palatine", "IL", "USA", "60496");

    IndividualCustomer empCustomer1 = new IndividualCustomer("0012", empAddress1, false, true,
        "MT00003", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer2 = new IndividualCustomer("0013", empAddress2, false, true,
        "MT00004", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer3 = new IndividualCustomer("0014", empAddress3, false, true,
        "MT00005", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer4 = new IndividualCustomer("0015", empAddress4, false, true,
        "MT00006", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer5 = new IndividualCustomer("0016", empAddress5, false, true,
        "MT00007", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer6 = new IndividualCustomer("0017", empAddress6, false, true,
        "MT00008", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer7 = new IndividualCustomer("0018", empAddress7, false, true,
        "MT00009", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer8 = new IndividualCustomer("0019", empAddress8, false, true,
        "MT000010", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer9 = new IndividualCustomer("0020", empAddress9, false, true,
        "MT000011", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);
    IndividualCustomer empCustomer10 = new IndividualCustomer("0021", empAddress10, false, true,
        "MT000012", "GT0002", "David", "A", "Smith", "david.smith@someemailprovider.com", true);

    desmoinesIABranch.employees.add(empCustomer1);
    desmoinesIABranch.employees.add(empCustomer2);
    desmoinesIABranch.employees.add(empCustomer3);
    desmoinesIABranch.employees.add(empCustomer4);
    desmoinesIABranch.employees.add(empCustomer5);
    desmoinesIABranch.employees.add(empCustomer6);
    desmoinesIABranch.employees.add(empCustomer7);
    desmoinesIABranch.employees.add(empCustomer8);
    desmoinesIABranch.employees.add(empCustomer9);
    desmoinesIABranch.employees.add(empCustomer10);


  }
}

