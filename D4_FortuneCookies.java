import java.util.Random;

public class D4_FortuneCookies{

    //static members belong to Class; non-static members belong to instance, so we need to declare the String[] array to be static, to be able to accessed by the static main class directly. ///
    //
    //If it is non-static, we need to created a instance 'fortuneCookie' of class D4_FortuneCookies, so that we can use the non-static array in main class with: 
    //fortuneCookie.fortunes.length    >to get the array length

    static String[] fortunes = {"Do not be afraid of competition.",
                                "An exciting opportunity lies ahead of you.",
                                "You love peace.",
                                "Get your mind set… ...",
                                "You will always be surrounded by true friends.",
                                "Sell your ideas-they have exceptional merit.",
                                "You should be able to undertake and complete anything.",
                                "You are kind and friendly."};
    public static void main(String[] args){

        Random rand = new Random();
        int r = rand.nextInt(fortunes.length);
        System.out.println(r);
        System.out.println(fortunes[r]);

    }
}








