public class BMI {
    private int weight;
    private int height;

    public BMI(){

    }

    public BMI(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void printResult() {
        int finalHeight = (height * height) / 10000;
        int finalResult = weight / finalHeight;
        if((double) finalResult < 18.5) {
            System.out.println("Your Weight is " + weight + " Kg");
            System.out.println("Your Height is " + height + " cm");
            System.out.println("Your result of BMI is : " + (double) finalResult);
            System.out.println("Your Body Mass Index is Underweight");
        } else if((double) finalResult >= 18.5 && (double) finalResult < 25) {
            System.out.println("Your Weight is " + weight + " Kg");
            System.out.println("Your Height is " + height + " cm");
            System.out.println("Your result of BMI is : " + (double) finalResult);
            System.out.println("Your Body Mass Index is Normal");
        } else if((double) finalResult >= 25 && (double) finalResult < 30) {
            System.out.println("Your Weight is " + weight + " Kg");
            System.out.println("Your Height is " + height + " cm");
            System.out.println("Your result of BMI is : " + (double) finalResult);
            System.out.println("Your Body Mass Index is Overweight");
        } else if((double) finalResult >= 30 && (double) finalResult < 35) {
            System.out.println("Your Weight is " + weight + " Kg");
            System.out.println("Your Height is " + height + " cm");
            System.out.println("Your result of BMI is : " + (double) finalResult);
            System.out.println("Your Body Mass Index is Obese");
        } else {
            System.out.println("Your Weight is " + weight + " Kg");
            System.out.println("Your Height is " + height + " cm");
            System.out.println("Your result of BMI is : " + (double) finalResult);
            System.out.println("Your Body Mass Index is Extremely Obese");
        }
    }
}
