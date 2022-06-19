public class Super {

    class A {
        int a = 32;
    }

    class B extends A {
        int b = 3243;
    }

    class C extends B {
        int z = 3211;

        public C() {
            super();
        }

        public C(int z) {
            this();
        }
    }
}
