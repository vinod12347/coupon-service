FROM java:8
ADD target/coupon_service-0.0.1-SNAPSHOT.jar coupon_service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","coupon_service-0.0.1-SNAPSHOT.jar"]