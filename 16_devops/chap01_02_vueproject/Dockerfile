FROM node:lts-alpine

## curl(client-url) 설치
RUN apk add --no-cache curl

WORKDIR /app

COPY . .

RUN npm install

## npm run dev --host 0.0.0.0
## --host 0.0.0.0은 네트워크 인터페이스에서 접속을 허용(Docker 컨테이너 외부의 아무 IP에서나 접속 가능)
## 중간에 이중 대쉬(--)는 npm 명령어와 구분하기 위한 구분자
CMD ["npm", "run", "dev", "--", "--host", "0.0.0.0"]