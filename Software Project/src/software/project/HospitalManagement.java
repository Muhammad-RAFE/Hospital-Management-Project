import java.io.*;
import java.util.*;




class doctor

{
    String did, dname, specilist, appoint, doc_qual;
    int droom;
    void new_doctor()

    {
        Scanner input = new Scanner(System.in);

        System.out.print("id:-");
        did = input.nextLine();

        System.out.print("name:-");
        dname = input.nextLine();

        System.out.print("specilization:-");
        specilist = input.nextLine();


        System.out.print("qualification:-");
        doc_qual = input.nextLine();

        System.out.print("room no.:-");
        droom = input.nextInt();

    }

    void doctor_info()

    {
        System.out.println(did + "\n" + dname + "  \n" + specilist  + "    \n" + doc_qual + "       \n" + droom);

    }
}

class patient

{
    String pid, pname, disease, Gender, admit_status;
    int age;
    void new_patient()

    {
        Scanner input = new Scanner(System.in);

        System.out.print("id:-");
        pid = input.nextLine();

        System.out.print("name:-");
        pname = input.nextLine();

        System.out.print("disease:-");
        disease = input.nextLine();

        System.out.print("Gender:-");
        Gender = input.nextLine();

        System.out.print("admit_status:-");
        admit_status = input.nextLine();

        System.out.print("age:-");
        age = input.nextInt();

    }

    void patient_info()
    {
        System.out.println(pid + "\n" + pname + " \n" + disease + "     \n" + Gender + "      \n" + admit_status + "\n" + age);
    }
}

class staff
{
    String sid, sname, desg, sex;
    int salary;
    void new_staff()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("id:-");
        sid = input.nextLine();

        System.out.print("name:-");
        sname = input.nextLine();

        System.out.print("desigination:-");
        desg = input.nextLine();

        System.out.print("sex:-");
        sex = input.nextLine();

        System.out.print("salary:-");
        salary = input.nextInt();
    }

    void staff_info()

    {
        System.out.println(sid + "\n" + sname + "\n" + sex + "\n" + salary);
    }

}

class medical

{
    String med_name, med_comp, exp_date;
    int med_cost, count;
    void new_medi()
    {

        Scanner input = new Scanner(System.in);

        System.out.print("name:-");
        med_name = input.nextLine();

        System.out.print("comp:-");
        med_comp = input.nextLine();

        System.out.print("exp_date:-");
        exp_date = input.nextLine();

        System.out.print("cost:-");
        med_cost = input.nextInt();

        System.out.print("no of unit:-");
        count = input.nextInt();

    }

    void find_medi()
    {
        System.out.println(med_name + "  \n" + med_comp + "    \n" + exp_date + "     \n" + med_cost);
    }
}

class lab

{
    String fecility;
    int lab_cost;
    void new_feci()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("fecility:-");
        fecility = input.nextLine();

        System.out.print("cost:-");
        lab_cost = input.nextInt();

    }

    void feci_list()
    {
        System.out.println(fecility + "\n" + lab_cost);

    }
}

public class HospitalManagement

