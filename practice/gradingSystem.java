package practice;

public class gradingSystem {
    public static void main(String[] args) {
        int studentCount = 6; // characters or variables within array
        int[][] student = new int[studentCount][studentCount]; // # of students and #'s
        int[] aaron = {90, 89, 78, 75, 69, 61}; 
        int[] madison = {93, 90, 89, 87, 85, 81}; 
        int[] alexis = {89, 87, 79, 76, 75, 73};
        int[] miseal = {86, 84, 81, 79, 76, 74};
        int[] mike = {83, 81, 78, 74, 71, 68};
        int[] amelia = {80, 76, 74, 71, 68, 65};
        
        // students #'ered off from 0-5  
        student[0] = aaron; 
        student[1] = madison; 
        student[2] = alexis;
        student[3] = miseal;
        student[4] = mike;
        student[5] = amelia;
        int gradeSum = 0;
        int[] studentSum = new int[studentCount];

        // loop through students
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Student #" + i);
            studentSum[i] = 0;

            //loop through students grades
            for (int j = 0; j < studentCount; j++) {
                gradeSum = gradeSum + student[i][j]; 
                studentSum[i] = studentSum[i] + student[i][j];
            } 
            System.out.println(" Average Grade: " + studentSum[i] / studentCount);
        }
        System.out.println("\nAverage grade of all students: " + gradeSum / (studentCount * studentCount));
    }
}
