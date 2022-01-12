package activities;
interface addable {
    int add(int x, int y);
}

    public class Activity12 {

        public static void main(String[] args) {
            addable obj1=(a,b)->(a+b);
            System.out.println(obj1.add(10,20));
            addable obj2 = (int a, int b) -> {
                return (a + b);
            };
            System.out.println(obj2.add(10,20));
        }
    }

