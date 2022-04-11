# MYCHELIN
> 식성이 비슷한 사람들과 정보를 공유하는 웹 SNS 서비스

## 기획의도
<img src="https://user-images.githubusercontent.com/68420164/147873040-c63dbac1-dcec-4f43-b1eb-6d250e22c353.png" width="50%" height="50%"><img src="https://user-images.githubusercontent.com/68420164/147873043-32cffce2-cbcb-4bdf-b932-defef02e0f68.png" width="50%" height="50%">

## 세부기능
|구분|기능|설명|비고|
|:---|:---|:---|:---|
|1|SNS 기능|피드 확인, 유저 팔로우, 글 작성, 회원 가입, 프로필 설정||
|2|음식점 검색 기능|이름으로 음식점 검색, 음식점 소개 및 영업 시간 등 정보 확인, 카카오 map으로 위치 확인, 음식점별 리뷰 및 별점 작성||
|3|맛집 리스트|여러 음식점을 하나로 묶어 나만의 맛집 리스트 생성||
|4|MFTI(My Food Type Indicator)|직접 제작한 설문을 통해 나의 음식 취향 확인||
|5|음식점 추천|나와 비슷한 MFTI를 가진 유저들의 평가를 통해 좋아할 만한 음식점 추천||

## 사용 예시
- 로그인 화면

<img src="https://user-images.githubusercontent.com/68420164/147873348-c4f83954-51c2-417f-852e-88ae8ef7d38d.png" width="240px" height="400px"><img src="https://user-images.githubusercontent.com/68420164/147873368-b3e8eef8-18fc-4a98-97f1-f2c6b2b9b24b.png" width="240px" height="400px"><img src="https://user-images.githubusercontent.com/68420164/147873372-5696cd17-cd68-4f0e-8957-0ac8838ed1b3.png" width="240px" height="400px">
```
- 사이트 접속시 화면. 로그인 버튼 클릭 시 로그인 화면으로 이동
- 로그인 화면
    1. 아이디와 비밀번호를 입력하고 로그인 시 메인 화면으로 이동
    2. 아이디가 없다면 '...회원이 아니신가요?' 클릭 시 회원가입 화면으로 이동
- 회원가입 화면
    1. 이메일 입력 후 버튼 클릭시 이메일로 인증번호 전송
    2. 메일 확인 후 인증번호 입력
    3. 정보 입력 후 가입 버튼 클릭 시 아이디 생성
    
```
- 메인 피드 화면 및 검색 기능

<img src="https://user-images.githubusercontent.com/68420164/147873647-6c359871-f59f-49d8-b6a0-3cc005a1990c.png" width="240px" height="400px"><img src="https://user-images.githubusercontent.com/68420164/147873649-3fa42020-c43e-4f48-a51b-3b43c58750e9.png" width="240px" height="400px"><img src="https://user-images.githubusercontent.com/68420164/147873651-826190c1-7ae3-46b1-b858-c471eaa7a855.png" width="240px" height="400px"><img src="https://user-images.githubusercontent.com/68420164/147873653-197040d0-cb68-4e0c-94f4-4009d74171af.png" width="240px" height="400px">
```
- 메인 피드 탭
    1. 홈버튼 클릭 시 메인 피드 화면으로 이동
    2. 검색버튼 클릭 시 키워드로 검색 가능(피드, 유저, 장소, 맛집리스트)
    3. 알림버튼 클릭 시 알림 확인(팔로우, 댓글, 좋아요 등)
- 검색(유저)
- 검색(장소)
- 알림
```
- 글 작성 탭

<img src="https://user-images.githubusercontent.com/68420164/147874530-0774509a-ec6b-43dc-8c3a-1a830f5a754e.png" width="240px" height="400px"><img src="https://user-images.githubusercontent.com/68420164/147874545-b337c942-a1a2-4df4-a962-fd15833e1c31.png" width="240px" height="400px"><img src="https://user-images.githubusercontent.com/68420164/147874563-a0a2a08d-3732-4766-a289-a00d7ae96ff9.png" width="240px" height="400px"><img src="https://user-images.githubusercontent.com/68420164/147874566-bb6da9e0-7844-4be3-86d6-6e650faf9258.png" width="240px" height="400px">
```
- 메인 화면
    1. 피드 탭
    2. 글 작성 탭
- 글 작성
    1. 맛집 리스트 태그
    2. 음식점 태그
    3. 사진 추가
- 음식점 태그. 검색을 통해 음식점을 태그 가능. 맛집 리스트도 같은 방식으로 태그
- 사진 추가. 갤러리에 있는 사진을 선택
```

