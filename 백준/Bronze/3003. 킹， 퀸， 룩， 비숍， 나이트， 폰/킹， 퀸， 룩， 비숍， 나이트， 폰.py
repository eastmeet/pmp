# 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
king, queen, rook, bishop, knight, pawn = map(int, input().split())

def countKingQueen(object):
	num = 0
	if object == 1:
		return num

	while object != 1:
		if object > 1:
			object = object - 1
			num = num - 1
		else:
			object = object + 1
			num = num + 1
	return num


def countRookBishopKnight(object):
	num = 0
	if object == 2:
		return num
	while object != 2:
		if object > 2:
			object = object - 1
			num = num - 1
		else:
			object = object + 1
			num = num + 1
	return num


def countPawn(object):
	num = 0
	if object == 8:
		return num
	while object != 8:
		if object > 8:
			object = object - 1
			num = num - 1
		else:
			object = object + 1
			num = num + 1
	return num


print(countKingQueen(king), countKingQueen(queen), countRookBishopKnight(rook),
      countRookBishopKnight(bishop), countRookBishopKnight(knight),
      countPawn(pawn))
