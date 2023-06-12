package com.gof.pattern.singleton.onlykotlin

/**
 * [코틀린에서 싱글톤 패턴 구현하기]
 * [ V ] 객체 선언(Object Declaration)
 *
 * 가장 권장하는 방법
 *
 * 클래스 정의와 동시에 초기화되는 단일 인스턴스로 동작한다.
 * 이 객체 선언을 통해 싱글톤 패턴을 쉽고 간결하게 구현할 수 있다.
 *
 * object 는 싱글톤 객체 선언을 위한 전용 키워드
 *
 * 생성자 생성 불가능, 상속 불가능, 추상화 불가능, 인터페이스 구현 불가능
 */
object ObjectDeclarationSingletonUser