- 음식점 추천 탭

<img src="https://user-images.githubusercontent.com/68420164/147874702-1d201ec5-cb4c-4615-9c48-1bea54ff0f31.png" width="240px" height="400px"><img src="https://user-images.githubusercontent.com/68420164/147874721-13ce1506-6a0b-4728-b6c1-1b60dedfb321.png" width="240px" height="400px">
```
- 메인 화면
    1. 음식점 추천 탭
- 음식점 추천 화면
    2. MFTI 설문 진행
```

- MFTI 설문

<img src="https://user-images.githubusercontent.com/68420164/147874757-c686d9b6-5bf1-4122-816a-988b32f8bf3e.png" width="240px" height="400px"><img src="https://user-images.githubusercontent.com/68420164/147874759-a58db808-7b9d-4404-8be1-f078e5701521.png" width="240px" height="400px"><img src="https://user-images.githubusercontent.com/68420164/147874761-727998c2-f041-471c-98f8-91db4d881a74.png" width="240px" height="400px">
```
- 추천 탭 클릭 시 내 MFTI가 없다면 MFTI 설문으로 이동
- 여러 문항에 대해 내게 맞는 답변을 고름
- 내 답변을 통해 나의 MFTI가 정해지고, 나와 비슷한 유저들이 좋게 평가한 음식점을 추천 받는다
```

- 프로필 탭

<img src="https://user-images.githubusercontent.com/68420164/147875508-3078d674-6a0d-4833-8996-01cc78fab8dd.png" width="240px" height="400px"><img src="https://user-images.githubusercontent.com/68420164/147875520-0209e6d7-bb64-4bc2-b166-f9cc918247e8.png" width="240px" height="400px"><img src="https://user-images.githubusercontent.com/68420164/147875522-8c9fb46a-114b-4afd-ab47-6473c5ec1953.png" width="240px" height="400px"><img src="https://user-images.githubusercontent.com/68420164/147875524-6b4faaff-5fa6-4b76-9d95-645f33b4eb4d.png" width="240px" height="400px">
```
- 메인 화면
    1. 프로필 탭
- 프로필 화면
    1. 북마크
    2. 프로필 설정
- 북마크(음식점, 맛집 리스트)
- 프로필 설정
    1. 정보 작성 후 수정 버튼 클릭 시 유저 정보 변경
    2. 로그아웃
    3. 회원탈퇴
```

- 음식점 상세 정보 화면

<img src="https://user-images.githubusercontent.com/68420164/147875603-21fa660d-41b6-4816-8584-016935cdcf30.png" width="240px" height="400px"><img src="https://user-images.githubusercontent.com/68420164/147875616-42e91ac2-8c87-462c-af50-6276dc6628d6.png" width="240px" height="150px">

```
- 음식점 상세 정보 (메인 페이지에서 검색, 피드에서 태그 클릭, 추천 페이지 등에서 이동 가능)
    1. 북마크 버튼. 클릭 시 북마크 저장. 내 프로필에서 확인 가능
    2. 리뷰. 사용자들이 남긴 리뷰를 볼 수 있음
    3. 리뷰 작성. 리뷰를 남길 수 있음
- 리뷰 작성 탭
```

- 맛집 리스트 화면

<img src="https://user-images.githubusercontent.com/68420164/147875717-3f65e596-1a7e-4244-8b38-fb03aef970e2.png" width="240px" height="400px"><img src="https://user-images.githubusercontent.com/68420164/147875718-5bd88a80-85bc-469c-8851-d5833a6d3866.png" width="240px" height="400px">

