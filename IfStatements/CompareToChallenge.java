public class CompareToChallenge {
    public static void main(String[] args){
        // produces negative results
        compare("Eric", "Meyer");
        compare("Python", "Ruby");
        compare("Dariela", "Dayra");
        compare("Martha", "Spoon");
        compare("set", "setter");

        // produces positive results
        compare("Two", "One");
        compare("three", "Three");
        compare("Prince", "Oreos");
        compare("apples", "apple");
        compare("Hola", "Bonjour");
        compare("tennis", "golf");

        // produces 0
        compare("set", "set");
        compare("Mayer", "Mayer");
    }

    public static void compare(String a, String b) {
        System.out.print("Comparing \"" + a + "\" with \"" + b + "\" produces ");
        System.out.println(a.compareTo(b));
    }
}
