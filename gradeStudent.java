import java.util.Scanner;

public class gradeStudent {
    public static void main(String[] args) {
        begin();
        double[] midTermArr = midTerm();
        double[] finalTermArr = finalTerm();
        double homeWorkPoint = homeWork(midTermArr[0] + finalTermArr[0]);
        report(midTermArr[1], finalTermArr[1], homeWorkPoint);
    }

    //Hàm thông điệp chào mừng
    public static void begin() {
        System.out.println("This program read exam/homework scores");
        System.out.println("and report you overall grade");
        System.out.println("");
    }

    //Hàm nhập và tính điểm giữa kì và cuối kì
    public static double[] countPoint() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Weight (0-100)? ");
        int weight = sc.nextInt();

        System.out.print("Score earned? ");
        int score = sc.nextInt();

        //Kiểm tra xem có shift hay không
        System.out.print("Were scores shifed (1=yes, 2=no)? ");
        int wereShift = sc.nextInt();
        int shift = 0;
        if (wereShift == 1) {
            System.out.print("Shift amount? ");
            shift = sc.nextInt();
        }

        //tính tổng điểm, tổng điểm phải < 100
        int totalPoint = (score + shift);
        if (totalPoint > 100) {
            totalPoint = 100;
        }
        System.out.println("Total point = " + totalPoint + " / 100");

        //tính và làm tròn điểm cuối cùng
        double weightScore = ((double) totalPoint / 100) * weight;
        double weightScoreRounded = (double) Math.round(weightScore * 10) / 10;         //Làm tròn đến chữ số đầu tiên sau dấu phẩy
        System.out.println("Weighted score = " + weightScoreRounded + " / " + weight);
        System.out.println("");

        //trả về 2 giá trị weight và điểm cuối cùng vào mảng để sử dụng ở phần sau chương trình
        return new double[]{weight, weightScoreRounded};
    }

    //Hàm trả về mảng 2 phần tử, phần tử 1 là weight, phần tử 2 là điểm của giữa kì
    public static double[] midTerm() {
        System.out.println("Midterm: ");
        return countPoint();
    }

    //Hàm trả về mảng 2 phần tử, phần tử 1 là weight, phần tử 2 là điểm của cuối kì
    public static double[] finalTerm() {
        System.out.println("Final: ");
        return countPoint();
    }

    //Hàm nhập và tính  điểm chuyên cần, ouput là giá trị điểm chuyên cần, input là tổng weight của giữa kì và cuối kì
    public static double homeWork(double preWeight) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Homework: ");

        //Nhập và kiểm tra xem người dùng đã nhập đúng weight chưa
        boolean wrongWeight = false;
        System.out.print("Weight (0-100)? ");
        int weight = sc.nextInt();
        do {
            if (weight + preWeight != 100) {                        //tổng weight nhập vào và weight trước đó phải bẳng 100
                System.out.println("Total weight must equal 100");
                wrongWeight = true;                                 //nếu không bằng 100, vòng lặp sẽ lặp lại
                System.out.print("Weight (0-100)? ");
                weight = sc.nextInt();
            }
            wrongWeight = false;
        } while (wrongWeight);

        //Nhập điểm phần Assignment sử dụng vòng lặp for
        System.out.print("Number of assignments? ");
        int asmNum = sc.nextInt();
        int asmScore = 0;
        int asmScoreMax = 0;
        for (int i = 1; i <= asmNum; i++) {
            System.out.print("Assignment " + i + " score and max? ");
            asmScore += sc.nextInt();
            asmScoreMax += sc.nextInt();
        }
        //tổng điểm assignment không được vượt quá 150
        if (asmScore > 150) {
            asmScore = 150;
        }
        //tổng điểm tối đa assignment không được vượt quá 150
        if (asmScoreMax > 150) {
            asmScoreMax = 150;
        }

        //Nhập và tính điểm chuyên cần
        System.out.print("How many sections did you attend? ");
        int sectionAttend = sc.nextInt();
        int totalSectionPoint = sectionAttend * 5;
        if (totalSectionPoint > 30) {       //điểm chuyên cần không được vượt quá 30
            totalSectionPoint = 30;
        }
        System.out.println("Section points = " + totalSectionPoint + " / 30");

        //In ra màn hình tổng điểm
        int totalPoint = asmScore + totalSectionPoint;
        System.out.println("Total points = " + totalPoint + " / " + (asmScoreMax + 30));

        //Tính và in ra màn hình tổng điểm có trọng số đã làm tròn
        double weightScore = (double) totalPoint / (asmScoreMax + 30) * 45;
        double weightScoreRounded = (double) Math.round(weightScore * 10) / 10;
        System.out.println("Weight score = " + weightScoreRounded + " / " + weight);
        System.out.println("");

        return weightScoreRounded;
    }

    //Tính điểm gpa, input là 3 giá trị điểm giữa kì, cuối kì và chuyên cần
    public static void report(double midTermPoint, double finalPoint, double homeWorkPoint) {
        //tính điểm cuối cùng của học sinh
        double overall = midTermPoint + finalPoint + homeWorkPoint;
        System.out.println("Overall percentage =  " + overall);

        //So sánh điểm cuối cùng và đưa ra gpa phù hợp
        double gpa = 0.0;
        if (overall >= 85) {
            gpa = 3.0;
        } else if (overall >= 75) {
            gpa = 2.0;
        } else if (overall >= 60) {
            gpa = 1.0;
        }
        System.out.println("Your grade will be at least: " + gpa);
    }
}
