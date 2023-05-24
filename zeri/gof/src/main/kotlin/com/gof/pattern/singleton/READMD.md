## 싱글톤 패턴
***
### 인스턴스를 오직 한 개만 제공하는 클래스  


- 시스템 런타임, 환경 세팅에 대한 정보 등 인스턴스가 여러개 일 때 문제가 생길 수 있는 경우가 있다.  
**인스턴스를 오직 한 개만 만들어 제공하는 클래스** 가 필요하다  
  
| **Singleton**                |
|:-----------------------------|
| - instance : Singleton       |
| + getInstanace() : Singleton |

- 구현하는 방법
  - 가장 단순히 구현하는 법
    - 클래스 안에서 private 한 인스턴스 변수를 생성한 후 static 메소드를 통해 객체를 생성하려는 순간, 객체가 비어있다면 
    새로 생성하고 그렇지 않다면 클래스 안에 있는 인스턴스 변수를 전달한다.
      -  thread safe 하지 않다.
      - 동시에 다른 thread 에서 빈 인스턴스 변수에 접근하려고 했을 때 어떻게 될지?
  - 멀티 쓰레드 환경에서 안전하게 구현하는 방법
    - synchronized 키워드 사용
      - 동기화 처리 작업 때문에 늦어질 수 있다(lock)
    - 이른 초기화(eager initialization)
    - double checked locking
    - static inner
  - 싱글톤 패턴 구현 방법을 깨트리려면
    - 리플렉션 사용하기
  - 안전하고 단순하게 구현하기
    - enum
  
<br>

- 싱글톤 패턴 복습
  - 자바 enum 을 사용하지 않고 싱글톤 패턴을 구현하는 방법은?
  - private 생성자와 static 메소드를 사용하는 방법의 단점은?
  - enum을 사용해 싱글톤 패턴을 구현하는 방법의 장점과 단점은?
  - static inner 클래스를 사용해 싱글톤 패턴을 구현해라

<br>

- 실무에서는 어떻게 쓰이나?
  - 스프링에서 빈의 스코프 중 하나로 싱글톤 스코프
  - 자바 java.lang.Runtime
  - 다른 디자인 패턴(빌더, 퍼사드, 추상 팩토리 등) 구현체의 일부로 쓰이기도 한다

<br>

- 코틀린에서 싱글톤 패턴을 구현하는 법
  - 객체 선언(Object Declaration)
  - 패키지 수준 함수(Package-Level Function)
  - 동반 객체(Companion Object)
  - lazy 초기화(Lazy Initialization)