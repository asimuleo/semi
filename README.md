```bash
# 개발 모드 실행
.\mvnw spring-boot:run
```

```bash
# 프로덕션 빌드 - jar 생성
.\mvnw clean package
```

```bash
# 운영 모드 실행
java -jar target\semiproject-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
```
