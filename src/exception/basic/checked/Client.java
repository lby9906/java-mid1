package exception.basic.checked;

public class Client {
    //throw : 새로운 예외 발생 시킬 수 있음
    //throws : 발생시킨 예외를 밖으로 던질 대 사용하는 키워드
    public void call() throws MyCheckedException{
        //문제 상황
        throw new MyCheckedException("ex");
    }
}
