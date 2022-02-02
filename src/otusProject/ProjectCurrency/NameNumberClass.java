package otusProject.ProjectCurrency;

public class NameNumberClass {
    public static String[][] nameClass;

     static {
        nameClass = new String[8][3];
        nameClass[1][0] = "тысяча";
        nameClass[1][1] = "тысячи";
        nameClass[1][2] = "тысяч";
        nameClass[2][0] = "миллион";
        nameClass[2][1] = "миллиона";
        nameClass[2][2] = "миллионов";
        nameClass[3][0] = "миллиард";
        nameClass[3][1] = "миллиарда";
        nameClass[3][2] = "миллиардов";
        nameClass[4][0] = "триллион";
        nameClass[4][1] = "триллиона";
        nameClass[4][2] = "триллионов";
        nameClass[5][0] = "квадриллион";
        nameClass[5][1] = "квадриллиона";
        nameClass[5][2] = "квадриллионов";
        nameClass[6][0] = "секстиллион";
        nameClass[6][1] = "секстиллиона";
        nameClass[6][2] = "секстиллионов";
        nameClass[7][0] = "септиллион";
        nameClass[7][1] = "септиллиона";
        nameClass[7][2] = "септиллионов";
     }
}
