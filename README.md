# 🚪 진실의 방으로
32기 GO SOPT 솝커톤 8조

## 🐣 서팟 갓기들 ><

<img width="500" alt="image" src="https://github.com/32th-SOPKATHON-TEAM8/SERVER/assets/78674565/25c8e71d-6832-41a3-a6ee-091eee56413b">

## 🦄 1. 협업 룰 세팅

--- 

### 1. 코드 컨벤션
    
- **Status ENUM명**
    - `Http Method 명` + `___` + `SUCCESS/FAIL`
    - ex. 생성: POST_GROUP_SUCCESS  조회: GET_GROUP_SUCCESS
- **변수 명**
    - 카멜 케이스
    - ex) userId
    - **Indentation**
        - 탭의 크기는 4개의 스페이스    
- **Braces**
    - K&R 스타일로 중괄호 선언
        
        *[braces-knr-style]*
        
        클래스 선언, 메서드 선언, 조건/반복문 등의 코드 블럭을 감싸는 중괄호에 적용되는 규칙이다. 중괄호 선언은 K&R 스타일(Kernighan and Ritchie style)을 따른다. 줄의 마지막에서 시작 중괄호`{`를 쓰고 열고 새줄을 삽입한다. 블럭을 마친후에는 새줄 삽입 후 중괄호를 닫는다.
        
        *나쁜 예*
        
        ```java
        public class SearchConditionParser
        {
            public boolean isValidExpression(String exp)
            {
        
                if (exp == null)
                {
                    return false;
                }
        
                for (char ch : exp.toCharArray())
                {
                     ....
                }
        
                return true;
            }
        }
        ```
        
        *좋은 예*
        
        ```java
        public class SearchConditionParser {
            public boolean isValidExpression(String exp) {
        
                if (exp == null) {
                    return false;
                }
        
                for (char ch : exp.toCharArray()) {
                    ....
                }
        
                return true;
            }
        }
        ```
        
- **Early return**
    - if/else 대신에 if/return 구조를 사용하여 들여쓰기를 최소한으로 줄이자
        
        *나쁜 예*
        
        ```java
        public String getValue(final int id) {
        
        	String value;
        
        	if (id > 0) {
        		if (id > 10) {
        			value = "Id is greater than 10.";
        		} else {
        			value = "Id is greater than 0 and below 10."
        		}
        	} else if (id == 0) {
        		value = "This id is zero.";
        	} else {
        		value = "Invalid id.";
        	}
        
        	return value;
        }
        ```
        
        *좋은 예*
        
        ```java
        public String getValue(final int id) {
        
        	if (id == 0) {
        		return "This id is zero."
        	}
        
        	if (id < 0) {
        		return "Invalid id.";
        	}
        
        	if (id > 10) {
        		return "Id is greater than 10.";
        	}
        
        	return "Id is greater than 0 and below 10.";
        }
        ```
        

### 🐰 2. 깃 컨벤션

- 브랜치 전략
       
<img width="400" alt="image" src="https://github.com/32th-SOPKATHON-TEAM8/SERVER/assets/78674565/c801315a-d72d-49de-9fb3-40be7cf90fae">

- 이슈 생성 → 브랜치 생성 → 개발 → pr 생성 → develop 브랜치에 머지
    - 이슈와 pr은 생성해둔 탬플릿 대로 입력
        - 이슈 제목: [METHOD] url 설명
            - ex) [GET] /group 그룹 상세조회
- 브랜치명
    - `feat/{기능명}`  새로운 기능 개발시
        - 커밋 메시지 마지막에 #이슈번호 입력하기
    - `fix/{수정 내용}` 기능 수정시

- 커밋 컨벤션
    - ✅ `[CHORE]` : 동작에 영향 없는 코드 or 변경 없는 변경사항(주석 추가 등)
    - ✨ `[FEAT]` : 새로운 기능 구현
    - ➕ `[ADD]` : Feat 이외의 부수적인 코드 추가, 라이브러리 추가, 새로운 파일 생성
    - 🔨 `[FIX]` : 버그, 오류 해결
    - ⚰️ `[DEL]` : 쓸모없는 코드 삭제
    - 📝 `[DOCS]` : README나 WIKI 등의 문서 수정
    - ✏️ `[CORRECT]` : 주로 문법의 오류나 타입의 변경, 이름 변경시
    - ⏪️ `[RENAME]` : 파일 이름 변경시
    - ♻️ `[REFACTOR]` : 전면 수정
    - 🔀 `[MERGE]`: 다른 브랜치와 병합

## 🐶 2. ERD 및 프로젝트 구조

---

### 🐼 1. ERD

![image](https://github.com/32th-SOPKATHON-TEAM8/SERVER/assets/78674565/f0fc467f-3625-43e8-9498-40bf67dd847b)

### 🗂 2. 프로젝트 구조

```
🗂 sopkathon
    🗂 common (공통 처리 관련 클래스)
        🗂 advice
        🗂 dto
    🗂 controller (클라이언트의 요청을 받는 컨트롤러 계층)
        🗂 dto
            🗂 request
            🗂 response
    🗂 domain (도메인)
    🗂 exception (예외처리)
        🗂 model
    🗂 infrastructure (데이터베이스 등 외부 요소와 연결을 수행하는 계층)
    🗂 service (비즈니스로직이 있는 서비스 계층)
```

## 👩‍💻 3. 팀원 역할 분배

---

### 1. 팀원 역할 분배
| 작업 | 담당자 |
| --- | --- |
| 초기세팅 | 정준서 |
| DB | 정준서, 박예준 |
| API 명세서 | 정준서, 박예준 |
| API 개발  [GET] /group  | 박예준 |
| API 개발 [PATCH] /report | 정준서 |
