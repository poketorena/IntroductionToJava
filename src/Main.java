public class Main {
    public static void main(String... args) {
        Object obj = new FooService("hello");

        System.out.println(obj instanceof FooService);//true
        System.out.println(obj instanceof AbstractBaseService);//親クラスなのでtrue
        System.out.println(obj instanceof BaseService);//インタフェースを実装しているのでtrue
        System.out.println(obj instanceof Integer);// 継承関係がないのでfalse

        if (obj instanceof FooService) {
            FooService service = (FooService) obj;//objはFooServiceであるため、キャストが可能
            System.out.println(service.say());
        }
    }
}
