package check;

import constants.Constants;

public class Check {
	
    private static String firstName = "小山";
    private static String lastName = "智也";

    public static void main(String[] args) {
    	System.out.println("printNameメソッド → " + firstName + lastName);
        

        // Constants クラスの定数を使用して Pet インスタンスを作成
        Pet myPet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
        myPet.introduce();

        // Constants クラスの定数を使用して RobotPet インスタンスを作成
        RobotPet myRobotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
        myRobotPet.introduce();
    }
    
    private static void printName(String firstName, String lastName) {
        System.out.println();
    }
}
