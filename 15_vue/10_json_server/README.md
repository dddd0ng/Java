# json-server 사용하기
> vue를 활용한 APP을 만들기 위해 임시 서버를 생성한다.

## 환경 설정
아래 스크립트를 활용하여 서버를 생성하고 주소창에 http://localhost:8080/post를 입력하면 json 서버를 사용할 수 있다.

```
# window 유저
$ npm i -g json-server

# 윈도우 파워쉘 > 관리자 권한으로 실행 > 아래 설정을 변경
$ executionpolicy
$ set-executionpolicy unrestricted

# --watch는 json의 상태 변경을 감지하는 옵션이다.
$ json-server --watch db.json --port 8080

```

```
# mac 유저
# json-server 전역 설치
$ npm i -g json-server

# 권한 오류가 발생하는 경우 sudo 사용
$ sudo npm i -g json-server

# --watch는 json의 상태 변경을 감지하는 옵션이다.
$ json-server --watch db.json --port 8080
```
