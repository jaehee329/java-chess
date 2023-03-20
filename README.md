# java-chess

체스 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)


## 구현 기능 목록

### 프로그램 진행
- [x] 'start'를 입력하여 게임을 시작할 수 있다.
- [x] 게임이 시작된 후 'move (position1) (position2)'를 입력해 말을 움직여 진행할 수 있다.
- [x] 언제든 'end'를 입력하여 게임을 종료할 수 있다.
- [x] 게임이 시작되지 않은 상황에서 말을 움직이려 하면 예외가 발생한다.

### 게임 진행
- [x] 게임은 백팀부터 시작하며 각 팀에 해당하는 말을 움직일 수 있다.
- [x] 나이트가 아닌 말은 이동 경로에 다른 말이 있다면 지나갈 수 없다.
- [x] 움직일 말의 목적지가 상대방 말의 위치라면 상대방 말을 없애고 그 자리를 대신한다.
- [x] 폰은 앞으로 한 칸 전진만 가능하다
    - [ ] 앞으로 전진하여 적을 잡을 수 없으며 앞쪽 대각선 한 칸에 적이 존재할 때만 대각선으로 이동해 말을 잡을 수 있다.
    - [x] 폰은 처음 이동 시에만 앞으로 두 칸 이동이 선택적으로 가능하다.
- [x] 룩은 직선으로 거리에 상관 없이 이동이 가능하다.
- [x] 나이트는 앞으로 두 칸 이동 후 좌 또는 우로 한 칸 이동이 가능하며 방해물을 뛰어넘을 수 있다.
- [x] 비숍은 대각선으로 거리에 상관 없이 이동이 가능하다.
- [x] 퀸은 직선 또는 대각선으로 거리에 상관 없이 이동이 가능하다.
- [x] 킹은 직선 또는 대각선으로 한 칸 이동이 가능하다.
