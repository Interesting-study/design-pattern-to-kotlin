## 소개
```
📖 GoF 디자인 패턴을 코틀린으로 학습하는 스터디입니다.
```
- 스터디원 : 김도희, 정은경
- 필수 인프런 강의 : [코딩으로 학습하는 GoF의 디자인 패턴](https://www.inflearn.com/course/%EB%94%94%EC%9E%90%EC%9D%B8-%ED%8C%A8%ED%84%B4)
- 참고 추천 서적
  - 헤드 퍼스트 디자인 패턴
  - 코틀린 객체지향 프로그래밍


## 배경

#### 🤔 **좀 더 체계적으로, 객체지향스럽게 코드를 작성하고 싶어요.**

> 디자인 패턴에 대해 배워보자<br>
> 디자인 패턴 소스코드가 자바네? <br>
> 자바 to 코틀린을 테스트 코드를 통해 구현해보고 코틀린으로는 이 디자인 패턴을 어떻게 구현할 수 있을지 알아보자

<br/>

## 학습 기술

<div>

**`BackEnd`**

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)

<br>

## 프로젝트 스펙
***
```
  Spring Boot 3.0.6
  Gradle
  Kotlin
  Java 17
  ktlint
```

<br>
  
## 브랜치 전략 및 커밋 규칙
1. 본인이름-패턴이름 으로 된 브랜치를 본인이름의 브랜치에서 생성한다.
  ex) zeri -> zeri-factorymethod
2. 본인이름-패턴이름 으로 된 브랜치에 학습한 내용을 커밋한다.
3. PR 시 주의 점
  목적지 : 본인이름 브랜치
  출발지 : 본인이름-패턴이름 브랜치
  ex) zeri <- zeri-factorymethod
4. 주마다 각자 브랜치를 메인에 merge 한다
5. 커밋할 때 반드시 body 내용을 채워넣는다.
  - 필수내용 : 작업내용, 리뷰어가 봐줬으면 하는 내용, 같이 고민해봤으면 하는 점
  
<br>
  
## 주차별 모임 내용 간략 요약
***
- 2023.05.10
  - [x] 코틀린 기초 강의 수강 여부
  - [x] 1주차 학습 내용 공유

- 2023.05.17
  - [x] 코드리뷰 및 다음 주차 내용 공유 
  
  
- 2023.05.30
  - [x] 팩토리 메서드 패턴
  ```
  #ria
  중간 난이도 예제 - 주문 처리: 추상 클래스 OrderProcessor를 정의하고, 
  이를 상속받은 OnlineOrderProcessor, InStoreOrderProcessor, PhoneOrderProcessor 클래스를 구현합니다.
  OrderProcessorFactory 클래스는 OrderProcessor 객체를 생성하는 팩토리 메서드 createOrderProcessor를 가지고 있습니다.
  ```
  ```
  #zeri
  추상 클래스 Shape를 정의하고, 이를 상속받은 Circle, Rectangle, Triangle 클래스를 구현합니다. 
  ShapeFactory 클래스는 Shape 객체를 생성하는 팩토리 메서드 createShape를 가지고 있습니다.
  ```
  
- 2023.06.14
  - [x] 추상 팩토리 메소드 패턴
  ```
  #ria
  문제: 여러 종류의 차를 나타내는 Tea 인터페이스와 이를 구현하는 BlackTea와 GreenTea 클래스가 있습니다. 이러한 차 객체를 생성하기 위한 추상 팩토리 메소드를 구현해보세요.
  ```
  ```
  #zeri
  문제: 여러 종류의 과일을 나타내는 Fruit 인터페이스와 이를 구현하는 Apple과 Banana 클래스가 있습니다. 이러한 과일 객체를 생성하기 위한 추상 팩토리 메소드를 구현해보세요.
  ```

  
 