```
- 맛집 리스트 상세 정보 (메인 페이지에서 검색, 피드에서 태그 클릭, 추천 페이지 등에서 이동 가능)
    1. 북마크 버튼. 클릭 시 북마크 저장. 내 프로필에서 확인 가능
    2. 리스트에 속한 음식점 확인 가능. 클릭 시 상세페이지로 이동
    3. 맛집 리스트에 음식점 추가
- 리스트에 추가할 음식점 검색
```
## 기술 스택
![image](https://user-images.githubusercontent.com/68420164/147875790-06058c10-7978-4942-a90c-7aaa4034cbd0.png)


## 기여
1. 해당 프로젝트를 Fork 하세요
2. feature 브랜치를 생성하세요 (`git checkout -b feature/fooBar`)
3. 변경사항을 commit 하세요 (`git commit -am 'Add some fooBar'`)
4. 브랜치에 Push 하세요 (`git push origin feature/fooBar`)
5. 새로운 Merge Request를 요청하세요


# 개발 일정
## 1주(07.12 - 07.18)

### ✅ 기획

🔸 기획 의도 및 아이템 선정

🔸 필요 서비스 아이템 기획 회의

🔸 레퍼런스 조사

🔸 요구 명세서 설계

### ✅ 공통

🔸 원활한 소통 위한 슬랙, 노션 등의 채널 사용

### ✅ 프론트

🔸 개발 환경 설정

🔸 와이어 프레임 제작

### ✅ 백

🔸 개발 환경 설정

🔸 [ DB ] 요구 명세 기반 개념적 설계

## 2주(07.19 - 07.25)

### ✅ 공통

🔸 커밋 규약 세우기

### ✅디자인

🔸 프로토 타입 제작

### ✅ 프론트

🔸 뷰 및 컴포넌트 구현

### ✅ 백

🔸 [ DB ] 데이터베이스 구현, 맛집 데이터 스크래핑

🔸 [ 로그인 ] JWT 토큰

🔸

### ✅ 배포

🔸 서버 및 데이터베이스 AWS 배포

🔸 RestAPI 구현 시작

## 3주(07.26 - 08.01)

### ✅ 프론트

🔸[ 식당정보 상세 ] 페이지 라우팅, REST 통신

🔸[ 계정 설정 ] 개인정보 변경, 

🔸[ 포스트 ] 게시글 상세, 작성 UI 구현

🔸[ 팔로우 ] UI 구현

🔸[ 프로필 ] 프로필 페이지, 계정 설정 UI 구현

🔸[ 피드 ] 메인 피드 페이지 UI 구현

### ✅ 테스트 및 컨텐츠 제작 시작

🔸 사용자 계정 제작 및 글 업로드( 겸 테스트)

### ✅ 백

🔸 [ 피드 ] 최신 피드 가져오기, 

🔸 [ 팔로우 ] 팔로잉 신청, 수락 구현

🔸 [ 포스트 ] 게시글 상세, 댓글 삭제, (이미지-placeId-placelistId) null 처리, 반환 타입 추가 

🔸 [ 장소 ] 식당 이름, 지역으로 검색 구현, 식당 정보 수정 기능 구현, 

🔸 [ 맛집 리스트 ] 리스트 생성, 삭제, 추가 기능 구현

🔸 [ 프로필 ] 유저 프로필 불러오기, 유저 별 작성한 포스팅

## 4주(08.02 - 08.08)

### ✅ 프론트

🔸 서버 통신 연결 및 디테일 수정

    🔸 [ 리뷰 ] 상세 페이지

    🔸 [ 회원 정보 ] 회원 탈퇴, 비밀번호 변경, 프로필 사진 변경, 정보 수정

    🔸 [ 회원 가입 ] 이메일 인증 구현

    🔸 [ 포스트 ] 수정, 삭제, 장소 및 리스트 태그 달기, 댓글 작성 및 삭제, 좋아요 기능

    🔸 [ 장소 ]  운영 시간 추가, 카카오 지도 API 추가, 리뷰 수정 및 삭제

    🔸 [ 북마크 ] 저장한 장소, 맛집 리스트 보여주기

### ✅ 백

🔸 [ refactoring ] 응답 타입 클래스 생성으로 중복 코드 정리.

🔸 Controller 전반에 걸친 기능 추가 수정

    🔸 [ 이미지 호스팅 ] 이미지 업로드 서버와 URL 반환

    🔸 [ 맛집 ] 현재 위치 기준으로 맛집 리스트 검색 구현

    🔸 [ 맛집 리스트 ] 유저가 참여한 리스트 가져오기

    🔸 [ 회원 가입 ] 이메일 인증 기능, 마지막 토큰으로 인증

    🔸 [ 팔로우 ] 유저 팔로우 / 팔로잉 목록 가져오기, 요청받은 목록 확인

    🔸 [ 북마크 ] 장소와 맛집 리스트 찜하기, 찜 해제 구현

    🔸 [ 포스트 ] 게시글 좋아요, 취소 구현

### ✅ 공통

🔸 입맛 분류 및 식당 선호 유형 분류 문항 제작 및 1차 검증
