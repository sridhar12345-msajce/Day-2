public class vc {
        int rollNumber = 101;

        static String collegeName = "ABC College";


        void displayStudent() {
            int marks = 95; // Local variable
            System.out.println("Inside displayStudent() method:");
            System.out.println("Roll Number (Instance Variable): " + rollNumber);
            System.out.println("College Name (Static Variable): " + collegeName);
            System.out.println("Marks (Local Variable): " + marks);
            System.out.println();
        }


        static void showCollege() {
            System.out.println("Inside static method showCollege():");
            System.out.println("College Name (Static Variable): " + collegeName);
            System.out.println();
        }


        public static void main(String[] args) {
            System.out.println(" Demonstration of Class and Variable Types\n");

            vc s= new vc();


            s.displayStudent();


            vc.showCollege();


            vc.collegeName = "XYZ Institute";


            vc student2 = new vc();
            student2.rollNumber = 102;
            student2.displayStudent();
        }
    }
