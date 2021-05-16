# Seungmin
신승민 과제4

서버 통신을 통해 로그인과 회원가입을 구현해보았습니다. 먼저 포스트맨에서 회원가입을 테스트해보았습니다.
![image](https://user-images.githubusercontent.com/39687846/118382456-ce413f00-b630-11eb-97bb-6298351bf7c5.png)

이 때 가입한 아이디와 비밀번호를 통해 로그인을 테스트해보았습니다.
![image](https://user-images.githubusercontent.com/39687846/118382478-fb8ded00-b630-11eb-829c-96267e3c07dc.png)

서버 통신을 위해서 SoptService(로그인구현)와 SignupService(회원가입구현)라는 인터페이스를 구현했습니다.
또한 응답과 요청에 대한 객체를 만들기 위해 RequestLogindata, RequestSignupdata, ResponseLogindata, ResponseSignupData를 
data class로 만들었습니다. 인터페이스 구현체를 만들어 주기 위해 ServiceCreator를 만들었고, 이는 로그인과 회원가입 등 여러 서버 통신을
하나의 구현체로 해결할 수 있습니다. 그 이후 서버 통신을 하고자하는 activity 파일에 가서 callback을 등록해줍니다. 예를 들어 로그인 기능의 경우
로그인 버튼을 눌렀을 때 서버 통신이 되어야 하므로 버튼 클릭 리스너 안에 callback 연결하는 코드를 작성해줍니다.
아까 포스트맨에서 등록한 아이디와 비밀번호를 통해 직접 구현한 앱에서 로그인을 해보았습니다.

![image](https://user-images.githubusercontent.com/39687846/118382684-b5d22400-b632-11eb-8773-4a2cddcd6ae2.png)

로그인 버튼을 누르면 다음과 같이 homeactivity로 이동하는 것을 볼 수 있습니다.

![image](https://user-images.githubusercontent.com/39687846/118382698-d9956a00-b632-11eb-87e4-c4129a10b57e.png)

만약 로그인의 실패할 경우 toastmessage를 띄우도록 했습니다.

![image](https://user-images.githubusercontent.com/39687846/118382713-fe89dd00-b632-11eb-96ca-888c9b6add52.png)

다음은 앱에서 회원가입을 해보겠습니다. 

![image](https://user-images.githubusercontent.com/39687846/118382735-53c5ee80-b633-11eb-8940-61ffcc9fcffc.png)

방금 회원가입한 정보로 로그인을 한 모습입니다.

![image](https://user-images.githubusercontent.com/39687846/118382756-7952f800-b633-11eb-985c-b103db33eff3.png)

만약 회원가입이 제대로 진행되지 않으면 다음과 같이 토스트 메시지가 출력됩니다.

![image](https://user-images.githubusercontent.com/39687846/118382779-a4d5e280-b633-11eb-9555-7d025ba0b1e4.png)
