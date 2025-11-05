## 1. build된 jar 파일이 있는 경우
#FROM eclipse-temurin:17-jre
#WORKDIR /app
#COPY build/libs/*.jar ./
#ENTRYPOINT ["java", "-jar", "app.jar"]

## 2. 멀티 스테이지: 컨테이너에서 빌드까지 하고 실행
FROM gradle:8.5-jdk17 AS build
WORKDIR /app
COPY . .
RUN gradle clean build --no-daemon -x test

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/build/libs/*.jar ./

# 이름에 plain 들어간 건 건너뛰고, 나머지를 app.jar로 이름 변경
RUN for f in *.jar; do \
      echo "found jar: $f"; \
      case "$f" in \
        *plain*.jar) echo "skip plain jar: $f" ;; \
        *) mv "$f" app.jar ;; \
      esac; \
    done

ENTRYPOINT ["java", "-jar", "app.jar"]
