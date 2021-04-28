# Seungmin
신승민 과제
1. 구현방법

fragment위에 recyclerview를 만든 뒤 fragment를 표시할 액티비티에서 fragmentcontainerview를 이용하여 fragment를 표시했습니다.
recyclerview를 만들고 데이터를 전달하기 위해서 viewholder와 adpater를 이용했습니다.

Fragment란?
부분화면으로 화면 반복의 비효율을 줄이고 재사용성을 높여주고 Activity보다 가볍기 때문에 여러모로 장점이 있습니다.
![image](https://user-images.githubusercontent.com/39687846/116413355-7fdf2280-a872-11eb-94c1-1dd824b69a3e.png)
위는 fragment를 구현한 코드인데 과제에서 recyclerview를 삽입하라고 했기 때문에 adapter를 이용해 recyclerview를 삽입한 것을 볼 수 있습니다.

![image](https://user-images.githubusercontent.com/39687846/116413945-0562d280-a873-11eb-8ad2-e734df37adc0.png)

위는 fragment의 xml 파일에 나타난 디자인입니다. 이 fragment를 원하는 액티비티 위에 띄우면 위와 같은 이미지가 액티비티 안에 원하는 위치에 삽입됩니다.

Recyclerview란?
카카오톡의 친구 목록처럼 일정한 형식의 뷰를 반복적으로 나타내는 것입니다. 이 때 viewholder와 adpater라는 개념이 필요한데 viewholder는 뷰의 요소들을 
관리하는 역할을 하고 adpater는 뷰에 들어있는 데이터를 viewholder로 감싸서 뷰에 나타내도록 하는 변환장치의 역할을 합니다. viewholder와 adpater를 구현한 부분입니다.
![image](https://user-images.githubusercontent.com/39687846/116414400-64c0e280-a873-11eb-9b87-fcfb1f08cb07.png)

이후에는 HomeActivity에서 fragment를 띄워야했기 때문에 fragment를 담을 fragmentcontainerview를 이용해 fragment를 담았고 more버튼을 누르면 fragment가 띄워지도록
해야했기 때문에 setOnClickedListner를 이용해 버튼을 누르면 리사이클러뷰가 뜨도록 구현했습니다.
