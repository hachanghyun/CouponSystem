## 쿠폰시스템
<img width="900" alt="스크린샷 2023-08-20 오전 8 24 06" src="https://github.com/hachanghyun/CouponSystem/assets/33058284/400b2053-dc3c-4990-a3e1-1ad086f7cc96">

<img width="485" alt="스크린샷 2023-08-20 오전 9 24 31" src="https://github.com/hachanghyun/CouponSystem/assets/33058284/559d52d8-0fcf-4dac-9527-d655feb17205">

#### ExecutorService란?
    병렬 작업 시 여러 개의 작업을 효율적으로 처리하기 위해 제공되는 JAVA 라이브러리이다.

#### ExecutorService가 없었다면?
    각기 다른 Thread를 생성해서 작업을 처리하고, 처리가 완료되면 해당 Thread를 제거하는 작업을 손수 진행해야하는 것을 ExecutorService 클래스를 이용하면 쉽게 처리가능하다.

#### ExecutorService
    ExecutorService에 Task만 지정해주면 친절하게 알아서 ThreadPool을 이용해서 Task를 실행하고 관리한다.

#### Task는 뭐로 관리가 되나?
    Queue로 관리된다.
    
    ThreadPool에 있는 Thread수보다 Task가 많으면, 미실행된 Task는 Queue에 저장되고,
    
    실행을 마친 Thread로 할당되어 순차적으로 수행된다.


#### CountDownLatch 
    CountDownLatch는 어떤 쓰레드가 다른 쓰레드에서 작업이 완료될 때 까지 기다릴 수 있도록 해주는 클래스입니다.

#### redis 
    docker exec -it d20e124e6234 redis-cli
    incr coupon_count # 실행
    flushall # redis 테스트 데이터 초기화
    
#### redis 싱글스레드방식

#### kafka 실습
    mkdir kafka
    cd kafka
    vim docker-compose.yml #노션에 있는 명령어 복사해서 붙여넣기
    docker-compose up -d

    위의 그림을 보면 가운데 카프카를 기준으로 양옆에 Producer 와 Consumer 가 있다. Producer는 실시간으로 데이터를 Kafka에 보내는 놈이고, Consumer는 Kafka에 있는 데이터를 가져다 쓰는 것이라 생각하면된다. 그리고 Kafka 내부에는 Topic이라는게 있는데 각각의 목적을 가진 큐라고 생각하면된다. (더 쉽게 이해하시려면 데이터 베이스의 테이블 역할을 한다 생각하시면 된다.)
<img width="916" alt="스크린샷 2023-08-20 오전 10 34 01" src="https://github.com/hachanghyun/CouponSystem/assets/33058284/515fd380-d1f6-4f6d-9d71-1d1b26ae0d52">
위 producer 아래 consumer 
producer가 보낸 값을 consumer가 받는것을 볼수있음



    
