package chess.domain.piece;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import chess.domain.RelativePosition;
import chess.domain.Team;

class QueenTest {

	@ParameterizedTest
	@DisplayName("퀸은 팀과 관계 없이 모든 방향으로 1칸 이동할 수 있다.")
	@CsvSource({"0,1","1,1","1,0","1,-1","0,-1","-1,-1","-1,0","-1,1"})
	void queenCanMoveEveryDirectionTest(int x, int y) {
		Random random = new Random();
		int randomMultiplier = random.nextInt(9) + 1;
		Queen whiteQueen = new Queen(Team.WHITE);
		Queen blackQueen = new Queen(Team.BLACK);
		RelativePosition relativePosition = new RelativePosition(randomMultiplier * x, randomMultiplier * y);

		assertTrue(whiteQueen.isMobile(relativePosition));
		assertTrue(blackQueen.isMobile(relativePosition));
	}
}
