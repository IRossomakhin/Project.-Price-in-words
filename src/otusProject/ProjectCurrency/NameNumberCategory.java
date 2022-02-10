package otusProject.ProjectCurrency;

public class NameNumberCategory {
    public static String[][] nameCategory;

     static {
        nameCategory = new String[8][3];
        nameCategory[1][0] = "тысяча";
        nameCategory[1][1] = "тысячи";
        nameCategory[1][2] = "тысяч";
        nameCategory[2][0] = "миллион";
        nameCategory[2][1] = "миллиона";
        nameCategory[2][2] = "миллионов";
        nameCategory[3][0] = "миллиард";
        nameCategory[3][1] = "миллиарда";
        nameCategory[3][2] = "миллиардов";
        nameCategory[4][0] = "триллион";
        nameCategory[4][1] = "триллиона";
        nameCategory[4][2] = "триллионов";
        nameCategory[5][0] = "квадриллион";
        nameCategory[5][1] = "квадриллиона";
        nameCategory[5][2] = "квадриллионов";
        nameCategory[6][0] = "секстиллион";
        nameCategory[6][1] = "секстиллиона";
        nameCategory[6][2] = "секстиллионов";
        nameCategory[7][0] = "септиллион";
        nameCategory[7][1] = "септиллиона";
        nameCategory[7][2] = "септиллионов";
     }
}
