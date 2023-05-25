package com.gof.pattern.singleton;

/**
 * enum 으로 싱글톤 패턴을 구현할 경우, 리플렉션에 안전함
 * enum 은 리플렉션에서 newInstance 를 막아놓음 -> 유일한 인스턴스 보장 가능
 * 단점 : enum 은 클래스 로딩시점부터 생성됨, 상속 불가능
 * enum 은 Serializable 을 구현하고 있음
 **/
public enum Settings6 {
    INSTANCE;
}
