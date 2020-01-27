import java.io.*;
import java.util.Scanner;

class Studentrec {
    String sname,sgender,sbloodgroup;
    int sage,ssid,sid;
    long sphonenumber;
    public int q[]=new int[100];
    String str1="";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void displayprecord() {
        System.out.println("\t #####Student Details#####");
        System.out.print("I.D. Number:"+sid);
        System.out.print("\tName:"+sname);
        System.out.print("\tAge:"+sage);
        System.out.print("\tGender:"+sgender);
        System.out.print("\tBlood Group:"+sbloodgroup);
        System.out.print("\tPhone Number:"+sphonenumber);
        System.out.println("\n");
    }

    public void pim()  throws IOException {
        int a,k,x,i=0;
        boolean flag1=true;
        while(flag1)
        {
            System.out.println("1. Write Record ");
            System.out.println("2. Update Record ");
            System.out.println("3. Search");
            System.out.println("4. Display Record");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            a= Integer.parseInt(br.readLine());
            switch(a)
            {
                case 1: // Creation of Student file
                    FileWriter fout1 = new FileWriter("student.txt");
                    //Read data from Keyboard
                    System.out.println("How many students?");
                    x= Integer.parseInt(br.readLine());
                    for(k=0;k<x;k++)
                    {
                        System.out.print("Enter student Name:");
                        sname=br.readLine();
                        System.out.print("Enter phone Number:");
                        sphonenumber= Integer.parseInt(br.readLine());
                        System.out.print("Enter Age:");
                        sage =Integer.parseInt(br.readLine());
                        System.out.print("Enter Gender:");
                        sgender=br.readLine();
                        System.out.print("Enter Bloodgroup:");
                        sbloodgroup=br.readLine();
                        System.out.print("Enter I.D. Number:");
                        sid=Integer.parseInt(br.readLine());
                        q[i] = sid;i++;
// Written to Patient file
                        fout1.write(sphonenumber+" \n");
                        fout1.write(sname+" \n");
                        fout1.write(sage+" \n");
                        fout1.write(sgender+" \n");
                        fout1.write(sbloodgroup+" \n");
                        fout1.write(sid+" \n\n");
                    }
// fout1.write("EOF");
                    fout1.close();
                    System.out.println("\nFile is created\n");
                    break;
                case 2: // Updation of Patient file
                    FileWriter fout2 = new FileWriter("student.txt",true);
                    //Read data from Keyboard
                    System.out.println("How many students?");
                    x= Integer.parseInt(br.readLine());
                    for(k=0;k<x;k++)
                    {
                        System.out.print("Enter student Name:");
                        sname=br.readLine();
                        System.out.print("Enter Phone Number:");
                        sphonenumber= Integer.parseInt(br.readLine());
                        System.out.print("Enter Age:");
                        sage =Integer.parseInt(br.readLine());
                        System.out.print("Enter Gender:");
                        sgender=br.readLine();
                        System.out.print("Enter Bloodgroup:");
                        sbloodgroup=br.readLine();
                        System.out.print("Enter I.D. Number:");
                        sid=Integer.parseInt(br.readLine());
                        q[i] = sid;i++;

                        // Written to Patient file
                        fout2.write(sphonenumber+" \n");
                        fout2.write(sname+" \n");
                        fout2.write(sage+" \n");
                        fout2.write(sgender+" \n");
                        fout2.write(sbloodgroup+" \n");
                        fout2.write(sid+" \n\n");
                    }
// fout2.write("EOF");
                    fout2.close();
                    System.out.println("\nFile is updated\n");

                    break;
                case 3: System.out.print("Enter Student I.D. Number:");
                    ssid = Integer.parseInt(br.readLine());
                case 4: FileReader fin = new FileReader("student.txt");
                    Scanner sc = new Scanner(fin);
                    try {
                        while (sc.hasNextInt()) {
                            //Read data from file
                            sphonenumber = sc.nextInt();
                            sname = sc.next();
                            sage = sc.nextInt();
                            sgender = sc.next();
                            sbloodgroup = sc.next();
                            sid = sc.nextInt();
                            q[i] = sid;
                            if (a == 4)
                                displayprecord();
                            else if (a == 3) {
                                if (ssid == q[i])
                                    displayprecord();
                                else
                                    System.out.println("Record not found");
                            }
                        }
                        str1 = sc.next();
                        if (str1.equals("EOF")) {
                            System.out.println("End of file");
                        } else {
                            System.out.println("File format error.");
                        }
                    }
                    catch (Exception ae){

                    }
                    finally{
                        fin.close();
                    }
                    //fin.close();
                    break;
                case 5: flag1=false;
                    break;
                default:System.out.println("Wrong Choice!!");
                    flag1=false;
            }
        }
    }
}
class Doctorrec {
    String dname,dgender,dspecial;
    int dage,dphonenumber,sdid,did;
    public int r[]=new int[100];
    String str2="";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void displaydrecord() {
        System.out.println("\t #####Doctor Details#####");
        System.out.print("I.D. Number:"+did);
        System.out.print("\tName:"+dname);
        System.out.print("\tAge:"+dage);	
        System.out.print("\tGender:"+dgender);
        System.out.print("\tBlood Group:"+dspecial);
        System.out.print("\tPhone Number:"+dphonenumber);
        System.out.println("\n");
    }
    public void dim() throws IOException {
        int b,l,y;
        boolean flag2=true;
        while(flag2)
        {
            System.out.println("1. Write Record ");
            System.out.println("2. Update Record ");
            System.out.println("3. Search");
            System.out.println("4. Display Record");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            b= Integer.parseInt(br.readLine());
            switch(b)
            {
                case 1: // Creation of Doctor file
                    FileWriter fout1 = new FileWriter("doctor.txt");
                    System.out.println("How many Doctors?\t");
                    y= Integer.parseInt(br.readLine());
                    for(l=0;l<y;l++)
                    {
                        System.out.print("Enter Doctor Name:");
                        dname=br.readLine();
                        System.out.print("Enter Phone Number:");
                        dphonenumber= Integer.parseInt(br.readLine());
                        System.out.print("Enter Age:");
                        dage =Integer.parseInt(br.readLine());
                        System.out.print("Enter Gender:");
                        dgender=br.readLine();
                        System.out.print("Enter Specialisation:");
                        dspecial=br.readLine();
                        System.out.print("Enter I.D. Number:");
                        did=Integer.parseInt(br.readLine());

                        // Written to Doctor file
                        fout1.write(dphonenumber+" \n");
                        fout1.write(dname+" \n");
                        fout1.write(dage+" \n");
                        fout1.write(dgender+" \n");
                        fout1.write(dspecial+" \n");
                        fout1.write(did+" \n\n");
                    }
// fout1.write("EOF");
                    fout1.close();
                    System.out.println("\nFile is created\n");
                    break;
                case 2: // Updation of Doctor file
                    FileWriter fout2 = new FileWriter("doctor.txt",true);
                    System.out.println("How many Doctors?\t");
                    y= Integer.parseInt(br.readLine());
                    for(l=0;l<y;l++)
                    {
                        System.out.print("Enter Doctor Name:");
                        dname=br.readLine();
                        System.out.print("Enter Phone Number:");
                        dphonenumber= Integer.parseInt(br.readLine());
                        System.out.print("Enter Age:");
                        dage =Integer.parseInt(br.readLine());
                        System.out.print("Enter Gender:");
                        dgender=br.readLine();
                        System.out.print("Enter Specialisation:");
                        dspecial=br.readLine();
                        System.out.print("Enter I.D. Number:");
                        did=Integer.parseInt(br.readLine());

                        // Written to Doctor file
                        fout2.write(dphonenumber+" \n");
                        fout2.write(dname+" \n");
                        fout2.write(dage+" \n");
                        fout2.write(dgender+" \n");
                        fout2.write(dspecial+" \n");
                        fout2.write(did+" \n\n");
                    }
// fout2.write("EOF");
                    fout2.close();
                    System.out.println("\nFile is updated\n");
                    break;
                case 3: System.out.print("Enter Doctor I.D. Number:");
                    sdid = Integer.parseInt(br.readLine());
                case 4: FileReader fin = new FileReader("doctor.txt");
                    Scanner sc = new Scanner(fin);
                    try {
                        while (sc.hasNextInt()) {
                            //Read data from file
                            dphonenumber = sc.nextInt();
                            dname = sc.next();
                            dage = sc.nextInt();
                            dgender = sc.next();
                            dspecial = sc.next();
                            did = sc.nextInt();
                            int i = 0;
                            r[i] = did;
                            i++;
                            if (b == 4)
                                displaydrecord();
                            else if (b == 3) {
                                if (sdid == did)
                                    displaydrecord();
                                else
                                    System.out.println("Record not found");
                            }
                        }
                        str2 = sc.next();
                        if (str2.equals("EOF")) {
                            System.out.println("End of file");
                        } else {
                            System.out.println("File format error.");
                        }
                    }
                    catch (Exception e){

                    }
                    finally {
                        fin.close();
                    }
                    //fin.close();
                    break;
                case 5: flag2=false;
                    break;
                default:System.out.println("Wrong Choice!!");
                    flag2=false;
                    break;
            }
        }
    }
}
class Treatmentrec {
    String dateofjoining,treatment,diagnoseddisease,prescription,dischargedate,result;
    int tid,stid,spid,sdid,t1,t2;
    boolean f=true;
    String str3="";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Studentrec p1 = new Studentrec();
    Doctorrec d1 = new Doctorrec();
    void displaytrecord() throws IOException {
        System.out.print("Treament I.D. Number:"+tid);
        System.out.print("Date of Joining:"+dateofjoining);
        System.out.print("Patient's I.D. Number:"+spid);
        System.out.print("Doctor's I.D. Number:"+sdid);
        System.out.print("Treament:"+treatment);
        System.out.print("Disease Diagnosed with:"+diagnoseddisease);
        System.out.print("Medicines Prescription:"+prescription);
        System.out.print("Date of Discharge:"+dischargedate);
        System.out.print("RESULT:"+result);
        System.out.println("\n");

    }

