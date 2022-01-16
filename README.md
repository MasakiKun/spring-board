# 게시판 한번 만들어보자고 만들어본 껍데기 프로젝트

스프링 부트를 이용해서 게시판 한번 만들어보자고 만들어본, 예제 샘플입니다.

### 개발 준비

* 자바 설치 (스스로 준비합니다)
* Eclipse나 IntelliJ IDEA 준비 (스스로 준비합니다)
* MariaDB 설치 (아래에서 설명합니다)

### 실행환경 준비

1. [MariaDB + HeidiSQL 패키지](https://app.box.com/s/0ih2sdrdccnyukpysifnl3pt6jodwgoa) 를 다운로드해서 압축을 해제합니다.
위 링크에서 바로 다운로드가 되지는 않는데, 우측 상단의 ```다운로드``` 버튼을 클릭하고 잠시 기다리면 다운로드가 시작됩니다.
압축을 풀어보면, 두개의 폴더가 나타납니다.

![](.\readmeImages\directories.png)

2. ```mariadb-10.6.5-winx64``` 폴더 아래에 ```bin``` 폴더가 있습니다. 여기서 ```mariadbd.exe``` 파일을 찾아 더블클릭해서 실행합니다.
명령 프롬프트가 표시되는데, MariaDB가 실행중인 것입니다. 개발이 종료될 때까지 계속 실행시켜 두도록 합시다.

![](.\readmeImages\executed_mariadb.png)

3. ```HeidiSQL_11.3_64_Portable``` 폴더에는 MariaDB 클라이언트인 HeidiSQL이 들어있습니다.
DB 접속정보는 다 넣어두었으니, ```heidisql.exe``` 파일을 실행한 후, ```게시판DB```를 클릭하셔서 접속하시면 됩니다.
(HeidiSQL이 설치 후 복사와 이동이 자유롭기 때문에 고른것일 뿐, 익숙한 다른 클라이언트를 사용해도 무방합니다)