{
    public static void main(String args[])
    {
        
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;


        System.out.println("Hospital Management System Project");



        doctor[] d = new doctor[25];

        patient[] p = new patient[100];

        lab[] l = new lab[20];

        fecility[] f = new fecility[20];

        medical[] m = new medical[100];

        staff[] s = new staff[100];

        
        
        int i;

        for (i = 0; i < 25; i++)

            d[i] = new doctor();

        for (i = 0; i < 100; i++)

            p[i] = new patient();

        for (i = 0; i < 20; i++)

            l[i] = new lab();

        for (i = 0; i < 20; i++)

            f[i] = new fecility();

        for (i = 0; i < 100; i++)

            m[i] = new medical();

        for (i = 0; i < 100; i++)

            s[i] = new staff();


        Scanner input = new Scanner(System.in);

        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;

        while (status == 1)

        {
            System.out.println("\n MAIN MENU");

            System.out.println("1.Doctos  2. Patients  3.Medicines  4.Laboratories   5. Staff ");
      

            choice = input.nextInt();
            switch (choice)

            {

                case 1:

                    {
                       
                        System.out.println("\nDOCTOR SECTION\n");
                        

                        s1 = 1;

                        while (s1 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Doctors List");
                            c1 = input.nextInt();
                            switch (c1)

                            {
                                case 1:
                                    {
                                        d[count1].new_doctor();count1++;
                                        break;
                                    }
                                case 2:
                                    {
                                        
                                        System.out.println("id \n Name\n Specilist \n Timing \n Qualification \n Room No.");
                                        
                                        for (j = 0; j < count1; j++)
                                        {
                                            d[j].doctor_info();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s1 = input.nextInt();
                        }
                        break;
                    }

                case 2:

                    {
                        
                        System.out.println("PATIENT SECTION");
                        

                        s2 = 1;

                        while (s2 == 1)
                        {
                            System.out.println("1.Add New Entry\n 2.Existing Patients List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        p[count2].new_patient();count2++;
                                        break;
                                    }

                                case 2:
                                    {
                                        
                                        System.out.println("id \n Name \n Disease \n Gender \n Admit Status \n Age");
                                        
                                        for (j = 0; j < count2; j++) {
                                            p[j].patient_info();
                                        }
                                        break;
                                    }
                            }

                            System.out.println("\n Return to Back Press 1 and for Main Menu Press 0");
                            s2 = input.nextInt();
                        }
                        break;
                    }

                case 3:
                    {
                        s3 = 1;

                        
                        System.out.println("MEDICINE SECTION");
                        

                        while (s3 == 1)
                        {
                            System.out.println("1.Add New Entry\n 2. Existing Medicines List");
                            c1 = input.nextInt();

                            switch (c1)
                            {

                                case 1:
                                    {
                                        m[count3].new_medi();count3++;
                                        break;
                                    }

                                case 2:
                                    {
                                        
                                        System.out.println("Name \n Company \n Expiry Date \n Cost");
                                        

                                        for (j = 0; j < count3; j++) {
                                            m[j].find_medi();
                                        }
                                        break;
                                    }

                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s3 = input.nextInt();
                        }
                        break;
                    }

                case 4:

                    {
                        s4 = 1;

                       
                        System.out.println("LABORATORY SECTION");
                        

                        while (s4 == 1)

                        {
                            System.out.println("1.Add New Entry \n 2.Existing Laboratories List");
                            c1 = input.nextInt();

                            switch (c1)

                            {
                                case 1:
                                    {
                                        l[count4].new_feci();count4++;
                                        break;
                                    }

                                case 2:

                                    {
                                       
                                        System.out.println("Fecilities Cost");
                                        

                                        for (j = 0; j < count4; j++) {
                                            l[j].feci_list();
                                        }
                                        break;
                                    }
                            }

                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s4 = input.nextInt();
                        }
                        break;
                    }

                
                case 5:

                    {
                        s6 = 1;

                     
                        System.out.println("STAFF SECTION");
                       

                        while (s6 == 1)

                        {
                            String a = "nurse", b = "worker", c = "security";
                            System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
                            c1 = input.nextInt();

                            switch (c1)

                            {
                                case 1:
                                    {
                                        s[count6].new_staff();count6++;
                                        break;
                                    }

                                case 2:
                                    {
                                       
                                        System.out.println("id \n Name \n Gender \n Salary");
                                       

                                        for (j = 0; j < count6; j++)
                                        {
                                            if (a.equals(s[j].desg))
                                                s[j].staff_info();
                                        }
                                        break;
                                    }

                                case 3:
                                    {
                                        
                                        System.out.println("id \n Name \n Gender \n Salary");
                                        

                                        for (j = 0; j < count6; j++)
                                        {
                                            if (b.equals(s[j].desg))
                                                s[j].staff_info();
                                        }
                                        break;
                                    }
                                case 4:
                                    {
                                        
                                        System.out.println("id \n Name \n Gender \n Salary");
                                        

                                        for (j = 0; j < count6; j++)
                                        {
                                            if (c.equals(s[j].desg))
                                                s[j].staff_info();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s6 = input.nextInt();
                        }
                        break;
                    }
                default:
                    {
                        System.out.println(" You Have Enter Wrong Choice!!!");
                    }
            }

            System.out.println("\nReturn to MAIN MENU Press 1");

            status = input.nextInt();
        }
    }
}