    public void tim() throws IOException {
        int c,m,z;
        boolean flag3=true;
        while(flag3)
        {
            System.out.println("1. Write Record ");
            System.out.println("2. Update Record ");
            System.out.println("3. Search");
            System.out.println("4. Display Record");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            c= Integer.parseInt(br.readLine());
            switch(c)
            {
                case 1: FileWriter fout3 = new FileWriter("treatment.txt");
                    System.out.print("How many Treatment Records? ");
                    z= Integer.parseInt(br.readLine());
                    for(m=0;m<z;m++)
                    {
                        System.out.print("Enter Date of Joining:");
                        dateofjoining=br.readLine();
                        System.out.print("Enter Patient's I.D. Number:");
                        t1= Integer.parseInt(br.readLine());
                        int k=0;
                        if(p1.q.length!=0) {
                            if(t1 == p1.q[k])
                                System.out.println("Patient I.D number not found");
                            else
                            {
                                t1=1;
                                spid=t1;k++;
                                System.out.println("Patient I.D number found");
                            }
                        }
                        System.out.print("Enter Doctor's I.D. Number:");
                        t2=Integer.parseInt(br.readLine());
                        int l=0;
                        if(d1.r.length!=0){
                            if(d1.r[l] == t2)
                                System.out.println("Doctor I.D number not found");
                            else{
                                t2=2;l++;
                                sdid= t2;
                                System.out.println("Doctor I.D number found");
                            }
                        }
                        System.out.print("Enter Treament:");
                        treatment=br.readLine();
                        System.out.print("Enter Disease Diagnosed with:");
                        diagnoseddisease=br.readLine();
                        System.out.print("Enter Medicines Prescribed:");
                        prescription=br.readLine();
                        System.out.print("Enter Date of Discharge:");
                        dischargedate=br.readLine();
                        System.out.print("Enter RESULT:");
                        result=br.readLine();
                        System.out.print("Enter Treatment I.D. Number:");
                        tid =Integer.parseInt(br.readLine());
                        //Write to file.
                        fout3.write(tid+" \n");
                        fout3.write(dateofjoining+" \n");
                        fout3.write(treatment+" \n");
                        fout3.write(diagnoseddisease+" \n");
                        fout3.write(prescription+" \n");
                        fout3.write(dischargedate+" \n");
                        fout3.write(result+" \n");
                        fout3.write(sdid+" \n\n");

                    }
// fout3.write("EOF");
                    fout3.close();
                    System.out.println("File is created");
                    break;
                case 2: FileWriter fout4 = new FileWriter("treatment.txt");
                    System.out.print("How many Treatment Records? ");
                    z= Integer.parseInt(br.readLine());
                    for(m=0;m<z;m++)
                    {
                        System.out.print("Enter Date of Joining:");
                        dateofjoining=br.readLine();
                        System.out.print("Enter Patient's I.D. Number:");
                        t1= Integer.parseInt(br.readLine());
                        int k=0;
                        if(p1.q.length!=0) {
                            if(t1 == p1.q[k])
                                System.out.println("Patient I.D number not found");
                            else
                            {
                                t1=1;
                                spid=t1;k++;
                                System.out.println("Patient I.D number found");
                            }
                        }
                        System.out.print("Enter Doctor's I.D. Number:");
                        t2=Integer.parseInt(br.readLine());
                        int l=0;
                        if(d1.r.length!=0){
                            if(d1.r[l] == t2)
                                System.out.println("Doctor I.D number not found");
                            else{
                                t2=2;l++;
                                sdid= t2;
                                System.out.println("Doctor I.D number found");
                            }
                        }
                        System.out.print("Enter Treament:");
                        treatment=br.readLine();
                        System.out.print("Enter Disease Diagnosed with:");
                        diagnoseddisease=br.readLine();
                        System.out.print("Enter Medicines Prescribed:");
                        prescription=br.readLine();
                        System.out.print("Enter Date of Discharge:");
                        dischargedate=br.readLine();
                        System.out.print("Enter RESULT:");
                        result=br.readLine();
                        System.out.print("Enter Treatment I.D. Number:");
                        tid =Integer.parseInt(br.readLine());
                        //Write to file.
                        fout4.write(tid+" \n");
                        fout4.write(dateofjoining+" \n");
                        fout4.write(treatment+" \n");
                        fout4.write(diagnoseddisease+" \n");
                        fout4.write(prescription+" \n");
                        fout4.write(dischargedate+" \n");
                        fout4.write(result+" \n");
                        fout4.write(sdid+" \n\n");

                    }
// fout4.write("EOF");
                    fout4.close();
                    System.out.println("File is created");
                    break;
                case 3:System.out.print("Enter Treatment I.D. Number : ");
                    stid = Integer.parseInt(br.readLine());
                case 4:FileReader fin = new FileReader("treatment.txt");
                    Scanner sc = new Scanner(fin);
                    try {
                        while (sc.hasNextInt()) {
                            //Read data from file
                            tid = sc.nextInt();
                            dateofjoining = sc.next();
                            treatment = sc.next();
                            diagnoseddisease = sc.next();
                            prescription = sc.next();
                            dischargedate = sc.next();
                            result = sc.next();
                            spid = sc.nextInt();
                            sdid = sc.nextInt();

                            if (c == 3) {
                                displaytrecord();
                            }
                            if (c == 2) {

                                if (spid == p1.sid && sdid == d1.did && stid == tid) {
                                    displaytrecord();

                                }
                            }
                        }
                        str3 = sc.next();
                        if (str3.equals("EOF")) {
                            System.out.println("\nEnd of file");
                        } else {
                            System.out.println("File format error.");
                        }
                    }
                    catch (Exception e){

                    }
                    finally {
                        fin.close();
                    }
                    //fin.close();
                    break;
                case 5: flag3=false;
                    break;
                default:System.out.println("Wrong Choice!!");
            }
        }
    }
}
public class Project1
{
    public static void main(String[] args) throws IOException {
        int choice;
        boolean flag=true;
        final int LIMIT = 300;
        int count = 0;
        String username1 = "admin";
        String password1 = "pass";
        String username2,password2;
        Scanner scan = new Scanner (System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Studentrec pr = new Studentrec();
        Doctorrec dr = new Doctorrec();
        Treatmentrec tr = new Treatmentrec();

        while(flag){
            System.out.print ("Enter Username: ");
            username2 = scan.nextLine();
            if (username1.equals(username2)){
                while(count < LIMIT){
                    System.out.print("Enter Passwsord: ");
                    password2 = scan.nextLine();
                    if(password2.equals(password1))
                    {
                        while(true) {
                            System.out.println("Welcome!");
                            System.out.println("\tMenu");
                            System.out.println("1. Student Information Management ");
                            System.out.println("2. Doctor Information Management");
                            System.out.println("3. Treatment Information Management");
                            System.out.println("4. Quit");
                            System.out.print("Enter your choice: ");
                            choice = Integer.parseInt(br.readLine());
                            switch (choice) {
                                case 1:
                                    pr.pim();
                                    break;
                                case 2:
                                    dr.dim();
                                    break;
                                case 3:
                                    tr.tim();
                                    break;
//op[i];
                                case 4:
                                    System.out.println("Quit");
                                    System.exit(0);
                                default:
                                    System.out.println("Wrong Choice!!");
                            }
                        }
                    }
                    else{
                        System.out.println("Incorrect entry. Please try again.");
                        count++;
                    }
                }
                System.out.println("Your 3 tries are up!");
                System.out.println("Wiping hard drive!");
                System.exit(0);
            }
        }
    }
}
