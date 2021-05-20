# 1단계 - 학습 테스트 실습
## String 클래스에 대한 학습 테스트
### 요구사항
1. split
2. substring
3. charAt

## Set Collection에 대한 학습 테스트
### 요구사항
1. size 확인
2. contains 확인


# 2단계 - 문자열 덧셈 계산기
### 요구사항
1. 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
2. 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
3. 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.

### 실행예시
```
계산할 문자열을 입력해주세요.
1,2:3,3:10
19
```

# 3단계 - 로또(자동)
# 4단계 - 로또(2등)

# 디렉토리 구조
```
│
└─src
    ├─main
    │  └─java
    │      └─step2                             2단계 - 문자열 덧셈 계산기
    │              Numbers.java
    │              StringAddCalculator.java
    │              StringAddCalculatorApp.java
    │
    └─test
        └─java
            ├─step1                            1단계 - 학습 테스트 실습
            │      SetTest.java
            │      StringTest.java
            │
            └─step2
                    NumbersTest.java
                    StringAddCalculatorTest.java
```
