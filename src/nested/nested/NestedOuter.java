package nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    //static은 인스턴스와 관계 x
    static class Nested { // 정적 중첩 클래스
    //static은 인스턴스와 접근x -> static 메서드 영역 / 인스턴스는 인스턴스 영역에 생김
        private int nestedInstanceValue = 1;

        public void print() {
            //자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            //바깥 클래스의 인스턴스 멤버에 접근에는 접근할 수 없다.
//            System.out.println(outInstanceValue);

            //바깥 클래스의 클래스 멤버에는 접근할 수 있다. private도 접근 가능
            System.out.println(NestedOuter.outClassValue);
        }
    }
}
