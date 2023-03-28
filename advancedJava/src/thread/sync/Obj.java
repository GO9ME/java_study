package thread.sync;
// 공유 객체 - 계좌이체 필요한 두계좌의 정보를 저장하고 있는 객체
// - 계좌이ㅔ하는 쓰레드
// - 계좌의 잔액을 더하는 쓰레드
public class Obj {
	Account acc1; // 이체 받을 계좌
	Account acc2; // 이체할 계좌
}
